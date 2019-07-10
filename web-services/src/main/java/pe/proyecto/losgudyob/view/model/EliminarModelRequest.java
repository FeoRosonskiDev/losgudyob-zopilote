package pe.proyecto.losgudyob.view.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ClienteEliminarModelRequest")
public class EliminarModelRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3469787034837216965L;

	private Integer id, estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
