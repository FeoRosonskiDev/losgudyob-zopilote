
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para clienteUpdateModelRequest complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clienteUpdateModelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clienteUpdateModelRequest", propOrder = { "id", "celular", "correo", "clave" })
public class ClienteUpdateModelRequest {

	protected Integer id;
	protected String celular;
	protected String correo;
	protected String clave;

	/**
	 * Obtiene el valor de la propiedad id.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Define el valor de la propiedad id.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Obtiene el valor de la propiedad celular.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * Define el valor de la propiedad celular.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCelular(String value) {
		this.celular = value;
	}

	/**
	 * Obtiene el valor de la propiedad correo.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Define el valor de la propiedad correo.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCorreo(String value) {
		this.correo = value;
	}

	/**
	 * Obtiene el valor de la propiedad clave.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * Define el valor de la propiedad clave.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setClave(String value) {
		this.clave = value;
	}

}
