package com;

import java.util.List;
import java.util.Collection;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedModel;

import com.service.LivreService;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.service.AdherentService;
import com.service.Livre;
import com.service.Exemplaire;
import com.entity.Emprunt;
import com.repository.EmpruntRepository;
import com.service.Adherent;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.hateoas.config.EnableHypermediaSupport;
@SpringBootApplication
@EnableFeignClients
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)

public class ProjetlibraireempruntApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetlibraireempruntApplication.class, args);
	}
	@Bean
	CommandLineRunner start
	(
	LivreService livreService, AdherentService adherentservice,
	EmpruntRepository empruntrepository)
			
	{
		return args -> {
			PagedModel<Livre> livres = livreService.livres();
			livres.forEach(System.out::println);
			
			PagedModel<Exemplaire> exemplaires =livreService.exemplaires();
			exemplaires.forEach(System.out::println);
			Livre l1=livreService.livre(113);
			System.out.println("livre"+l1.toString()
			);
			PagedModel<Adherent> adherents =adherentservice.adherents();
			adherents.forEach(System.out::println);
            	
			Adherent adherent=adherentservice.Adherent(1);
			System.out.println("adh "+adherent.getId_adherent()+adherent.getNom());
			Exemplaire exemplaire=livreService.exemplaire(1);
			Emprunt emp=new Emprunt();
			emp.setId_adherent(adherent.getId_adherent());
			emp.setNumexemplaire(exemplaire.getNumexemplaire());
			emp.setDateemprunt(new Date());
//			Emprunt empsave=empruntrepository.save(emp);
            
	};
	}

}
