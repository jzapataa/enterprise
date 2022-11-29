package es.springz.enterprise.models.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class DepartamentDto implements Serializable{
	
	private static final long serialVersionUID = -6539070407927561325L;

	
	@NotNull
	private Long departament_id;
	
	@NotNull
	private String name;

	public Long getDepartament_id() {
		return departament_id;
	}

	public void setDepartament_id(Long departament_id) {
		this.departament_id = departament_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
