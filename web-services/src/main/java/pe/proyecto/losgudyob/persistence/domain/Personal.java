package pe.proyecto.losgudyob.persistence.domain;

public class Personal extends Cliente {

	private Integer idCargo;
	private Integer idDistrito;

	public Integer getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}

	public Integer getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(Integer idDistrito) {
		this.idDistrito = idDistrito;
	}

}
