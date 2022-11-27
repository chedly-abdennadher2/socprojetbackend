package com.service;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="LIVRE")
public interface LivreService {
	@GetMapping("/livres") 
	@CrossOrigin(origins = "http://localhost:4200")
	public PagedModel<Livre> livres();
	
	@GetMapping("/livre/{id}") 
	@CrossOrigin(origins = "http://localhost:4200")
	public Livre livre(@PathVariable int id);
	@GetMapping("/livreexemplaire/{id}") 
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Exemplaire> exemplaire(@PathVariable int id);
	
	@PostMapping("/add") 
	@CrossOrigin(origins = "http://localhost:4200")
	public void save(@RequestBody Livre p);
	@PostMapping("/delete") 
	@CrossOrigin(origins = "http://localhost:4200")
	public void delete(@RequestBody Livre p);

}
