package it.spindox.sdp.clienti.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * dati che caratterizzano l&#39;event message
 */
@ApiModel(description = "dati che caratterizzano l'event message")
public class MessageHeader   {
	
  @JsonProperty("eventId")
  private String eventId = null;

  /**
   * Nome del sistema che sta pubblicando l'evento
   */
  public enum SourceSystemEnum {
	  
    DBSS("DBSS"),
    STAGING_AREA("STAGING-AREA"),
	PORTALE187("Portale187"),
	APP("App");

    private String value;

    SourceSystemEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceSystemEnum fromValue(String text) {
      for (SourceSystemEnum b : SourceSystemEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sourceSystem")
  private SourceSystemEnum sourceSystem = null;

  @JsonProperty("eventNotificationTime")
  private DateTime eventNotificationTime = null;

  @JsonProperty("sourceSystemTime")
  private DateTime sourceSystemTime = null;

  /**
   * Tipologia di evento
   */
  public enum EventTypeEnum {
	  
    INSERT("INSERT"),
    UPDATE("UPDATE"),
    DELETE("DELETE");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventTypeEnum fromValue(String text) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("eventType")
  private EventTypeEnum eventType = null;

  /**
   * Identifica l'entità del Data Layer SDP che deve essere aggiornata/create/eliminata. Valorizzazione del campo costante e pari a *clienti*
   */
  public enum EntityToBeUpdatedEnum {
	  
    CLIENTI("clienti"),
	BUCKET("bucket"),
	CONSISTENZE("consistenze"),
    ORDINI("ordini"),
    FATTURE_NON_SALDATE("fattureNonSaldate"),
    PROFILO_CREDITIZIO("profiloCreditizio");

    private String value;

    EntityToBeUpdatedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EntityToBeUpdatedEnum fromValue(String text) {
      for (EntityToBeUpdatedEnum b : EntityToBeUpdatedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("entityToBeUpdated")
  private EntityToBeUpdatedEnum entityToBeUpdated = null;

  @JsonProperty("entityId")
  private String entityId = null;

  @JsonProperty("ver")
  private String ver = null;

  public MessageHeader eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Identificativo univoco dell’evento Update Clienti MD5 Hash: [NameOfSubsystem] + [Timestamp]
   * @return eventId
  **/
  @ApiModelProperty(example = "B84EC18B26777E6A5CE403F4376AFB3F", required = true, value = "Identificativo univoco dell’evento Update Clienti MD5 Hash: [NameOfSubsystem] + [Timestamp]")
  @NotNull
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public MessageHeader sourceSystem(SourceSystemEnum sourceSystem) {
    this.sourceSystem = sourceSystem;
    return this;
  }

   /**
   * Nome del sistema che sta pubblicando l'evento
   * @return sourceSystem
  **/
  @ApiModelProperty(required = true, value = "Nome del sistema che sta pubblicando l'evento")
  @NotNull
  public SourceSystemEnum getSourceSystem() {
    return sourceSystem;
  }

  public void setSourceSystem(SourceSystemEnum sourceSystem) {
    this.sourceSystem = sourceSystem;
  }

  public MessageHeader eventNotificationTime(DateTime eventNotificationTime) {
    this.eventNotificationTime = eventNotificationTime;
    return this;
  }

   /**
   * timestamp dell'evento
   * @return eventNotificationTime
  **/
  @ApiModelProperty(required = true, value = "timestamp dell'evento")
  @NotNull
  @Valid
  public DateTime getEventNotificationTime() {
    return eventNotificationTime;
  }

  public void setEventNotificationTime(DateTime eventNotificationTime) {
    this.eventNotificationTime = eventNotificationTime;
  }

  public MessageHeader sourceSystemTime(DateTime sourceSystemTime) {
    this.sourceSystemTime = sourceSystemTime;
    return this;
  }

   /**
   * timestamp dell’update dei dati su sistema source master
   * @return sourceSystemTime
  **/
  @ApiModelProperty(required = true, value = "timestamp dell’update dei dati su sistema source master")
  @NotNull
  @Valid
  public DateTime getSourceSystemTime() {
    return sourceSystemTime;
  }

  public void setSourceSystemTime(DateTime sourceSystemTime) {
    this.sourceSystemTime = sourceSystemTime;
  }

  public MessageHeader eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Tipologia di evento
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "Tipologia di evento")
  @NotNull
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public MessageHeader entityToBeUpdated(EntityToBeUpdatedEnum entityToBeUpdated) {
    this.entityToBeUpdated = entityToBeUpdated;
    return this;
  }

   /**
   * Identifica l'entità del Data Layer SDP che deve essere aggiornata/create/eliminata. Valorizzazione del campo costante e pari a *clienti*
   * @return entityToBeUpdated
  **/
  @ApiModelProperty(required = true, value = "Identifica l'entità del Data Layer SDP che deve essere aggiornata/create/eliminata. Valorizzazione del campo costante e pari a *clienti*")
  @NotNull
  public EntityToBeUpdatedEnum getEntityToBeUpdated() {
    return entityToBeUpdated;
  }

  public void setEntityToBeUpdated(EntityToBeUpdatedEnum entityToBeUpdated) {
    this.entityToBeUpdated = entityToBeUpdated;
  }

  public MessageHeader entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Identificativo dell’Entità che deve essere aggiornata. Nello specifico l'EntityID corrisponde al *ttid*.
   * @return entityId
  **/
  @ApiModelProperty(required = true, value = "Identificativo dell’Entità che deve essere aggiornata. Nello specifico l'EntityID corrisponde al *ttid*.")
  @NotNull
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public MessageHeader ver(String ver) {
    this.ver = ver;
    return this;
  }

   /**
   * versionamento dell'object model, per questa release 1.0.0
   * @return ver
  **/
  @ApiModelProperty(example = "1.0.0", required = true, value = "versionamento dell'object model, per questa release 1.0.0")
  @NotNull
  public String getVer() {
    return ver;
  }

  public void setVer(String ver) {
    this.ver = ver;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageHeader messageHeader = (MessageHeader) o;
    return Objects.equals(this.eventId, messageHeader.eventId) &&
        Objects.equals(this.sourceSystem, messageHeader.sourceSystem) &&
        Objects.equals(this.eventNotificationTime, messageHeader.eventNotificationTime) &&
        Objects.equals(this.sourceSystemTime, messageHeader.sourceSystemTime) &&
        Objects.equals(this.eventType, messageHeader.eventType) &&
        Objects.equals(this.entityToBeUpdated, messageHeader.entityToBeUpdated) &&
        Objects.equals(this.entityId, messageHeader.entityId) &&
        Objects.equals(this.ver, messageHeader.ver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, sourceSystem, eventNotificationTime, sourceSystemTime, eventType, entityToBeUpdated, entityId, ver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageHeader {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    eventNotificationTime: ").append(toIndentedString(eventNotificationTime)).append("\n");
    sb.append("    sourceSystemTime: ").append(toIndentedString(sourceSystemTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    entityToBeUpdated: ").append(toIndentedString(entityToBeUpdated)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
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

