package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Emprunt;

public interface EmpruntRepository extends JpaRepository<Emprunt,Integer> {

}
