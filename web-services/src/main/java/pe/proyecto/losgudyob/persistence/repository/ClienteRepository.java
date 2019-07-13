package pe.proyecto.losgudyob.persistence.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pe.proyecto.losgudyob.persistence.domain.Cliente;
import pe.proyecto.losgudyob.view.model.listarClientesModelResponse;

public interface ClienteRepository {
	// LISTAR TODOS LOS CLIENTES
	@Select("select * from clientes")
	@Results(value = { //@Result(column = "id", property = "id"),
			@Result(column = "nombre", property = "nombre"),
			@Result(column = "apellido_paterno", property = "apellidoPaterno"),
			@Result(column = "apellido_materno", property = "apellidoMaterno"),
			@Result(column = "dni", property = "dni"), @Result(column = "celular", property = "celular"),
			@Result(column = "correo", property = "correo"),
			@Result(column = "fecha_nacimiento", property = "fechaNacimiento") })
			//@Result(column = "clave", property = "clave"), @Result(column = "estado", property = "estado") })
	public List<listarClientesModelResponse> listAllClients();

	// INSERTAR UN CLIENTE
	@Insert("insert into clientes (nombre, apellido_paterno, apellido_materno, dni, celular, correo, fecha_nacimiento, clave, estado) "
			+ "values (#{nombre}, #{apellidoPaterno}, #{apellidoMaterno}, #{dni}, #{celular}, #{correo}, #{fechaNacimiento}, #{clave}, #{estado})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	public void insertClient(Cliente cliente);

	// actualizar info del cliente con su id
	@Update("update clientes set celular = #{celular}, correo = #{correo}, clave = #{clave} where id = #{id}")
	public Integer updateClient(Cliente cliente);

	// BUSCAR UN CLIENTE POR SU DNI
	@Select("select * from clientes where dni = #{dni}")
	@Results(value = { @Result(column = "id", property = "id"), @Result(column = "nombre", property = "nombre"),
			@Result(column = "apellido_paterno", property = "apellidoPaterno"),
			@Result(column = "apellido_materno", property = "apellidoMaterno"),
			@Result(column = "dni", property = "dni"), @Result(column = "celular", property = "celular"),
			@Result(column = "correo", property = "correo"),
			@Result(column = "fecha_nacimiento", property = "fechaNacimiento"),
			@Result(column = "clave", property = "clave"), @Result(column = "estado", property = "estado") })
	public Cliente findByDni(String dni);

	// BUSCAR UN CLIENTE POR SU CORREO
	@Select("select * from clientes where correo = #{correo}")
	@Results(value = { @Result(column = "id", property = "id"), @Result(column = "nombre", property = "nombre"),
			@Result(column = "apellido_paterno", property = "apellidoPaterno"),
			@Result(column = "apellido_materno", property = "apellidoMaterno"),
			@Result(column = "dni", property = "dni"), @Result(column = "celular", property = "celular"),
			@Result(column = "correo", property = "correo"),
			@Result(column = "fecha_nacimiento", property = "fechaNacimiento"),
			@Result(column = "clave", property = "clave"), @Result(column = "estado", property = "estado") })
	public Cliente findByCorreo(String correo);

	// LISTAR CLIENTES ACTIVOS POR ID
	@Select("select * from clientes where id = #{id} and estado = 1")
	@Results(value = { @Result(column = "id", property = "id"), @Result(column = "nombre", property = "nombre"),
			@Result(column = "apellido_paterno", property = "apellidoPaterno"),
			@Result(column = "apellido_materno", property = "apellidoMaterno"),
			@Result(column = "dni", property = "dni"), @Result(column = "celular", property = "celular"),
			@Result(column = "correo", property = "correo"),
			@Result(column = "fecha_nacimiento", property = "fechaNacimiento"),
			@Result(column = "clave", property = "clave"), @Result(column = "estado", property = "estado") })
	public Cliente findActiveClientById(Integer id);

	// ELIMINAR CLIENTE POR ID
	@Update("update clientes set estado = 2 where id=#{id}")
	public Integer deleteClient(Cliente cliente);
}
