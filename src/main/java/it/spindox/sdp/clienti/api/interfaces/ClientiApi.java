package it.spindox.sdp.clienti.api.interfaces;

import io.swagger.annotations.*;
import it.spindox.sdp.clienti.domain.Clienti;
import it.spindox.sdp.clienti.domain.MessageCliente;
import it.spindox.sdp.clienti.dto.ClientiResource;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Api(value = "clienti", description = "the clienti API")
public interface ClientiApi {

	/**
	 * SOUTHBOUND
	 * @param input
	 * @return
	 */
    @ApiOperation(value = "", notes = "Crea un nuovo ordine per uno specifico cliente sottomesso da Digital Channel via SDP", response = Void.class, tags={ "clienti", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Pubblicazione evento effettuata con successo.", response = Void.class),
        @ApiResponse(code = 500, message = "La pubblicazione dell'evento non è andata a buon fine", response = Void.class) })
    
    @RequestMapping(value = "/sdp/clienti", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Void> clientiPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody MessageCliente input);
    
    
    /**
     * 
     * @param id
     * @return
     */
    @ApiOperation(value = "", notes = "Servizio che consente la cancellazione di un entita Cliente", response = Clienti.class, tags={ "clienti", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Cancellazione cliente effettuata con successo.", response = Void.class),
        @ApiResponse(code = 500, message = "La richiesta  non è andata a buon fine", response = Void.class) })
    
    @RequestMapping(value = "/sdp/clienti/{id}", method = RequestMethod.DELETE)
    ResponseEntity<Void> clientiDelete(@ApiParam(value="Codice fiscale o PIVA del cliente", required=true ) @PathVariable("id") String id);
    
    
    /**
     * 
     * @param id
     * @return
     */
    @ApiOperation(value = "", notes = "Restituisce l’anagrafica di uno specifico cliente (dove ID rappresenta codice fiscale o piva)", response = Clienti.class, tags={ "clienti", })
    @ApiResponses(value = { 
    		@ApiResponse(code = 200, message = "Recupero cliente effettuato con successo.", response = Clienti.class),
    		@ApiResponse(code = 500, message = "La richiesta non è andata a buon fine", response = Void.class) })
    
    @RequestMapping(value = "/clienti/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ClientiResource> clientiRifClienteGet(@ApiParam(value="Codice fiscale o PIVA del cliente", required=true ) @PathVariable("id") String id);
           
}
