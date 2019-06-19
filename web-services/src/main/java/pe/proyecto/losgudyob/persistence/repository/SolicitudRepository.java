package pe.proyecto.losgudyob.persistence.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import pe.proyecto.losgudyob.persistence.domain.Solicitud;

public interface SolicitudRepository {
	
	@Insert("insert into solicitud (fecha_solicitado, id_cliente, id_servicio, id_distrito, direccion, estado) " +
			"values (#{fechaSolicitado}, #{idCliente}, #{idServicio}, #{idDistrito}, #{direccion}, #{estado})")
	@Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
	public void insert(Solicitud solicitud);

}
