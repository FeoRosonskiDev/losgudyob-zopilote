package pe.edu.idat.web.transactional.impl;

import pe.edu.idat.web.persistence.soap.service.EliminarModelRequest;
import pe.edu.idat.web.persistence.soap.service.ServicioRegistroModelRequest;
import pe.edu.idat.web.persistence.soap.service.ServicioRegistroModelResponse;
import pe.edu.idat.web.persistence.soap.service.ServicioUpdateModelRequest;
import pe.edu.idat.web.persistence.soap.service.ServicioUpdateModelResponse;
import pe.edu.idat.web.persistence.soap.service.SolicitudAsignarTecnicoModelRequest;
import pe.edu.idat.web.persistence.soap.service.SolicitudAsignarTecnicoModelResponse;

public interface Service {

	ServicioRegistroModelResponse registrarservicio(ServicioRegistroModelRequest request);
	
	ServicioUpdateModelResponse actualizarservicio(ServicioUpdateModelRequest request);
	
	//ServicioUpdateModelResponse eliminarservicio(EliminarModelRequest request);
	
	SolicitudAsignarTecnicoModelResponse asignarTecnico(SolicitudAsignarTecnicoModelRequest request);
}
