
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para solicitudAsignarTecnicoModelRequest complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solicitudAsignarTecnicoModelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fechaAsignada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idSolicitud" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idPersonal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudAsignarTecnicoModelRequest", propOrder = { "fechaAsignada", "idSolicitud", "idPersonal" })
public class SolicitudAsignarTecnicoModelRequest {

	protected String fechaAsignada;
	protected Integer idSolicitud;
	protected Integer idPersonal;

	/**
	 * Obtiene el valor de la propiedad fechaAsignada.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFechaAsignada() {
		return fechaAsignada;
	}

	/**
	 * Define el valor de la propiedad fechaAsignada.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFechaAsignada(String value) {
		this.fechaAsignada = value;
	}

	/**
	 * Obtiene el valor de la propiedad idSolicitud.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIdSolicitud() {
		return idSolicitud;
	}

	/**
	 * Define el valor de la propiedad idSolicitud.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setIdSolicitud(Integer value) {
		this.idSolicitud = value;
	}

	/**
	 * Obtiene el valor de la propiedad idPersonal.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIdPersonal() {
		return idPersonal;
	}

	/**
	 * Define el valor de la propiedad idPersonal.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setIdPersonal(Integer value) {
		this.idPersonal = value;
	}

}
