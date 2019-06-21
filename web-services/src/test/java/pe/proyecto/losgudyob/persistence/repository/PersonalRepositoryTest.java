package pe.proyecto.losgudyob.persistence.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.proyecto.losgudyob.config.BaseTest;

public class PersonalRepositoryTest extends BaseTest{
	
	@Autowired
	private PersonalRepository personalRepository;

	@Test
	public void activePersonalTest()
	{
		Integer active = personalRepository.activePersonal(2);
		System.out.println("Personal activo ? " + active);
	}
}
