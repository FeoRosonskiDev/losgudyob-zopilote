package pe.proyecto.losgudyob.persistence.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pe.proyecto.losgudyob.persistence.domain.Cliente;

public interface ClienteRepository {

	@Select("select * from clientes")
	@Results( value = {
			@Result(column = "id", 					property = "id"),
			@Result(column = "nombre", 				property = "nombre"),
			@Result(column = "apellido_paterno", 	property = "apellidoPaterno"),
			@Result(column = "apellido_materno", 	property = "apellidoMaterno"),
			@Result(column = "dni", 				property = "dni"),
			@Result(column = "celular", 			property = "celular"),
			@Result(column = "correo", 				property = "correo"),
			@Result(column = "fecha_nacimiento", 	property = "fechaNacimiento"),
			@Result(column = "clave", 				property = "clave"),
			@Result(column = "estado", 				property = "estado")
	})
	public List<Cliente> listAllClients();
	
	@Insert(
		"insert into clientes (nombre, apellido_paterno, apellido_materno, dni, celular, correo, fecha_nacimiento, clave, estado) " +
		"values (#{nombre}, #{apellidoPaterno}, #{apellidoMaterno}, #{dni}, #{celular}, #{correo}, #{fechaNacimiento}, #{clave}, #{estado})"
	)
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	public void insertClient(Cliente cliente);
	
	@Update("update clientes set celular = #{celular}, correo = #{correo}, clave = #{clave} where id = #{id}")
	public Integer updateClient(Cliente cliente);
	
	@Select("select * from clientes where dni = #{dni}")
	@Results( value = {
			@Result(column = "id", 					property = "id"),
			@Result(column = "nombre", 				property = "nombre"),
			@Result(column = "apellido_paterno", 	property = "apellidoPaterno"),
			@Result(column = "apellido_materno", 	property = "apellidoMaterno"),
			@Result(column = "dni", 				property = "dni"),
			@Result(column = "celular", 			property = "celular"),
			@Result(column = "correo", 				property = "correo"),
			@Result(column = "fecha_nacimiento", 	property = "fechaNacimiento"),
			@Result(column = "clave", 				property = "clave"),
			@Result(column = "estado", 				property = "estado")
	})
	public Cliente findByDni(String dni);
	
	@Select("select * from clientes where correo = #{correo}")
	@Results( value = {
			@Result(column = "id", 					property = "id"),
			@Result(column = "nombre", 				property = "nombre"),
			@Result(column = "apellido_paterno", 	property = "apellidoPaterno"),
			@Result(column = "apellido_materno", 	property = "apellidoMaterno"),
			@Result(column = "dni", 				property = "dni"),
			@Result(column = "celular", 			property = "celular"),
			@Result(column = "correo", 				property = "correo"),
			@Result(column = "fecha_nacimiento", 	property = "fechaNacimiento"),
			@Result(column = "clave", 				property = "clave"),
			@Result(column = "estado", 				property = "estado")
	})
	public Cliente findByCorreo(String correo);
	
	@Select("select * from clientes where id = #{id} and estado = 1")
	@Results( value = {
			@Result(column = "id", 					property = "id"),
			@Result(column = "nombre", 				property = "nombre"),
			@Result(column = "apellido_paterno", 	property = "apellidoPaterno"),
			@Result(column = "apellido_materno", 	property = "apellidoMaterno"),
			@Result(column = "dni", 				property = "dni"),
			@Result(column = "celular", 			property = "celular"),
			@Result(column = "correo", 				property = "correo"),
			@Result(column = "fecha_nacimiento", 	property = "fechaNacimiento"),
			@Result(column = "clave", 				property = "clave"),
			@Result(column = "estado", 				property = "estado")
	})
	public Cliente findActiveClientById(Integer id);
}
