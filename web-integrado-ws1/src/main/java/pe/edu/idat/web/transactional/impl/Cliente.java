package pe.edu.idat.web.transactional.impl;

import pe.edu.idat.web.persistence.soap.service.ClienteRegistroModelRequest;
import pe.edu.idat.web.persistence.soap.service.ClienteRegistroModelResponse;
import pe.edu.idat.web.persistence.soap.service.ClienteUpdateModelRequest;
import pe.edu.idat.web.persistence.soap.service.ClienteUpdateModelResponse;
import pe.edu.idat.web.persistence.soap.service.EliminarModelRequest;
import pe.edu.idat.web.persistence.soap.service.SolicitudAsignarTecnicoModelRequest;
import pe.edu.idat.web.persistence.soap.service.SolicitudAsignarTecnicoModelResponse;
import pe.edu.idat.web.persistence.soap.service.SolicitudRegistroModelRequest;
import pe.edu.idat.web.persistence.soap.service.SolicitudRegistroModelResponse;

public interface Cliente {

	ClienteRegistroModelResponse clienteregistro(ClienteRegistroModelRequest request);

	ClienteUpdateModelResponse clienteupdate(ClienteUpdateModelRequest request);

	ClienteUpdateModelResponse clienteeliminar(EliminarModelRequest request);

	// aqui irán las de la solicitud

	SolicitudRegistroModelResponse insertSolicitud(SolicitudRegistroModelRequest request);

	ClienteUpdateModelResponse eliminarSolicitud(EliminarModelRequest request);

	SolicitudAsignarTecnicoModelResponse asignarTecnico(SolicitudAsignarTecnicoModelRequest request);

}
