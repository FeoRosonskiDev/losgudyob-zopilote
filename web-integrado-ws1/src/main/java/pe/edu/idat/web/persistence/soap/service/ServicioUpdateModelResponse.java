
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para servicioUpdateModelResponse complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="servicioUpdateModelResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicioUpdateModelResponse", propOrder = { "codigoRespuesta", "respuesta" })
public class ServicioUpdateModelResponse {

	protected String codigoRespuesta;
	protected String respuesta;

	/**
	 * Obtiene el valor de la propiedad codigoRespuesta.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	/**
	 * Define el valor de la propiedad codigoRespuesta.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCodigoRespuesta(String value) {
		this.codigoRespuesta = value;
	}

	/**
	 * Obtiene el valor de la propiedad respuesta.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRespuesta() {
		return respuesta;
	}

	/**
	 * Define el valor de la propiedad respuesta.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRespuesta(String value) {
		this.respuesta = value;
	}

}
