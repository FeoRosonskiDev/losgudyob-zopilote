package pe.proyecto.losgudyob.transactional.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.proyecto.losgudyob.config.BaseTest;
import pe.proyecto.losgudyob.transactional.service.ClienteService;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelResponse;
import pe.proyecto.losgudyob.view.model.SolicitudAsignarTecnicoModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudAsignarTecnicoModelResponse;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelResponse;

public class ClienteServiceImplTest extends BaseTest {

	@Autowired
	public ClienteService clienteService;
	
	@Test
	public void insertClientTest() 
	{
		ClienteRegistroModelRequest request = new ClienteRegistroModelRequest();
		request.setNombre("Juan Carlos");
		request.setApellidoPaterno("Trivino");
		request.setApellidoMaterno("Bodoque");
		request.setDni("70555919");
		request.setCelular("979666355");
		request.setCorreo("carlosjordi02@hotmail.com");
		request.setFechaNacimiento("01/04/1993");
		request.setClave("entodoelcachi");
		
		ClienteRegistroModelResponse response = clienteService.insertClient(request);
		System.out.println("Response insert : " + gson.toJson(response));
	}
	
	@Test
	public void updateClientTest()
	{
		ClienteUpdateModelRequest request = new ClienteUpdateModelRequest();
		request.setCelular("999999999");
		request.setCorreo("eltorito@carlitos.com.pe");
		request.setClave("sinvaselina");
		request.setId(5);
		
		ClienteUpdateModelResponse response = clienteService.updateClient(request);
		System.out.println("Response update : " + gson.toJson(response));
	}
	
	// métodos de la solicitud
	
	@Test
	public void insertSolicitudTest()
	{
		SolicitudRegistroModelRequest request = new SolicitudRegistroModelRequest();
		request.setIdCliente(1);
		request.setIdServicio(1);
		request.setIdDistrito(1);
		request.setDireccion("Av. Arequipa #1835");
		
		SolicitudRegistroModelResponse response = clienteService.insertSolicitud(request);
		System.out.println("Response solicitud registro : " + gson.toJson(response));
	}
	
	@Test
	public void asignarTecnicoTest()
	{
		SolicitudAsignarTecnicoModelRequest request = new SolicitudAsignarTecnicoModelRequest();
		request.setIdSolicitud(2);
		request.setIdPersonal(2);
		request.setFechaAsignada("2019/06/30");
		
		SolicitudAsignarTecnicoModelResponse response = clienteService.asignarTecnico(request);
		System.out.println("Response asignar tecnico : " + gson.toJson(response));
	}
	
}
