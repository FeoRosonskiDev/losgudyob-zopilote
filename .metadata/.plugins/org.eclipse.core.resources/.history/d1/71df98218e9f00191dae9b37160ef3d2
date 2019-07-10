package pe.proyecto.losgudyob.transactional.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.proyecto.losgudyob.config.BaseTest;
import pe.proyecto.losgudyob.transactional.service.ServicioService;
import pe.proyecto.losgudyob.view.model.ServicioRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ServicioUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioUpdateModelResponse;

public class ServicioServiceImplTest extends BaseTest {
	
	@Autowired
	public ServicioService servicioService;

	@Test
	public void insertService() 
	{
		ServicioRegistroModelRequest request = new ServicioRegistroModelRequest();
		request.setTipo("Duo");
		request.setDescripcion("20MB + telefono ilimitado");
		request.setPrecio(129.99);
		
		ServicioRegistroModelResponse response = servicioService.insertService(request);
		System.out.println("Id del servicio agregado : " + gson.toJson(response));
	}
	
	@Test
	public void updateService()
	{
		ServicioUpdateModelRequest request = new ServicioUpdateModelRequest();
		request.setId(2);
		request.setTipo("Trio");
		request.setDescripcion("60mb + telefono ilimitado + cable full");
		request.setPrecio(159.99);
		
		ServicioUpdateModelResponse response = servicioService.updateService(request);
		System.out.println("Response update : " + gson.toJson(response));
	}
}
