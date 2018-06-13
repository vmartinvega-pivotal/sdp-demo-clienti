package it.spindox.sdp.clienti.dto;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import it.spindox.sdp.clienti.api.controller.ClientiApiController;
import it.spindox.sdp.clienti.domain.Clienti;
import it.spindox.sdp.clienti.domain.MessageDataCustomerContact;
import it.spindox.sdp.clienti.domain.MessageDataCustomerDocument;
import it.spindox.sdp.clienti.domain.MessageDataCustomerProfile;


@JsonPropertyOrder({ 
	"id", 
	"rifCliente", 
	"tiid",
	"customerContact",
	"customerProfile",
	"customerDocument"})
public class ClientiResource extends ResourceSupport {
	
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("rifCliente")
	private String rifCliente = null;

	@JsonProperty("tiid")
	private String tiid = null;

	@JsonProperty("customerContact")
	private MessageDataCustomerContact customerContact = null;
	
	@JsonProperty("customerProfile")
	private MessageDataCustomerProfile customerProfile = null;

	@JsonProperty("customerDocument")
	private MessageDataCustomerDocument customerDocument = null;
	
	public ClientiResource(Clienti cliente){
		//
		super();
		this.id = cliente.getId();
		this.tiid = cliente.getTiid();
		this.rifCliente = cliente.getRifCliente();
		this.customerContact = cliente.getCustomerContact();
		this.customerProfile = cliente.getCustomerProfile();
		this.customerDocument = cliente.getCustomerDocument();
		//
		addLinks(cliente);
	}

	private void addLinks(Clienti cliente) {
		//
		this.add(linkTo(methodOn(ClientiApiController.class).clientiRifClienteGet(cliente.getId())).withSelfRel());
	}
	
}
