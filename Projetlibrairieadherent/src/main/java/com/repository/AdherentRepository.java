package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.entity.Adherent;
@RepositoryRestResource
public interface AdherentRepository extends JpaRepository<Adherent,Integer>  {

}
