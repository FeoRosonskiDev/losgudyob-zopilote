
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para updateClientResponse complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateClientResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClienteUpdateModelResponse" type="{http://endpoint.view.losgudyob.proyecto.pe/}clienteUpdateModelResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateClientResponse", propOrder = { "clienteUpdateModelResponse" })
public class UpdateClientResponse {

	@XmlElement(name = "ClienteUpdateModelResponse")
	protected ClienteUpdateModelResponse clienteUpdateModelResponse;

	/**
	 * Obtiene el valor de la propiedad clienteUpdateModelResponse.
	 * 
	 * @return possible object is {@link ClienteUpdateModelResponse }
	 * 
	 */
	public ClienteUpdateModelResponse getClienteUpdateModelResponse() {
		return clienteUpdateModelResponse;
	}

	/**
	 * Define el valor de la propiedad clienteUpdateModelResponse.
	 * 
	 * @param value allowed object is {@link ClienteUpdateModelResponse }
	 * 
	 */
	public void setClienteUpdateModelResponse(ClienteUpdateModelResponse value) {
		this.clienteUpdateModelResponse = value;
	}

}
