
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para asignarTecnicoResponse complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asignarTecnicoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolicitudAsignarTecnicoModelResponse" type="{http://endpoint.view.losgudyob.proyecto.pe/}solicitudAsignarTecnicoModelResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asignarTecnicoResponse", propOrder = { "solicitudAsignarTecnicoModelResponse" })
public class AsignarTecnicoResponse {

	@XmlElement(name = "SolicitudAsignarTecnicoModelResponse")
	protected SolicitudAsignarTecnicoModelResponse solicitudAsignarTecnicoModelResponse;

	/**
	 * Obtiene el valor de la propiedad solicitudAsignarTecnicoModelResponse.
	 * 
	 * @return possible object is {@link SolicitudAsignarTecnicoModelResponse }
	 * 
	 */
	public SolicitudAsignarTecnicoModelResponse getSolicitudAsignarTecnicoModelResponse() {
		return solicitudAsignarTecnicoModelResponse;
	}

	/**
	 * Define el valor de la propiedad solicitudAsignarTecnicoModelResponse.
	 * 
	 * @param value allowed object is {@link SolicitudAsignarTecnicoModelResponse }
	 * 
	 */
	public void setSolicitudAsignarTecnicoModelResponse(SolicitudAsignarTecnicoModelResponse value) {
		this.solicitudAsignarTecnicoModelResponse = value;
	}

}
