package it.spindox.sdp.clienti.repository;

import org.springframework.data.gemfire.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.spindox.sdp.clienti.domain.Clienti;
import it.spindox.sdp.clienti.domain.MessageDataCustomerDocument;

public interface ClientRepository extends CrudRepository<Clienti, String> {

	Clienti findByRifCliente(String cf);
	
	@Query(value = "SELECT cr.customerDocument FROM /Clienti cr WHERE cr.rifCliente = $1")
	MessageDataCustomerDocument findDocument(String rifCliente);


}
