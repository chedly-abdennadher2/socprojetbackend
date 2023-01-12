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

	public List<Livre> livres(){
	return repository.findAll();
	}
	
	@GetMapping("/{id}") 
	public Livre livre(@PathVariable int id){
	return repository.findById(id).get();
	}
	@GetMapping("/livreexemplaire/{id}") 
	public List<Exemplaire> exemplaire(@PathVariable int id){
	return repository.findById(id).get().getExemplaires();
	}
	@PostMapping("/add") 
	public void save(@RequestBody Livre p){
	System.out.println(p.toString());
		repository.save(p);
	}
	@PostMapping("/delete") 
	public void delete(@RequestBody Livre p){
	repository.delete(p);
	}

}
