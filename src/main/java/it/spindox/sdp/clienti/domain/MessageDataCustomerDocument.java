package it.spindox.sdp.clienti.domain;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

/**
 * 
 */
@ApiModel(description = "")

public class MessageDataCustomerDocument implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2199246601336768656L;

	@JsonProperty("tipo")
	private String tipo = null;

	@JsonProperty("numero")
	private String numero = null;

	@JsonProperty("rilasciatoDa")
	private String rilasciatoDa = null;

	@JsonProperty("dataRilascio")
	private String dataRilascio = null;

	@JsonProperty("dataScadenza")
	private String dataScadenza = null;

	@JsonProperty("provinciaRilascio")
	private String provinciaRilascio = null;

	@JsonProperty("comuneRilascio")
	private String comuneRilascio = null;

	public MessageDataCustomerDocument(){
		super();
	}
	
	public MessageDataCustomerDocument tipo(String tipo) {
		this.tipo = tipo;
		return this;
	}

	/**
	 * Tipologia di documento del Cliente (carta d'identita, passaporto,
	 * patente...)
	 * 
	 * @return tipo
	 **/
	@ApiModelProperty(value = "Tipologia di documento del Cliente (carta d'identita, passaporto, patente...)")
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public MessageDataCustomerDocument numero(String numero) {
		this.numero = numero;
		return this;
	}

	/**
	 * Get numero
	 * 
	 * @return numero
	 **/
	@ApiModelProperty(value = "")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public MessageDataCustomerDocument rilasciatoDa(String rilasciatoDa) {
		this.rilasciatoDa = rilasciatoDa;
		return this;
	}

	/**
	 * Ente che ha rilasciato il documento fornito dal cliente
	 * 
	 * @return rilasciatoDa
	 **/
	@ApiModelProperty(value = "Ente che ha rilasciato il documento fornito dal cliente")
	public String getRilasciatoDa() {
		return rilasciatoDa;
	}

	public void setRilasciatoDa(String rilasciatoDa) {
		this.rilasciatoDa = rilasciatoDa;
	}

	public MessageDataCustomerDocument dataRilascio(String dataRilascio) {
		this.dataRilascio = dataRilascio;
		return this;
	}

	/**
	 * Get dataRilascio
	 * 
	 * @return dataRilascio
	 **/
	@ApiModelProperty(example = "2010-12-10", value = "")
	@Valid
	public String getDataRilascio() {
		return dataRilascio;
	}

	public void setDataRilascio(String dataRilascio) {
		this.dataRilascio = dataRilascio;
	}

	public MessageDataCustomerDocument dataScadenza(String dataScadenza) {
		this.dataScadenza = dataScadenza;
		return this;
	}

	/**
	 * Get dataScadenza
	 * 
	 * @return dataScadenza
	 **/
	@ApiModelProperty(example = "2020-12-10", value = "")
	@Valid
	public String getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(String dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public MessageDataCustomerDocument provinciaRilascio(String provinciaRilascio) {
		this.provinciaRilascio = provinciaRilascio;
		return this;
	}

	/**
	 * Get provinciaRilascio
	 * 
	 * @return provinciaRilascio
	 **/
	@ApiModelProperty(value = "")
	public String getProvinciaRilascio() {
		return provinciaRilascio;
	}

	public void setProvinciaRilascio(String provinciaRilascio) {
		this.provinciaRilascio = provinciaRilascio;
	}

	public MessageDataCustomerDocument comuneRilascio(String comuneRilascio) {
		this.comuneRilascio = comuneRilascio;
		return this;
	}

	/**
	 * Get comuneRilascio
	 * 
	 * @return comuneRilascio
	 **/
	@ApiModelProperty(value = "")
	public String getComuneRilascio() {
		return comuneRilascio;
	}

	public void setComuneRilascio(String comuneRilascio) {
		this.comuneRilascio = comuneRilascio;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MessageDataCustomerDocument messageDataCustomerDocument = (MessageDataCustomerDocument) o;
		return Objects.equals(this.tipo, messageDataCustomerDocument.tipo)
				&& Objects.equals(this.numero, messageDataCustomerDocument.numero)
				&& Objects.equals(this.rilasciatoDa, messageDataCustomerDocument.rilasciatoDa)
				&& Objects.equals(this.dataRilascio, messageDataCustomerDocument.dataRilascio)
				&& Objects.equals(this.dataScadenza, messageDataCustomerDocument.dataScadenza)
				&& Objects.equals(this.provinciaRilascio, messageDataCustomerDocument.provinciaRilascio)
				&& Objects.equals(this.comuneRilascio, messageDataCustomerDocument.comuneRilascio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tipo, numero, rilasciatoDa, dataRilascio, dataScadenza, provinciaRilascio, comuneRilascio);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessageDataCustomerDocument {\n");

		sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
		sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
		sb.append("    rilasciatoDa: ").append(toIndentedString(rilasciatoDa)).append("\n");
		sb.append("    dataRilascio: ").append(toIndentedString(dataRilascio)).append("\n");
		sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
		sb.append("    provinciaRilascio: ").append(toIndentedString(provinciaRilascio)).append("\n");
		sb.append("    comuneRilascio: ").append(toIndentedString(comuneRilascio)).append("\n");
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
