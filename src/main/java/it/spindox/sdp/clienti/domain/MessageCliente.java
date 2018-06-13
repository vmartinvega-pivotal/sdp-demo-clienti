package it.spindox.sdp.clienti.domain;

import java.util.Objects;
import io.swagger.annotations.ApiModel;

/**
 * Message event da inviare in coda
 */
@ApiModel(description = "Message event clienti da inviare in coda")
public class MessageCliente extends SdpMessage<Clienti> {

	public MessageCliente data(Clienti data) {
		setData(data);
		return this;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MessageCliente message = (MessageCliente) o;
		return Objects.equals(getHeader(), message.getHeader()) && Objects.equals(getData(), message.getData());
	}

	@Override
	public int hashCode() {
		//return Objects.hash(header, data);
		return Objects.hash(getHeader(), getData());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Message {\n");
		//sb.append("    header: ").append(toIndentedString(header)).append("\n");
		sb.append("    header: ").append(toIndentedString(getHeader())).append("\n");
		sb.append("    data: ").append(toIndentedString(getData())).append("\n");
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
