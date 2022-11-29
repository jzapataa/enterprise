package es.springz.enterprise.services;

import java.util.List;
import java.util.Optional;

import es.springz.enterprise.models.entities.Departament;

public interface IDepartamentService {
	
	List<Departament> getAllDepartaments();
	
	Optional<Departament> getDepartamentById(Long idDepartament);
	
	Departament saveDepartament(Departament departament);
	
	Departament updateDepartament(Departament departament);
	
	void deleteDepartament(Long idDepartament);

}
