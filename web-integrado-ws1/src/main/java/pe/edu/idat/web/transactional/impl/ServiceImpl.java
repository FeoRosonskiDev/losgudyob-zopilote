package pe.edu.idat.web.transactional.impl;

import java.net.URL;

import javax.annotation.ManagedBean;

import pe.edu.idat.web.persistence.soap.service.LosGudYobEndpointImplService;
import pe.edu.idat.web.persistence.soap.service.ServicioRegistroModelRequest;
import pe.edu.idat.web.persistence.soap.service.ServicioRegistroModelResponse;
import pe.edu.idat.web.persistence.soap.service.ServicioUpdateModelRequest;
import pe.edu.idat.web.persistence.soap.service.ServicioUpdateModelResponse;
import pe.edu.idat.web.persistence.soap.service.SolicitudAsignarTecnicoModelRequest;
import pe.edu.idat.web.persistence.soap.service.SolicitudAsignarTecnicoModelResponse;

@ManagedBean
public class ServiceImpl implements Service {

	@Override
	public ServicioRegistroModelResponse registrarservicio(ServicioRegistroModelRequest request) {
		try {

			LosGudYobEndpointImplService service = new LosGudYobEndpointImplService(
					new URL("http://localhost:8082/services/LosGudYob?wsdl"));

			ServicioRegistroModelResponse response = service.getLosGudYobEndpointImplPort().insertService(request);

			return response;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ServicioUpdateModelResponse actualizarservicio(ServicioUpdateModelRequest request) {
		try {

			LosGudYobEndpointImplService service = new LosGudYobEndpointImplService(
					new URL("http://localhost:8082/services/LosGudYob?wsdl"));

			ServicioUpdateModelResponse response = service.getLosGudYobEndpointImplPort().updateService(request);

			return response;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * @Override public ServicioUpdateModelResponse
	 * eliminarservicio(EliminarModelRequest request) { try {
	 * 
	 * LosGudYobEndpointImplService service = new LosGudYobEndpointImplService( new
	 * URL("http://localhost:8082/services/LosGudYob?wsdl"));
	 * 
	 * ServicioUpdateModelResponse response =
	 * service.getLosGudYobEndpointImplPort().(request);
	 * 
	 * return response;
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return null; }
	 */

	@Override
	public SolicitudAsignarTecnicoModelResponse asignarTecnico(SolicitudAsignarTecnicoModelRequest request) {
		try {

			LosGudYobEndpointImplService service = new LosGudYobEndpointImplService(
					new URL("http://localhost:8082/services/LosGudYob?wsdl"));

			SolicitudAsignarTecnicoModelResponse response = service.getLosGudYobEndpointImplPort()
					.asignarTecnico(request);

			return response;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
