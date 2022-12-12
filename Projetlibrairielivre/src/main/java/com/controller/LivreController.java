package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Exemplaire;
import com.entity.Livre;
import com.repository.LivreRepository;

@RequestMapping("/livre")
@RestController
public class LivreController {
	@Autowired
	private LivreRepository repository;
	@GetMapping("/livres") 
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Livre> livres(){
	return repository.findAll();
	}
	
	@GetMapping("/{id}") 
	@CrossOrigin(origins = "http://localhost:4200")
	public Livre livre(@PathVariable int id){
	return repository.findById(id).get();
	}
	@GetMapping("/livreexemplaire/{id}") 
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Exemplaire> exemplaire(@PathVariable int id){
	return repository.findById(id).get().getExemplaires();
	}
	@PostMapping("/add") 
	@CrossOrigin(origins = "http://localhost:4200")
	public void save(@RequestBody Livre p){
	System.out.println(p.toString());
		repository.save(p);
	}
	@PostMapping("/delete") 
	@CrossOrigin(origins = "http://localhost:4200")
	public void delete(@RequestBody Livre p){
	repository.delete(p);
	}

}
