package pe.proyecto.losgudyob.persistence.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pe.proyecto.losgudyob.persistence.domain.Servicio;

public interface ServicioRepository {

	@Insert("insert into servicios (tipo, descripcion, precio, estado) values (#{tipo}, #{descripcion}, #{precio}, #{estado})")
	@Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
	public void insertService(Servicio servicio);

	@Update("update servicios set tipo = #{tipo}, descripcion = #{descripcion}, precio = #{precio} where id = #{id}")
	public Integer updateService(Servicio servicio);

	@Select("select * from servicios where id = #{id} and estado = 1")
	@Results(value = { @Result(column = "id", property = "id"), @Result(column = "tipo", property = "tipo"),
			@Result(column = "descripcion", property = "descripcion"), @Result(column = "precio", property = "precio"),
			@Result(column = "estado", property = "estado") })
	public Servicio findActiveServicesById(Integer id);

	@Select("select descripcion from servicios where id = #{id}")
	@Results(value = { @Result(column = "descripcion", property = "descripcion") })
	public String getServiceDescriptionById(Integer id);

	// ELIMINAR SERVICIO POR ID
	@Update("update servicios set estado = 2 where id=#{id}")
	public Integer deleteClient(Integer id);
}
