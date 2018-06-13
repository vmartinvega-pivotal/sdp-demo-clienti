package it.spindox.sdp.clienti.domain;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

/**
 * customer_profile
 */
@ApiModel(description = "customer_profile")

public class MessageDataCustomerProfile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3792736994517052365L;

	@JsonProperty("codiceAcli")
	private String codiceAcli = null;

	@JsonProperty("partitaIva")
	private String partitaIva = null;

	@JsonProperty("stato")
	private String stato = null;

	@JsonProperty("cognome")
	private String cognome = null;

	@JsonProperty("nome")
	private String nome = null;

	@JsonProperty("dataNascita")
	private String dataNascita = null;

	@JsonProperty("comuneNascita")
	private String comuneNascita = null;

	@JsonProperty("provinciaNascita")
	private String provinciaNascita = null;

	@JsonProperty("sesso")
	private String sesso = null;

	@JsonProperty("titolo")
	private String titolo = null;

	@JsonProperty("specializzazione")
	private String specializzazione = null;

	public MessageDataCustomerProfile() {
		super();
	}
	
	public MessageDataCustomerProfile codiceAcli(String codiceAcli) {
		this.codiceAcli = codiceAcli;
		return this;
	}

	/**
	 * Identificativo unico del cliente certificato da ACLI
	 * 
	 * @return codiceAcli
	 **/
	@ApiModelProperty(value = "Identificativo unico del cliente certificato da ACLI")
	public String getCodiceAcli() {
		return codiceAcli;
	}

	public void setCodiceAcli(String codiceAcli) {
		this.codiceAcli = codiceAcli;
	}

	public MessageDataCustomerProfile partitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
		return this;
	}

	/**
	 * partita iva
	 * 
	 * @return partitaIva
	 **/
	@ApiModelProperty(value = "partita iva")
	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public MessageDataCustomerProfile stato(String stato) {
		this.stato = stato;
		return this;
	}

	/**
	 * stato del cliente
	 * 
	 * @return stato
	 **/
	@ApiModelProperty(value = "stato del cliente")
	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public MessageDataCustomerProfile cognome(String cognome) {
		this.cognome = cognome;
		return this;
	}

	/**
	 * Get cognome
	 * 
	 * @return cognome
	 **/
	@ApiModelProperty(value = "")
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public MessageDataCustomerProfile nome(String nome) {
		this.nome = nome;
		return this;
	}

	/**
	 * Get nome
	 * 
	 * @return nome
	 **/
	@ApiModelProperty(value = "")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public MessageDataCustomerProfile dataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
		return this;
	}

	/**
	 * Get dataNascita
	 * 
	 * @return dataNascita
	 **/
	@ApiModelProperty(example = "1990-12-10", value = "")
	@Valid
	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public MessageDataCustomerProfile comuneNascita(String comuneNascita) {
		this.comuneNascita = comuneNascita;
		return this;
	}

	/**
	 * Get comuneNascita
	 * 
	 * @return comuneNascita
	 **/
	@ApiModelProperty(value = "")
	public String getComuneNascita() {
		return comuneNascita;
	}

	public void setComuneNascita(String comuneNascita) {
		this.comuneNascita = comuneNascita;
	}

	public MessageDataCustomerProfile provinciaNascita(String provinciaNascita) {
		this.provinciaNascita = provinciaNascita;
		return this;
	}

	/**
	 * Get provinciaNascita
	 * 
	 * @return provinciaNascita
	 **/
	@ApiModelProperty(value = "")
	public String getProvinciaNascita() {
		return provinciaNascita;
	}

	public void setProvinciaNascita(String provinciaNascita) {
		this.provinciaNascita = provinciaNascita;
	}

	public MessageDataCustomerProfile sesso(String sesso) {
		this.sesso = sesso;
		return this;
	}

	/**
	 * Sesso del Cliente
	 * 
	 * @return sesso
	 **/
	@ApiModelProperty(value = "Sesso del Cliente")
	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public MessageDataCustomerProfile titolo(String titolo) {
		this.titolo = titolo;
		return this;
	}

	/**
	 * Titolo di studio conseguito dal Cliente
	 * 
	 * @return titolo
	 **/
	@ApiModelProperty(value = "Titolo di studio conseguito dal Cliente")
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public MessageDataCustomerProfile specializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
		return this;
	}

	/**
	 * Specializzazione del titolo di studio conseguito dal Cliente
	 * 
	 * @return specializzazione
	 **/
	@ApiModelProperty(value = "Specializzazione del titolo di studio conseguito dal Cliente")
	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MessageDataCustomerProfile messageDataCustomerProfile = (MessageDataCustomerProfile) o;
		return Objects.equals(this.codiceAcli, messageDataCustomerProfile.codiceAcli)
				&& Objects.equals(this.partitaIva, messageDataCustomerProfile.partitaIva)
				&& Objects.equals(this.stato, messageDataCustomerProfile.stato)
				&& Objects.equals(this.cognome, messageDataCustomerProfile.cognome)
				&& Objects.equals(this.nome, messageDataCustomerProfile.nome)
				&& Objects.equals(this.dataNascita, messageDataCustomerProfile.dataNascita)
				&& Objects.equals(this.comuneNascita, messageDataCustomerProfile.comuneNascita)
				&& Objects.equals(this.provinciaNascita, messageDataCustomerProfile.provinciaNascita)
				&& Objects.equals(this.sesso, messageDataCustomerProfile.sesso)
				&& Objects.equals(this.titolo, messageDataCustomerProfile.titolo)
				&& Objects.equals(this.specializzazione, messageDataCustomerProfile.specializzazione);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codiceAcli, partitaIva, stato, cognome, nome, dataNascita, comuneNascita, provinciaNascita,
				sesso, titolo, specializzazione);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessageDataCustomerProfile {\n");

		sb.append("    codiceAcli: ").append(toIndentedString(codiceAcli)).append("\n");
		sb.append("    partitaIva: ").append(toIndentedString(partitaIva)).append("\n");
		sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
		sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
		sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
		sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
		sb.append("    comuneNascita: ").append(toIndentedString(comuneNascita)).append("\n");
		sb.append("    provinciaNascita: ").append(toIndentedString(provinciaNascita)).append("\n");
		sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
		sb.append("    titolo: ").append(toIndentedString(titolo)).append("\n");
		sb.append("    specializzazione: ").append(toIndentedString(specializzazione)).append("\n");
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
