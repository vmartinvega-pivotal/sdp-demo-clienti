package it.spindox.sdp.clienti.dto;

import it.spindox.sdp.clienti.domain.MessageDataCustomerContact;
import it.spindox.sdp.clienti.domain.MessageDataCustomerDocument;
import it.spindox.sdp.clienti.domain.MessageDataCustomerProfile;

/*****************************************
*        Interfaccia SDPClienti          *
******************************************/
public interface SDPClienti {
	String getId();
	String getTiid();
	String getRifCliente();
	MessageDataCustomerContact getCustomerContact();
	MessageDataCustomerProfile getCustomerProfile();
	MessageDataCustomerDocument getCustomerDocument();
}
