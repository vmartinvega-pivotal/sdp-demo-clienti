package it.spindox.sdp.clienti.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * Message event da inviare in coda
 */
@ApiModel(description = "Message event da inviare in coda")
public class SdpMessage<T> {
	
	@JsonProperty("header")
	private MessageHeader header = null;
	
	@JsonProperty("data")
	private T data = null;

	public SdpMessage<T> header(MessageHeader header) {
		this.header = header;
		return this;
	}
	
	/**
	 * Get data
	 * 
	 * @return data
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * Get header
	 * 
	 * @return header
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public MessageHeader getHeader() {
		return header;
	}

	public void setHeader(MessageHeader header) {
		this.header = header;
	}

}
