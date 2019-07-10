package pe.proyecto.losgudyob.persistence.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.proyecto.losgudyob.config.BaseTest;

public class PersonalRepositoryTest extends BaseTest {

	@Autowired
	private PersonalRepository personalRepository;

	@Test
	public void activePersonalTest() {
		Integer active = personalRepository.activePersonal(1);
		System.out.println("Personal activo ? " + active);
	}

	@Test
	public void isTehnicianTest() {
		Integer cargo = personalRepository.isTechnician(1);
		if (cargo == 3)
			System.out.println("Tecnico ? claro que yes ");
	}
}
