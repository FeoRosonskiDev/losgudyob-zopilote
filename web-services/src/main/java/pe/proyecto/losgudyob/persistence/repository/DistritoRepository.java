package pe.proyecto.losgudyob.persistence.repository;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import pe.proyecto.losgudyob.persistence.domain.Distrito;

public interface DistritoRepository {

	@Select("select * from distritos where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"),
			@Result(column = "descripcion", property = "descripcion") })
	public Distrito findDistritoById(Integer id);
}
