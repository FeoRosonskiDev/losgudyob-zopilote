package pe.proyecto.losgudyob.persistence.domain;

public class Solicitud {

	private Integer id;
	private String fechaSolicitado;
	private String fechaContactado;
	private String fechaAsignada;
	private Integer idCliente;
	private Integer idPersonal;
	private Integer idServicio;
	private Integer idDistrito;
	private String direccion;
	private Integer estado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFechaSolicitado() {
		return fechaSolicitado;
	}
	public void setFechaSolicitado(String fechaSolicitado) {
		this.fechaSolicitado = fechaSolicitado;
	}
	public String getFechaContactado() {
		return fechaContactado;
	}
	public void setFechaContactado(String fechaContactado) {
		this.fechaContactado = fechaContactado;
	}
	public String getFechaAsignada() {
		return fechaAsignada;
	}
	public void setFechaAsignada(String fechaAsignada) {
		this.fechaAsignada = fechaAsignada;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getIdPersonal() {
		return idPersonal;
	}
	public void setIdPersonal(Integer idPersonal) {
		this.idPersonal = idPersonal;
	}
	public Integer getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}
	public Integer getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(Integer idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
}
