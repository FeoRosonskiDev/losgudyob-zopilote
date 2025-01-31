package pe.proyecto.losgudyob.view.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.proyecto.losgudyob.transactional.service.ClienteService;
import pe.proyecto.losgudyob.transactional.service.ServicioService;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelResponse;
import pe.proyecto.losgudyob.view.model.EliminarModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ServicioUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioUpdateModelResponse;
import pe.proyecto.losgudyob.view.model.SolicitudAsignarTecnicoModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudAsignarTecnicoModelResponse;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.listarClientesModelResponse;

@Component
public class LosGudYobEndpointImpl implements LosGudYobEndpoint {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private ServicioService servicioService;

	@Override
	public ClienteRegistroModelResponse insertClient(ClienteRegistroModelRequest request) {
		return clienteService.insertClient(request);
	}

	@Override
	public ClienteUpdateModelResponse updateClient(ClienteUpdateModelRequest request) {
		return clienteService.updateClient(request);
	}

	@Override
	public ClienteUpdateModelResponse eliminarClient(EliminarModelRequest request) {
		return clienteService.eliminarClient(request);
	}

	@Override
	public ServicioRegistroModelResponse insertService(ServicioRegistroModelRequest request) {
		return servicioService.insertService(request);
	}

	@Override
	public ServicioUpdateModelResponse updateService(ServicioUpdateModelRequest request) {
		return servicioService.updateService(request);
	}

	@Override
	public SolicitudRegistroModelResponse insertSolicitud(SolicitudRegistroModelRequest request) {
		return clienteService.insertSolicitud(request);
	}

	@Override
	public ClienteUpdateModelResponse eliminarSolicitud(EliminarModelRequest request) {
		return clienteService.eliminarSolicitud(request);
	}

	@Override
	public SolicitudAsignarTecnicoModelResponse asignarTecnico(SolicitudAsignarTecnicoModelRequest request) {
		return clienteService.asignarTecnico(request);
	}

	@Override
	public List<listarClientesModelResponse> listAllClients() {
		return clienteService.listAllClients();
	}

}
