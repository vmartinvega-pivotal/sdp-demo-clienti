package it.spindox.sdp.clienti.api.controller;

import io.swagger.annotations.*;
import it.spindox.sdp.clienti.api.interfaces.ClientiApi;
import it.spindox.sdp.clienti.domain.Clienti;
import it.spindox.sdp.clienti.domain.MessageCliente;
import it.spindox.sdp.clienti.dto.ClientiResource;
import it.spindox.sdp.clienti.manager.ClientiManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Map;
import java.util.TreeMap;

import javax.validation.Valid;

@Controller
public class ClientiApiController implements ClientiApi {
	
	private static final Logger log = LogManager.getLogger(ClientiApiController.class);
	
	@Autowired
    protected Environment env;
	
	@Autowired
    protected ClientiManager clientiManager;
	
	@Value("${hateoas.ordini.all.path}")
    private String ordiniAllPath;
	
	@Value("${hateoas.consistenze.all.path}")
	private String consistAllPath;
	
	@Value("${hateoas.fatture.all.path}")
	private String fattureAllPath;
	
	@RequestMapping("/env")
	@ResponseBody
	public Map<String,String> env() {
		//
		Map<String,String> map  = new TreeMap<>(); 
	    for (Map.Entry<String, String> envvar : System.getenv().entrySet()) {
	        map.put(envvar.getKey(), envvar.getValue());
	    }
	    return map;
	}
	
	@Override
	public ResponseEntity<Void> clientiPost(@ApiParam(value = "" ,required=true ) @Valid @RequestBody MessageCliente input) {
		//
		log.info("Sending message to rabbit");
		try {
			clientiManager.sendMessageClientiToRabbit(input);
			return ResponseEntity.ok().build();
		} catch (JsonProcessingException ex) {
			log.error(ex.getMessage());
			return ResponseEntity.status(500).build();
		}
	}

	@Override
	public ResponseEntity<ClientiResource> clientiRifClienteGet(@ApiParam(value="Codice fiscale o PIVA del cliente", required=true ) @PathVariable("id") String id) {
		//
		Clienti cliente = clientiManager.findCliente(id);
		if (cliente != null){
			ClientiResource dto = new ClientiResource(cliente);
			dto.add(new Link(ordiniAllPath + cliente.getRifCliente()).withRel("allOrdini"));
			dto.add(new Link(consistAllPath + cliente.getRifCliente()).withRel("allConsistenze"));
			dto.add(new Link(fattureAllPath + cliente.getRifCliente()).withRel("allFatture"));
			return new ResponseEntity<>(dto, HttpStatus.OK);
		} else {
			return ResponseEntity.notFound().build();
		}
	}


	@Override
	public ResponseEntity<Void> clientiDelete(@PathVariable("id") String id) {
		clientiManager.deleteCliente(id);
		return ResponseEntity.ok().build();
	}
	
}
