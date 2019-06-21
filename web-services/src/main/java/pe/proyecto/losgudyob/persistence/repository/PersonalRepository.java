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
}
