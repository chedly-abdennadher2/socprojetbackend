package com.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="LIVRE")
public interface LivreService {
	@GetMapping("/livres") 
	@CrossOrigin(origins = "http://localhost:4200")
	public PagedModel<Livre> livres();
	
	@GetMapping("/livre/{id}") 
	@CrossOrigin(origins = "http://localhost:4200")
	public Livre livre(@PathVariable int id);
	
	@PostMapping("/livre/add") 
	@CrossOrigin(origins = "http://localhost:4200")
	public void save(@RequestBody Livre p);
	@PostMapping("/livre/delete") 
	@CrossOrigin(origins = "http://localhost:4200")
	public void delete(@RequestBody Livre p);
	@RequestMapping(value="/exemplaires",method=RequestMethod.GET) 
	public PagedModel<Exemplaire> exemplaires();
	@RequestMapping(value="/exemplaire/{id}",method=RequestMethod.GET) 
	public Exemplaire exemplaire(@PathVariable int id);
	@RequestMapping(value="/exemplaire/add",method=RequestMethod.POST) 
	public void save(@RequestBody Exemplaire p);
	@RequestMapping(value="/exemplaire/delete",method=RequestMethod.POST) 
	public void delete(@RequestBody Exemplaire p);
}
