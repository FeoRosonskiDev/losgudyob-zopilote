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
	
}
