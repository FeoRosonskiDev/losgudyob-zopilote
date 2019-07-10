package pe.proyecto.losgudyob.transactional.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.proyecto.losgudyob.persistence.domain.Servicio;
import pe.proyecto.losgudyob.persistence.repository.ServicioRepository;
import pe.proyecto.losgudyob.transactional.service.ServicioService;
import pe.proyecto.losgudyob.view.model.ServicioRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ServicioUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioUpdateModelResponse;

@Service("servicioService")
@Transactional
public class ServicioServiceImpl implements ServicioService {

	@Autowired
	private ServicioRepository servicioRepository;

	@Override
	public ServicioRegistroModelResponse insertService(ServicioRegistroModelRequest request) {

		// simple validations start //

		if (request.getTipo().trim().equals(""))
			return notValidInsertResponse("El tipo de servicio es obligatorio");

		if (request.getDescripcion().trim().matches(""))
			return notValidInsertResponse("La descripción es obligatoria");

		if (request.getDescripcion().trim().length() > 100)
			return notValidInsertResponse("Límite de 100 caracteres sobrepasado");

		// TODO: validar el precio correctamente.
		if (!request.getPrecio().toString().matches("^[0-9]+(\\.[0-9]+)?$"))
			return notValidInsertResponse("Debe ingresar un número");

		// simple validations end //

		// insert service start //

		Servicio servicio = new Servicio();
		servicio.setTipo(request.getTipo());
		servicio.setDescripcion(request.getDescripcion());
		servicio.setPrecio(request.getPrecio());
		servicio.setEstado(1);

		servicioRepository.insertService(servicio);

		// insert service end //

		ServicioRegistroModelResponse response = new ServicioRegistroModelResponse();
		response.setCodigoRespuesta("00");
		response.setRespuesta("OK");
		return response;
	}

	private ServicioRegistroModelResponse notValidInsertResponse(String respuesta) {
		ServicioRegistroModelResponse response = new ServicioRegistroModelResponse();
		response.setCodigoRespuesta("01");
		response.setRespuesta(respuesta);
		return response;
	}

	@Override
	public ServicioUpdateModelResponse updateService(ServicioUpdateModelRequest request) {

		// simple validations start //

		if (request.getTipo().trim().equals(""))
			return notValidUpdateResponse("El tipo de servicio es obligatorio");

		if (request.getDescripcion().trim().matches(""))
			return notValidUpdateResponse("La descripción es obligatoria");

		if (request.getDescripcion().trim().length() > 100)
			return notValidUpdateResponse("Límite de 100 caracteres sobrepasado");

		/*
		 * TODO: validar el precio correctamente. La solución izi podría ser cambiar el
		 * tipo de dato de Double a String, así no se autocompleta el double a la hora
		 * de leerlo 8)
		 */
		if (!request.getPrecio().toString().matches("^[0-9]+(\\.[0-9]+)?$"))
			return notValidUpdateResponse("Debe ingresar un número");

		// simple validations end //

		// database validations start //

		Servicio servicio = servicioRepository.findActiveServicesById(request.getId());
		if (servicio == null)
			return notValidUpdateResponse("El servicio que quiere modificar no existe");

		// database validations end //

		// updating service in database //

		servicio = new Servicio();
		servicio.setId(request.getId());
		servicio.setTipo(request.getTipo());
		servicio.setDescripcion(request.getDescripcion());
		servicio.setPrecio(request.getPrecio());

		servicioRepository.updateService(servicio);

		ServicioUpdateModelResponse response = new ServicioUpdateModelResponse();
		response.setCodigoRespuesta("00");
		response.setRespuesta("OK");
		return response;
	}

	private ServicioUpdateModelResponse notValidUpdateResponse(String respuesta) {
		ServicioUpdateModelResponse response = new ServicioUpdateModelResponse();
		response.setCodigoRespuesta("01");
		response.setRespuesta(respuesta);
		return response;
	}

}
