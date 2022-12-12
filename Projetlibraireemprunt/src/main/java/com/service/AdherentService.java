package com.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(name="ADHERENT")
public interface AdherentService {
	@GetMapping("/adherent/adherents") 
	public PagedModel<Adherent> adherents ();
	@GetMapping("/adherent/{id}") 

	public Adherent Adherent(@PathVariable int id);
	@PostMapping("/adherent/add") 
	public void save(@RequestBody Adherent adh);
	@PostMapping("/adherent/delete") 
	public void delete(@RequestBody Adherent adh);


}
