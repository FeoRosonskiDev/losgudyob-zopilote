
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para eliminarSolicitud complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://endpoint.view.losgudyob.proyecto.pe/}eliminarModelRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarSolicitud", propOrder = { "arg0" })
public class EliminarSolicitud {

	protected EliminarModelRequest arg0;

	/**
	 * Obtiene el valor de la propiedad arg0.
	 * 
	 * @return possible object is {@link EliminarModelRequest }
	 * 
	 */
	public EliminarModelRequest getArg0() {
		return arg0;
	}

	/**
	 * Define el valor de la propiedad arg0.
	 * 
	 * @param value allowed object is {@link EliminarModelRequest }
	 * 
	 */
	public void setArg0(EliminarModelRequest value) {
		this.arg0 = value;
	}

}
