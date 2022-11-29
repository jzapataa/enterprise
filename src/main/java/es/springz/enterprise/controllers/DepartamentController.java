package es.springz.enterprise.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.springz.enterprise.models.entities.Departament;
import es.springz.enterprise.services.IDepartamentService;

@RestController
@RequestMapping("/departaments")
public class DepartamentController {
	
	@Autowired 
	private IDepartamentService departamentService;
	
	@GetMapping("/list")
	public List<Departament> getAllDepartaments(){
		return departamentService.getAllDepartaments();
	}
	
	@GetMapping("/{id}")
	public Optional<Departament> getDepartamentById(@PathVariable Long id){
		return departamentService.getDepartamentById(id);
	}
	
	@PostMapping("")
	public Departament save(@RequestBody Departament departament){
		return departamentService.saveDepartament(departament);
	}
	
	@PutMapping("/{id}")
	public Departament update(@PathVariable Long id, @RequestBody Departament departament){
		return departamentService.updateDepartament(departament);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {

		departamentService.deleteDepartament(id);

	}

}
