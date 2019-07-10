
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para solicitudRegistroModelRequest complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solicitudRegistroModelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idServicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idDistrito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudRegistroModelRequest", propOrder = { "idCliente", "idServicio", "idDistrito", "direccion" })
public class SolicitudRegistroModelRequest {

	protected Integer idCliente;
	protected Integer idServicio;
	protected Integer idDistrito;
	protected String direccion;

	/**
	 * Obtiene el valor de la propiedad idCliente.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIdCliente() {
		return idCliente;
	}

	/**
	 * Define el valor de la propiedad idCliente.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setIdCliente(Integer value) {
		this.idCliente = value;
	}

	/**
	 * Obtiene el valor de la propiedad idServicio.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIdServicio() {
		return idServicio;
	}

	/**
	 * Define el valor de la propiedad idServicio.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setIdServicio(Integer value) {
		this.idServicio = value;
	}

	/**
	 * Obtiene el valor de la propiedad idDistrito.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIdDistrito() {
		return idDistrito;
	}

	/**
	 * Define el valor de la propiedad idDistrito.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setIdDistrito(Integer value) {
		this.idDistrito = value;
	}

	/**
	 * Obtiene el valor de la propiedad direccion.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Define el valor de la propiedad direccion.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDireccion(String value) {
		this.direccion = value;
	}

}
