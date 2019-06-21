package pe.proyecto.losgudyob.persistence.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.proyecto.losgudyob.config.BaseTest;
import pe.proyecto.losgudyob.persistence.domain.Solicitud;

public class SolicitudRepositoryTest extends BaseTest{

	@Autowired
	private SolicitudRepository solicitudRepository;
	
	@Test
	public void insertTest()
	{
		Solicitud solicitud = new Solicitud();
		solicitud.setFechaSolicitado("2019/06/18");
		solicitud.setIdCliente(1);
		solicitud.setIdServicio(1);
		solicitud.setIdDistrito(1);
		solicitud.setDireccion("Av. Tomas Valle #1489");
		solicitud.setEstado(1);
		
		solicitudRepository.insert(solicitud);
		System.out.println("Id de la nueva solicitud : " + solicitud.getId());
	}
	
	@Test
	public void setTechnicianTest()
	{
		Solicitud solicitud = new Solicitud();
		solicitud.setFechaContactado("2019/06/21");
		solicitud.setFechaAsignada("2019/06/28");
		solicitud.setIdPersonal(1);
		solicitud.setEstado(3); // 3 : contratado
		solicitud.setId(1);
		
		Integer afectedRows = solicitudRepository.setTechnician(solicitud);
		System.out.println("Filas afectadas : " + afectedRows);
	}
	
	@Test
	public void solicitudEnEsperaTest() 
	{
		Integer valid = solicitudRepository.solicitudEnEspera(1);
		System.out.println("Solicitud valida ? " + valid);
	}
	
}
