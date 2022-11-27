package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.entity.Livre;

@RepositoryRestResource
public interface LivreRepository extends JpaRepository<Livre,Integer>{

}
