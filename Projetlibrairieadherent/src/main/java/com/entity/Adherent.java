package com.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity

public class Adherent {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_adherent;
private String nom;
private String prenom;
public int getId_adherent() {
	return id_adherent;
}
public void setId_adherent(int id_adherent) {
	this.id_adherent = id_adherent;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
@Override
public String toString() {
	return "Adherent [id_adherent=" + id_adherent + ", nom=" + nom + ", prenom=" + prenom + "]";
}


}
