package pe.proyecto.losgudyob.persistence.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pe.proyecto.losgudyob.persistence.domain.Solicitud;

public interface SolicitudRepository {

	@Insert("insert into solicitud (fecha_solicitado, id_cliente, id_servicio, id_distrito, direccion, estado) "
			+ "values (#{fechaSolicitado}, #{idCliente}, #{idServicio}, #{idDistrito}, #{direccion}, #{estado})")
	@Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
	public void insert(Solicitud solicitud);

	@Update("update solicitud set fecha_contactado = #{fechaContactado}, fecha_asignada = #{fechaAsignada}"
			+ ", id_personal = #{idPersonal}, estado = #{estado} where id = #{id}")
	public Integer setTechnician(Solicitud solicitud);

	@Select("select id from solicitud where id = #{id} and estado = 1")
	@Results(value = { @Result(column = "id", property = "id") })
	public Integer solicitudEnEspera(Integer id);

	@Update("update solicitud set estado = 2 where id=#{id}")
	public Integer eliminarSolicitud(Integer id);
}
