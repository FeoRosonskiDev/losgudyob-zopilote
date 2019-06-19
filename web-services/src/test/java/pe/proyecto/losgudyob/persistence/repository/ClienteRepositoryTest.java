package pe.proyecto.losgudyob.persistence.repository;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.proyecto.losgudyob.config.BaseTest;
import pe.proyecto.losgudyob.persistence.domain.Cliente;

public class ClienteRepositoryTest extends BaseTest{

	@Autowired
	private ClienteRepository clienteRepository;
	
	private Cliente cliente;
	
	
	/* si van a correr el test de insertClient, recuerden que acá 
	* aún no están las validaciones, así que cambien los datos.
	* Especialmente correo y dni, el resto w.e. 
	* PD: no es que no funcione si lo corren con los mismos datos, 
	* pero causará problemas con el findByCorreo y findByDni,
	* ya que esos métodos esperan 1 cliente o ninguno y si le meten
	* los mismos datos no podrá guardarlos, so cuidado.
	* PD2: lo otro es que borren los registros de la db dps
	* de las pruebas y listo :oki:
	* */
	@Test
	public void insertClientTest() 
	{
		cliente = new Cliente();
		cliente.setNombre("Juan Carlos");
		cliente.setApellidoPaterno("Triviño");
		cliente.setApellidoMaterno("Bodoque");
		cliente.setDni("70555913");
		cliente.setCelular("979666355");
		cliente.setCorreo("carlosjordi@hotmail.com");
		cliente.setFechaNacimiento("1993/04/01");
		cliente.setClave("entodoelcachi");
		cliente.setEstado(1);
		
		clienteRepository.insertClient(cliente);
		System.out.println("id del nuevo cliente es: " + cliente.getId());
	}
	
	@Test
	public void finByDniTest() 
	{
		cliente = clienteRepository.findByDni("70555919");
		System.out.println("Cliente : " + gson.toJson(cliente));
	}
	
	@Test
	public void finByCorreoTest() 
	{
		cliente = clienteRepository.findByCorreo("carlosjordi@hotmail.com");
		System.out.println("Cliente : " + gson.toJson(cliente));
	}
	
	@Test
	public void listAllClientsTest() 
	{
		List<Cliente> allClients = clienteRepository.listAllClients();
		System.out.println("Lista de clientes : " + gson.toJson(allClients));
	}

	@Test
	public void updateClientTest() {
		
		cliente = new Cliente();
		cliente.setCelular("978456321");
		cliente.setCorreo("pepito@gmail.com");
		cliente.setClave("98631ab");
		cliente.setId(14);
		
		Integer afectedRows = clienteRepository.updateClient(cliente);
		System.out.println("Filas afectadas : " + afectedRows);
	}
	
	@Test
	public void findActiveClientByIdTest()
	{
		cliente = clienteRepository.findActiveClientById(1);
		System.out.println("Cliente : " + gson.toJson(cliente));
	}
}
