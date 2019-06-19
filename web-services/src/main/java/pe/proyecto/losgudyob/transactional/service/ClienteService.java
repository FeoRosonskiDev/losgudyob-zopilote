package pe.proyecto.losgudyob.transactional.service;

import pe.proyecto.losgudyob.view.model.ClienteRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelResponse;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelResponse;

public interface ClienteService {

	public ClienteRegistroModelResponse insertClient(ClienteRegistroModelRequest request);
	
	public ClienteUpdateModelResponse updateClient(ClienteUpdateModelRequest request);
	
	// aqui irán las de la solicitud
	
	public SolicitudRegistroModelResponse insertSolicitud(SolicitudRegistroModelRequest request);
	
}
