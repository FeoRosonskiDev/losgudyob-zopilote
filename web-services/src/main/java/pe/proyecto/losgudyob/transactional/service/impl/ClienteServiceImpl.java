package pe.proyecto.losgudyob.transactional.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.proyecto.losgudyob.persistence.domain.Cliente;
import pe.proyecto.losgudyob.persistence.domain.Solicitud;
import pe.proyecto.losgudyob.persistence.repository.ClienteRepository;
import pe.proyecto.losgudyob.persistence.repository.DistritoRepository;
import pe.proyecto.losgudyob.persistence.repository.PersonalRepository;
import pe.proyecto.losgudyob.persistence.repository.ServicioRepository;
import pe.proyecto.losgudyob.persistence.repository.SolicitudRepository;
import pe.proyecto.losgudyob.transactional.service.ClienteService;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelResponse;
import pe.proyecto.losgudyob.view.model.EliminarModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudAsignarTecnicoModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudAsignarTecnicoModelResponse;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelResponse;

@Service("clienteService")
@Transactional
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private SolicitudRepository solicitudRepository;

	@Autowired
	private ServicioRepository servicioRepository;

	@Autowired
	private DistritoRepository distritoRepository;

	@Autowired
	private PersonalRepository personalRepository;

	@Override
	public ClienteRegistroModelResponse insertClient(ClienteRegistroModelRequest request) {

		// simple validations start //

		if (request.getNombre().trim().equals(""))
			return notValidInsertResponse("El nombre es obligatorio");

		if (!request.getNombre().trim().matches("^([A-Za-z])+([\\s]{1}[A-Za-z]+)*$"))
			return notValidInsertResponse("El nombre no debe contener digitos ni caracteres especiales");

		if (request.getApellidoPaterno().trim().equals(""))
			return notValidInsertResponse("El apellido paterno es obligatorio");

		if (!request.getApellidoPaterno().trim().matches("^([A-Za-z])+([\\s]{1}[A-Za-z]+)*$"))
			return notValidInsertResponse("El apellido paterno no debe contener digitos ni caracteres especiales");

		if (request.getApellidoMaterno().trim().equals(""))
			return notValidInsertResponse("El apellido materno es obligatorio");

		if (!request.getApellidoMaterno().trim().matches("^([A-Za-z])+([\\s]{1}[A-Za-z]+)*$"))
			return notValidInsertResponse("El apellido materno no debe contener digitos ni caracteres especiales");

		if (request.getDni().trim().equals(""))
			return notValidInsertResponse("El DNI es obligatorio");

		if (request.getDni().trim().length() != 8)
			return notValidInsertResponse("El DNI debe tener 8 digitos");

		if (!request.getDni().trim().matches("^[0-9]+$"))
			return notValidInsertResponse("El DNI debe contener solo digitos");

		if (request.getCelular().trim().equals(""))
			return notValidInsertResponse("El número de celular es obligatorio");

		if (request.getCelular().trim().length() != 9)
			return notValidInsertResponse("El número de celular debe tener 9 digitos");

		if (!request.getCelular().trim().matches("^[0-9]+$"))
			return notValidInsertResponse("El número de celular debe contener solo digitos");

		if (!request.getCelular().trim().matches("^9[0-9]+$"))
			return notValidInsertResponse("El número de celular debe empezar con el 9");

		if (request.getCorreo().trim().equals(""))
			return notValidInsertResponse("El correo es obligatorio");

		if (!request.getCorreo().trim().matches("^[\\w\\.]+\\@[A-Za-z]+(\\.[A-Za-z]+)+$"))
			return notValidInsertResponse("El correo no es válido");

		/*
		 * este regex no valida del todo la fecha, pero mientras lo hacía recordé que
		 * probablemente en la vista pongamos un selector de fecha, por lo cual tmp era
		 * necesario ser tan puntual, así que lo dejé así. FECHA MÍNIMA DE NACIMIENTO
		 * ACEPTABLE : 1900, aunque tmb acepta formato 10xx XD
		 */

		// el formatoo que usemos supongo dependerá de como lo cogamos en la vista
		// :thinking:
	/*	if (!request.getFechaNacimiento().trim()
				.matches("^([1-9]?([0-3][0-9])?)\\/([0-1]*[0-9]+)\\/[1-2][09][0-9]{2}$"))
			return notValidInsertResponse("Fecha de nacimiento invalida");*/

		if (request.getClave().trim().length() > 16 || request.getClave().trim().length() < 6)
			return notValidInsertResponse("La contraseña debe tener entre 6 y 16 caracteres");

		// simple validations end //

		// database validations start //

		Cliente cliente = clienteRepository.findByDni(request.getDni());

		if (cliente != null)
			return notValidInsertResponse("El DNI ya existe");

		cliente = clienteRepository.findByCorreo(request.getCorreo());

		if (cliente != null)
			return notValidInsertResponse("El correo ya existe");

		// database validations end //

		// insert client in database start //

		cliente = new Cliente();
		cliente.setNombre(request.getNombre());
		cliente.setApellidoPaterno(request.getApellidoPaterno());
		cliente.setApellidoMaterno(request.getApellidoMaterno());
		cliente.setDni(request.getDni());
		cliente.setCelular(request.getCelular());
		cliente.setCorreo(request.getCorreo());

		// parsing date to year-month-day for database //

		DateFormat stringToDate = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat dateToString = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date date = stringToDate.parse(request.getFechaNacimiento());
			cliente.setFechaNacimiento(dateToString.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cliente.setClave(request.getClave());
		cliente.setEstado(1);

		clienteRepository.insertClient(cliente);

		// insert client in database end //

		ClienteRegistroModelResponse response = new ClienteRegistroModelResponse();
		response.setCodigoRespuesta("00");
		response.setRespuesta("OK");
		response.setCorreo(request.getCorreo());
		return response;
	}

	private ClienteRegistroModelResponse notValidInsertResponse(String respuesta) {
		ClienteRegistroModelResponse response = new ClienteRegistroModelResponse();
		response.setCodigoRespuesta("01");
		response.setRespuesta(respuesta);
		return response;
	}

	@Override
	public ClienteUpdateModelResponse updateClient(ClienteUpdateModelRequest request) {

		// simple validations start //

		if (request.getCelular().trim().equals(""))
			return notValidUpdateResponse("El número de celular es obligatorio");

		if (request.getCelular().trim().length() != 9)
			return notValidUpdateResponse("El número de celular debe tener 9 digitos");

		if (!request.getCelular().trim().matches("^[0-9]+$"))
			return notValidUpdateResponse("El número de celular debe contener solo digitos");

		if (!request.getCelular().trim().matches("^9[0-9]+$"))
			return notValidUpdateResponse("El número de celular debe empezar con el 9");

		if (request.getCorreo().trim().equals(""))
			return notValidUpdateResponse("El correo es obligatorio");

		if (!request.getCorreo().trim().matches("^[\\w\\.]+\\@[A-Za-z]+(\\.[A-Za-z]+)+$"))
			return notValidUpdateResponse("El correo no es válido");

		if (request.getClave().trim().length() > 16 || request.getClave().trim().length() < 6)
			return notValidUpdateResponse("La contraseña debe tener entre 6 y 16 caracteres");

		// simple validations end //

		// database validations start //

		Cliente cliente = clienteRepository.findByCorreo(request.getCorreo());

		if (cliente != null)
			return notValidUpdateResponse("El correo ya existe");

		// database validations end //

		// updating client in database start //

		cliente = new Cliente();
		cliente.setCelular(request.getCelular());
		cliente.setCorreo(request.getCorreo());
		cliente.setClave(request.getClave());
		cliente.setId(request.getId());

		if (clienteRepository.updateClient(cliente) == 1) {
			ClienteUpdateModelResponse response = new ClienteUpdateModelResponse();
			response.setCodigoRespuesta("00");
			response.setRespuesta("OK");
			return response;
		}

		/*
		 * TODO: estoy thinking si hacer la validación del id para saber si existe o no.
		 * pasa que este último return se encarga de ese caso, pero pensaba que quizás
		 * debamos encargarnos de esa validación antes.
		 */
		return notValidUpdateResponse("Problema al actualizar datos");
	}

	private ClienteUpdateModelResponse notValidUpdateResponse(String respuesta) {
		ClienteUpdateModelResponse response = new ClienteUpdateModelResponse();
		response.setCodigoRespuesta("01");
		response.setRespuesta(respuesta);
		return response;
	}

	// métodos de la solicitud

	@Override
	public SolicitudRegistroModelResponse insertSolicitud(SolicitudRegistroModelRequest request) {

		// database validations start //

		if (clienteRepository.findActiveClientById(request.getIdCliente()) == null)
			return notValidSolicitudRegistroResponse("Este cliente no existe");

		if (servicioRepository.findActiveServicesById(request.getIdServicio()) == null)
			return notValidSolicitudRegistroResponse("Este servicio no se encuentra disponible");

		if (distritoRepository.findDistritoById(request.getIdDistrito()) == null)
			return notValidSolicitudRegistroResponse("Este distrito no existe");

		// database validations end //

		// simple validations start //

		if (request.getDireccion().trim().equals(""))
			return notValidSolicitudRegistroResponse("La dirección es obligatoria");

		if (request.getDireccion().trim().length() > 100)
			return notValidSolicitudRegistroResponse("La dirección no debe contener más de 100 caracteres");

		// simple validations end //

		Solicitud solicitud = new Solicitud();
		solicitud.setIdCliente(request.getIdCliente());
		solicitud.setIdServicio(request.getIdServicio());
		solicitud.setIdDistrito(request.getIdDistrito());
		solicitud.setDireccion(request.getDireccion());

		DateFormat dateToString = new SimpleDateFormat("yyyy/MM/dd");

		solicitud.setFechaSolicitado(dateToString.format(new Date()));
		solicitud.setEstado(1);

		solicitudRepository.insert(solicitud);

		SolicitudRegistroModelResponse response = new SolicitudRegistroModelResponse();
		response.setCodigoRespuesta("00");
		response.setRespuesta("OK");
		response.setDescripcionServicio(servicioRepository.getServiceDescriptionById(request.getIdServicio()));

		return response;
	}

	private SolicitudRegistroModelResponse notValidSolicitudRegistroResponse(String respuesta) {
		SolicitudRegistroModelResponse response = new SolicitudRegistroModelResponse();
		response.setCodigoRespuesta("01");
		response.setRespuesta(respuesta);
		return response;
	}

	@Override
	public SolicitudAsignarTecnicoModelResponse asignarTecnico(SolicitudAsignarTecnicoModelRequest request) {

		// db validations start //

		if (solicitudRepository.solicitudEnEspera(request.getIdSolicitud()) == null)
			return notValidAsignarTecnicoResponse("Solicitud ya atendida o no existe");

		if (personalRepository.activePersonal(request.getIdPersonal()) == null)
			return notValidAsignarTecnicoResponse("Este empleado no existe o no se encuentra activo");

		if (personalRepository.isTechnician(request.getIdPersonal()) != 3)
			return notValidAsignarTecnicoResponse("Este empleado no es un técnico");

		// db validations end //

		// TODO: validar fecha asignada

		// asignando técnico //

		Solicitud solicitud = new Solicitud();
		solicitud.setId(request.getIdSolicitud());
		solicitud.setIdPersonal(request.getIdPersonal());
		solicitud.setFechaAsignada(request.getFechaAsignada());

		Date today = new Date();
		DateFormat dateToString = new SimpleDateFormat("yyyy/MM/dd");

		solicitud.setFechaContactado(dateToString.format(today));
		solicitud.setEstado(3);

		solicitudRepository.setTechnician(solicitud);

		SolicitudAsignarTecnicoModelResponse response = new SolicitudAsignarTecnicoModelResponse();
		response.setCodigoRespuesta("00");
		response.setRespuesta("OK");

		return response;
	}

	private SolicitudAsignarTecnicoModelResponse notValidAsignarTecnicoResponse(String respuesta) {
		SolicitudAsignarTecnicoModelResponse response = new SolicitudAsignarTecnicoModelResponse();
		response.setCodigoRespuesta("01");
		response.setRespuesta(respuesta);
		return response;
	}

	@Override
	public ClienteUpdateModelResponse eliminarClient(EliminarModelRequest request) {

		if (request.getId() == null) {
			return notValidUpdateResponse("El ID no puede ser nulo");
		}
		;
		if (request.getId() != null && request.getEstado() == 2) {
			return notValidUpdateResponse("El cliente " + request.getId() + " ya ha sido eliminado anteriormente.");
		}
		;

		ClienteUpdateModelResponse response = new ClienteUpdateModelResponse();
		response.setCodigoRespuesta("01");
		response.setRespuesta("Eliminado");
		return response;
	}

	@Override
	public ClienteUpdateModelResponse eliminarSolicitud(EliminarModelRequest request) {

		if (request.getId() == null) {
			return notValidUpdateResponse("El ID no puede ser nulo");
		}
		;
		if (request.getId() != null && request.getEstado() == 2) {
			return notValidUpdateResponse("La solicitud " + request.getId() + " ya ha sido eliminado anteriormente.");
		}
		;

		ClienteUpdateModelResponse response = new ClienteUpdateModelResponse();
		response.setCodigoRespuesta("01");
		response.setRespuesta("Eliminado");
		return response;
	}

}
