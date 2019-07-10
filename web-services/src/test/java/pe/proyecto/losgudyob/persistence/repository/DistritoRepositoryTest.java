package pe.proyecto.losgudyob.persistence.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.proyecto.losgudyob.config.BaseTest;
import pe.proyecto.losgudyob.persistence.domain.Distrito;

public class DistritoRepositoryTest extends BaseTest {

	@Autowired
	private DistritoRepository distritoRepository;

	@Test
	public void findDistritoByIdTest() {
		Distrito distrito = distritoRepository.findDistritoById(1);
		System.out.println("Distrito : " + gson.toJson(distrito));
	}
}
