
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para updateServiceResponse complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServicioUpdateModelResponse" type="{http://endpoint.view.losgudyob.proyecto.pe/}servicioUpdateModelResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateServiceResponse", propOrder = { "servicioUpdateModelResponse" })
public class UpdateServiceResponse {

	@XmlElement(name = "ServicioUpdateModelResponse")
	protected ServicioUpdateModelResponse servicioUpdateModelResponse;

	/**
	 * Obtiene el valor de la propiedad servicioUpdateModelResponse.
	 * 
	 * @return possible object is {@link ServicioUpdateModelResponse }
	 * 
	 */
	public ServicioUpdateModelResponse getServicioUpdateModelResponse() {
		return servicioUpdateModelResponse;
	}

	/**
	 * Define el valor de la propiedad servicioUpdateModelResponse.
	 * 
	 * @param value allowed object is {@link ServicioUpdateModelResponse }
	 * 
	 */
	public void setServicioUpdateModelResponse(ServicioUpdateModelResponse value) {
		this.servicioUpdateModelResponse = value;
	}

}
