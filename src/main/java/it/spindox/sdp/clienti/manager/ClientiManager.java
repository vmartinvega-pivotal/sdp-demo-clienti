package it.spindox.sdp.clienti.manager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import it.spindox.sdp.clienti.config.IntegrationConfig.ClientiGateway;
import it.spindox.sdp.clienti.domain.Clienti;
import it.spindox.sdp.clienti.domain.MessageCliente;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//import it.spindox.sdp.clienti.config.IntegrationConfig.ClientiGateway;

@Service
public class ClientiManager {
	private static final Logger log = LogManager.getLogger(ClientiManager.class);
	
//	@Autowired
//	@Qualifier("gemfireCache")
//	ClientCacheFactoryBean gemfireCache;
		
//	@Autowired
//	@Qualifier("clientiRegionFactory")
//	ClientRegionFactoryBean<String, Clienti> clientiRegionFactory;
	
//  ClientCache cache = (ClientCache) gemfireCache.getObject();
//  Region<String, Clienti> regionClienti = clientiRegionFactory.getObject();
	
//	@Autowired(required = false)
//    private ClientRepository clientRepository;
	
	private static Map<String, Clienti> mappaClienti = new HashMap<>();
	
	@Autowired
    protected ClientiGateway clientiGateway;
	
	public void sendMessageClientiToRabbit(MessageCliente input) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JodaModule());
		String payload = mapper.writeValueAsString(input);
		log.info("Payload: {}", payload);
		clientiGateway.sendToRabbit(payload);

		log.info("Sending message to rabbit");
		mappaClienti.put(input.getData().getId(), input.getData());
	}
	
	
	public Clienti findCliente(String rifCliente){
		//return clientRepository.findOne(rifCliente);
		return mappaClienti.get(rifCliente);
	}
	
	
	public void deleteCliente(String id){
		//clientRepository.delete(id);
	}

}
