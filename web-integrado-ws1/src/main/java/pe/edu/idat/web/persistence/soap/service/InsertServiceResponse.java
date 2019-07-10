
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para insertServiceResponse complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServicioRegistroModelResponse" type="{http://endpoint.view.losgudyob.proyecto.pe/}servicioRegistroModelResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertServiceResponse", propOrder = { "servicioRegistroModelResponse" })
public class InsertServiceResponse {

	@XmlElement(name = "ServicioRegistroModelResponse")
	protected ServicioRegistroModelResponse servicioRegistroModelResponse;

	/**
	 * Obtiene el valor de la propiedad servicioRegistroModelResponse.
	 * 
	 * @return possible object is {@link ServicioRegistroModelResponse }
	 * 
	 */
	public ServicioRegistroModelResponse getServicioRegistroModelResponse() {
		return servicioRegistroModelResponse;
	}

	/**
	 * Define el valor de la propiedad servicioRegistroModelResponse.
	 * 
	 * @param value allowed object is {@link ServicioRegistroModelResponse }
	 * 
	 */
	public void setServicioRegistroModelResponse(ServicioRegistroModelResponse value) {
		this.servicioRegistroModelResponse = value;
	}

}
