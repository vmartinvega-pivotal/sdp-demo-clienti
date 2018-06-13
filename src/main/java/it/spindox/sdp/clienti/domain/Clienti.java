package it.spindox.sdp.clienti.domain;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.spindox.sdp.clienti.dto.SDPClienti;

import javax.validation.Valid;
import javax.validation.constraints.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

/**
 * data
 */
@ApiModel(description = "data")
//@Document(collection = "clienti")
//@Region("Clienti")
public class Clienti implements Serializable, SDPClienti {

	private static final long serialVersionUID = 3734937081684228017L;

	@Id
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
	
	public Clienti() {
		super();
	}

	public Clienti id(String id) {
		this.id = id;
		return this;
	}

	@PersistenceConstructor
	public Clienti(String id, String rifCliente, String tiid) {
		super();
		this.id = id;
		this.rifCliente = rifCliente;
		this.tiid = tiid;
	}

	/**
	 * identificativo unico del cliente (coincide con *tiid*)
	 * 
	 * @return id
	 **/
	@ApiModelProperty(example = "123456789", required = true, value = "identificativo unico del cliente (coincide con *tiid*)")
	@NotNull
	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Clienti codiceFiscale(String rifCliente) {
		this.rifCliente = rifCliente;
		return this;
	}

	/**
	 * codice fiscale del cliente
	 * 
	 * @return codiceFiscale
	 **/
	@ApiModelProperty(example = "LCRMRC87F38E534S", required = true, value = "codice fiscale del cliente")
	@NotNull
	@Override
	public String getRifCliente() {
		return rifCliente;
	}

	public void setRifCliente(String codiceFiscale) {
		this.rifCliente = codiceFiscale;
	}

	public Clienti tiid(String tiid) {
		this.tiid = tiid;
		return this;
	}

	/**
	 * identificativo unico del cliente (coincide con *id*)
	 * 
	 * @return tiid
	 **/
	@ApiModelProperty(example = "123456789", value = "identificativo unico del cliente (coincide con *id*)")
	@Override
	public String getTiid() {
		return tiid;
	}

	public void setTiid(String tiid) {
		this.tiid = tiid;
	}

	public Clienti customerProfile(MessageDataCustomerProfile customerProfile) {
		this.customerProfile = customerProfile;
		return this;
	}

	/**
	 * Get customerProfile
	 * 
	 * @return customerProfile
	 **/
	@ApiModelProperty(value = "")
	@Valid
	@Override
	public MessageDataCustomerProfile getCustomerProfile() {
		return customerProfile;
	}

	public void setCustomerProfile(MessageDataCustomerProfile customerProfile) {
		this.customerProfile = customerProfile;
	}

	public Clienti customerContact(MessageDataCustomerContact customerContact) {
		this.customerContact = customerContact;
		return this;
	}

	/**
	 * Get customerContact
	 * 
	 * @return customerContact
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public MessageDataCustomerContact getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(MessageDataCustomerContact customerContact) {
		this.customerContact = customerContact;
	}

	public Clienti customerDocument(MessageDataCustomerDocument customerDocument) {
		this.customerDocument = customerDocument;
		return this;
	}

	/**
	 * Get customerDocument
	 * 
	 * @return customerDocument
	 **/
	@ApiModelProperty(value = "")
	@Valid
	@Override
	public MessageDataCustomerDocument getCustomerDocument() {
		return customerDocument;
	}

	public void setCustomerDocument(MessageDataCustomerDocument customerDocument) {
		this.customerDocument = customerDocument;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Clienti messageData = (Clienti) o;
		return Objects.equals(this.id, messageData.id) && Objects.equals(this.rifCliente, messageData.rifCliente)
				&& Objects.equals(this.tiid, messageData.tiid)
				&& Objects.equals(this.customerContact, messageData.customerContact)
				&& Objects.equals(this.customerProfile, messageData.customerProfile)
				&& Objects.equals(this.customerDocument, messageData.customerDocument);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, rifCliente, tiid, customerContact, customerProfile, customerDocument);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessageData {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    codiceFiscale: ").append(toIndentedString(rifCliente)).append("\n");
		sb.append("    tiid: ").append(toIndentedString(tiid)).append("\n");
		sb.append("    customerContact: ").append(toIndentedString(customerContact)).append("\n");
		sb.append("    customerProfile: ").append(toIndentedString(customerProfile)).append("\n");
		sb.append("    customerDocument: ").append(toIndentedString(customerDocument)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
