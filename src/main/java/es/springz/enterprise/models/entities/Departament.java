package es.springz.enterprise.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTAMENTS")
public class Departament {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "ID_DEPARTAMENT")
	private Long idDepartament;
	
	@Column(name = "NAME")
	private String name;

	public Long getIdDepartament() {
		return idDepartament;
	}

	public void setIdDepartament(Long idDepartament) {
		this.idDepartament = idDepartament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
