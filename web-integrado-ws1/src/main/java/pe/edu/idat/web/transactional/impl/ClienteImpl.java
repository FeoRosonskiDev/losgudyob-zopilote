package pe.edu.idat.web.transactional.impl;

import java.net.URL;

import javax.annotation.ManagedBean;

import pe.edu.idat.web.persistence.soap.service.ClienteRegistroModelRequest;
import pe.edu.idat.web.persistence.soap.service.ClienteRegistroModelResponse;
import pe.edu.idat.web.persistence.soap.service.ClienteUpdateModelRequest;
import pe.edu.idat.web.persistence.soap.service.ClienteUpdateModelResponse;
import pe.edu.idat.web.persistence.soap.service.EliminarModelRequest;
import pe.edu.idat.web.persistence.soap.service.LosGudYobEndpointImplService;
import pe.edu.idat.web.persistence.soap.service.SolicitudAsignarTecnicoModelRequest;
import pe.edu.idat.web.persistence.soap.service.SolicitudAsignarTecnicoModelResponse;
import pe.edu.idat.web.persistence.soap.service.SolicitudRegistroModelRequest;
import pe.edu.idat.web.persistence.soap.service.SolicitudRegistroModelResponse;

@ManagedBean
public class ClienteImpl implements Cliente {

	@Override
	public ClienteRegistroModelResponse clienteregistro(ClienteRegistroModelRequest request) {
		try {

			LosGudYobEndpointImplService cliente = new LosGudYobEndpointImplService(
					new URL("http://localhost:8082/services/LosGudYob?wsdl"));

			ClienteRegistroModelResponse response = cliente.getLosGudYobEndpointImplPort().insertClient(request);

			return response;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ClienteUpdateModelResponse clienteupdate(ClienteUpdateModelRequest request) {
		try {

			LosGudYobEndpointImplService cliente = new LosGudYobEndpointImplService(
					new URL("http://localhost:8082/services/LosGudYob?wsdl"));

			ClienteUpdateModelResponse response = cliente.getLosGudYobEndpointImplPort().updateClient(request);

			return response;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ClienteUpdateModelResponse clienteeliminar(EliminarModelRequest request) {
		try {

			LosGudYobEndpointImplService cliente = new LosGudYobEndpointImplService(
					new URL("http://localhost:8082/services/LosGudYob?wsdl"));

			ClienteUpdateModelResponse response = cliente.getLosGudYobEndpointImplPort().eliminarClient(request);

			return response;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SolicitudRegistroModelResponse insertSolicitud(SolicitudRegistroModelRequest request) {
		try {

			LosGudYobEndpointImplService cliente = new LosGudYobEndpointImplService(
					new URL("http://localhost:8082/services/LosGudYob?wsdl"));

			SolicitudRegistroModelResponse response = cliente.getLosGudYobEndpointImplPort().insertSolicitud(request);

			return response;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ClienteUpdateModelResponse eliminarSolicitud(EliminarModelRequest request) {
		try {

			LosGudYobEndpointImplService cliente = new LosGudYobEndpointImplService(
					new URL("http://localhost:8082/services/LosGudYob?wsdl"));

			ClienteUpdateModelResponse response = cliente.getLosGudYobEndpointImplPort().eliminarSolicitud(request);

			return response;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
