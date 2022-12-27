package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.entity.Adherent;
import com.entity.AdherentProjection;
@RepositoryRestResource
public interface AdherentRepository extends JpaRepository<Adherent,Integer>  {
public List<AdherentProjection> findByNom(String nom);
}
