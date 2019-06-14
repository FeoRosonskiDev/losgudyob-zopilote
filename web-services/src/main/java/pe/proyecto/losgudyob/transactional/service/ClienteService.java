package pe.proyecto.losgudyob.transactional.service;

import pe.proyecto.losgudyob.view.model.ClienteRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelResponse;

public interface ClienteService {

	public ClienteRegistroModelResponse insertClient(ClienteRegistroModelRequest request);
	
	public ClienteUpdateModelResponse updateClient(ClienteUpdateModelRequest request);
	
}
