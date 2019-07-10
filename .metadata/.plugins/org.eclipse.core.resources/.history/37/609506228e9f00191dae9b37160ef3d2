package pe.proyecto.losgudyob.persistence.repository;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface PersonalRepository {

	@Select("select id from personal where id = #{id} and estado = 1")
	@Results(value = {
			@Result(column = "id", property = "id")
	})
	public Integer activePersonal(Integer id);
	
	@Select("select id_cargo from personal where id = #{id}") // id_cargo 3 : tecnico
	public Integer isTechnician(Integer id);
}
