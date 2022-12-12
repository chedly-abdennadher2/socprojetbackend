package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Exemplaire;
import com.repository.ExemplaireRepository;

@RestController
@RequestMapping("/exemplaire")

public class ExemplaireController {
@Autowired
private ExemplaireRepository repository;
@RequestMapping(value="/exemplaires",method=RequestMethod.GET) 
public List<Exemplaire> exemplaires(){
return repository.findAll();
}
@RequestMapping(value="/{id}",method=RequestMethod.GET) 
public Exemplaire exemplaire(@PathVariable int id){
return repository.findById(id).get();
}
@RequestMapping(value="/add",method=RequestMethod.POST) 
public void save(@RequestBody Exemplaire p){
repository.save(p);
}
@RequestMapping(value="/delete",method=RequestMethod.POST) 
public void delete(@RequestBody Exemplaire p){
repository.delete(p);
}

}
