package pe.proyecto.losgudyob.persistence.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.proyecto.losgudyob.config.BaseTest;
import pe.proyecto.losgudyob.persistence.domain.Servicio;

public class ServicioRepositoryTest extends BaseTest {

	@Autowired
	private ServicioRepository servicioRepository;
	
	private Servicio servicio;
	
	@Test
	public void insertServiceTest() 
	{
		servicio = new Servicio();
		servicio.setTipo("Duo");
		servicio.setDescripcion("20MB + telefono ilimitado");
		servicio.setPrecio(99.99);
		servicio.setEstado(1);
		
		servicioRepository.insertService(servicio);
		System.out.println("Id del servicio registrado : " + gson.toJson(servicio.getId()));
	}
	
	@Test
	public void updateServiceTest() 
	{
		servicio = new Servicio();
		servicio.setId(1);
		servicio.setTipo("Duo");
		servicio.setDescripcion("10MB + telefono ilimitado");
		servicio.setPrecio(99.99);
		
		Integer afectedRows = servicioRepository.updateService(servicio);
		System.out.println("Filas afectadas : " + afectedRows);
	}
	
	@Test
	public void findByIdTest() 
	{
		servicio = servicioRepository.findById(1);
		System.out.println("Servicio encontrado : " + gson.toJson(servicio));
	}
	
}
