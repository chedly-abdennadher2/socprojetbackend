package com;

import java.util.List;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedModel;

import com.service.LivreService;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.service.Livre;
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
	LivreService livreService)
	{
		return args -> {
			PagedModel<Livre> products = livreService.livres();
			products.forEach(System.out::println);
		


	};
	}

}
