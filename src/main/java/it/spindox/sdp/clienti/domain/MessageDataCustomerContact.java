package it.spindox.sdp.clienti.domain;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contatto di un cliente
 */
@ApiModel(description = "Contatto di un cliente")

public class MessageDataCustomerContact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1219615162536449041L;

	@JsonProperty("indirizzoEmail")
	private String indirizzoEmail = null;

	@JsonProperty("altroIndirizzo")
	private String altroIndirizzo = null;

	@JsonProperty("recapitoTelefonicoPrefisso")
	private String recapitoTelefonicoPrefisso = null;

	@JsonProperty("recapitoTelefonicoNumero")
	private String recapitoTelefonicoNumero = null;

	@JsonProperty("altroRecapitoPrefisso")
	private String altroRecapitoPrefisso = null;

	@JsonProperty("altroRecapitoNumero")
	private String altroRecapitoNumero = null;

	@JsonProperty("faxPrefisso")
	private String faxPrefisso = null;

	@JsonProperty("faxNumero")
	private String faxNumero = null;

	public MessageDataCustomerContact() {
		super();
	}

	public MessageDataCustomerContact indirizzoEmail(String indirizzoEmail) {
		this.indirizzoEmail = indirizzoEmail;
		return this;
	}

	/**
	 * Get indirizzoEmail
	 * 
	 * @return indirizzoEmail
	 **/
	@ApiModelProperty(value = "")
	public String getIndirizzoEmail() {
		return indirizzoEmail;
	}

	public void setIndirizzoEmail(String indirizzoEmail) {
		this.indirizzoEmail = indirizzoEmail;
	}

	public MessageDataCustomerContact altroIndirizzo(String altroIndirizzo) {
		this.altroIndirizzo = altroIndirizzo;
		return this;
	}

	/**
	 * Get altroIndirizzo
	 * 
	 * @return altroIndirizzo
	 **/
	@ApiModelProperty(value = "")
	public String getAltroIndirizzo() {
		return altroIndirizzo;
	}

	public void setAltroIndirizzo(String altroIndirizzo) {
		this.altroIndirizzo = altroIndirizzo;
	}

	public MessageDataCustomerContact recapitoTelefonicoPrefisso(String recapitoTelefonicoPrefisso) {
		this.recapitoTelefonicoPrefisso = recapitoTelefonicoPrefisso;
		return this;
	}

	/**
	 * Get recapitoTelefonicoPrefisso
	 * 
	 * @return recapitoTelefonicoPrefisso
	 **/
	@ApiModelProperty(value = "")
	public String getRecapitoTelefonicoPrefisso() {
		return recapitoTelefonicoPrefisso;
	}

	public void setRecapitoTelefonicoPrefisso(String recapitoTelefonicoPrefisso) {
		this.recapitoTelefonicoPrefisso = recapitoTelefonicoPrefisso;
	}

	public MessageDataCustomerContact recapitoTelefonicoNumero(String recapitoTelefonicoNumero) {
		this.recapitoTelefonicoNumero = recapitoTelefonicoNumero;
		return this;
	}

	/**
	 * Get recapitoTelefonicoNumero
	 * 
	 * @return recapitoTelefonicoNumero
	 **/
	@ApiModelProperty(value = "")
	public String getRecapitoTelefonicoNumero() {
		return recapitoTelefonicoNumero;
	}

	public void setRecapitoTelefonicoNumero(String recapitoTelefonicoNumero) {
		this.recapitoTelefonicoNumero = recapitoTelefonicoNumero;
	}

	public MessageDataCustomerContact altroRecapitoPrefisso(String altroRecapitoPrefisso) {
		this.altroRecapitoPrefisso = altroRecapitoPrefisso;
		return this;
	}

	/**
	 * Get altroRecapitoPrefisso
	 * 
	 * @return altroRecapitoPrefisso
	 **/
	@ApiModelProperty(value = "")
	public String getAltroRecapitoPrefisso() {
		return altroRecapitoPrefisso;
	}

	public void setAltroRecapitoPrefisso(String altroRecapitoPrefisso) {
		this.altroRecapitoPrefisso = altroRecapitoPrefisso;
	}

	public MessageDataCustomerContact altroRecapitoNumero(String altroRecapitoNumero) {
		this.altroRecapitoNumero = altroRecapitoNumero;
		return this;
	}

	/**
	 * Get altroRecapitoNumero
	 * 
	 * @return altroRecapitoNumero
	 **/
	@ApiModelProperty(value = "")
	public String getAltroRecapitoNumero() {
		return altroRecapitoNumero;
	}

	public void setAltroRecapitoNumero(String altroRecapitoNumero) {
		this.altroRecapitoNumero = altroRecapitoNumero;
	}

	public MessageDataCustomerContact faxPrefisso(String faxPrefisso) {
		this.faxPrefisso = faxPrefisso;
		return this;
	}

	/**
	 * Get faxPrefisso
	 * 
	 * @return faxPrefisso
	 **/
	@ApiModelProperty(value = "")
	public String getFaxPrefisso() {
		return faxPrefisso;
	}

	public void setFaxPrefisso(String faxPrefisso) {
		this.faxPrefisso = faxPrefisso;
	}

	public MessageDataCustomerContact faxNumero(String faxNumero) {
		this.faxNumero = faxNumero;
		return this;
	}

	/**
	 * Get faxNumero
	 * 
	 * @return faxNumero
	 **/
	@ApiModelProperty(value = "")
	public String getFaxNumero() {
		return faxNumero;
	}

	public void setFaxNumero(String faxNumero) {
		this.faxNumero = faxNumero;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MessageDataCustomerContact messageDataCustomerContact = (MessageDataCustomerContact) o;
		return Objects.equals(this.indirizzoEmail, messageDataCustomerContact.indirizzoEmail)
				&& Objects.equals(this.altroIndirizzo, messageDataCustomerContact.altroIndirizzo)
				&& Objects.equals(this.recapitoTelefonicoPrefisso,
						messageDataCustomerContact.recapitoTelefonicoPrefisso)
				&& Objects.equals(this.recapitoTelefonicoNumero, messageDataCustomerContact.recapitoTelefonicoNumero)
				&& Objects.equals(this.altroRecapitoPrefisso, messageDataCustomerContact.altroRecapitoPrefisso)
				&& Objects.equals(this.altroRecapitoNumero, messageDataCustomerContact.altroRecapitoNumero)
				&& Objects.equals(this.faxPrefisso, messageDataCustomerContact.faxPrefisso)
				&& Objects.equals(this.faxNumero, messageDataCustomerContact.faxNumero);
	}

	@Override
	public int hashCode() {
		return Objects.hash(indirizzoEmail, altroIndirizzo, recapitoTelefonicoPrefisso, recapitoTelefonicoNumero,
				altroRecapitoPrefisso, altroRecapitoNumero, faxPrefisso, faxNumero);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessageDataCustomerContact {\n");

		sb.append("    indirizzoEmail: ").append(toIndentedString(indirizzoEmail)).append("\n");
		sb.append("    altroIndirizzo: ").append(toIndentedString(altroIndirizzo)).append("\n");
		sb.append("    recapitoTelefonicoPrefisso: ").append(toIndentedString(recapitoTelefonicoPrefisso)).append("\n");
		sb.append("    recapitoTelefonicoNumero: ").append(toIndentedString(recapitoTelefonicoNumero)).append("\n");
		sb.append("    altroRecapitoPrefisso: ").append(toIndentedString(altroRecapitoPrefisso)).append("\n");
		sb.append("    altroRecapitoNumero: ").append(toIndentedString(altroRecapitoNumero)).append("\n");
		sb.append("    faxPrefisso: ").append(toIndentedString(faxPrefisso)).append("\n");
		sb.append("    faxNumero: ").append(toIndentedString(faxNumero)).append("\n");
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
