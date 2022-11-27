package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Adherent;
import com.repository.AdherentRepository;

@RequestMapping("/adherent")
@RestController

public class AdherentController {
@Autowired 
private AdherentRepository repository;
@GetMapping("/adherents") 
public List<Adherent> adherents (){
return repository.findAll();
}
@GetMapping("/adherent/{id}") 

public Adherent Adherent(int id){
return repository.findById(id).get();
}
@PostMapping("/add") 
public void save(@RequestBody Adherent adh){
repository.save(adh);
}
@PostMapping("/delete") 
public void delete(@RequestBody Adherent adh){
repository.delete(adh);
}
}
