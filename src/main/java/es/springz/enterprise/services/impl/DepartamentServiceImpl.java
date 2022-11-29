package es.springz.enterprise.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.springz.enterprise.models.entities.Departament;
import es.springz.enterprise.repositories.DepartamentRepository;
import es.springz.enterprise.services.IDepartamentService;

@Service
public class DepartamentServiceImpl implements IDepartamentService{

	
	@Autowired
	private DepartamentRepository departamentRepository;
	
	@Override
	public List<Departament> getAllDepartaments() {
		// TODO Auto-generated method stub
		return departamentRepository.findAll();
	}

	@Override
	public Optional<Departament> getDepartamentById(Long idDepartament) {
		// TODO Auto-generated method stub
		return departamentRepository.findById(idDepartament);
	}

	@Override
	public Departament saveDepartament(Departament departament) {
		// TODO Auto-generated method stub
		return departamentRepository.save(departament);
	}

	@Override
	public Departament updateDepartament(Departament departament) {
		// TODO Auto-generated method stub
		return departamentRepository.save(departament);
	}

	@Override
	public void deleteDepartament(Long idDepartament) {
		departamentRepository.deleteById(idDepartament);
		
	}
	
	

}
