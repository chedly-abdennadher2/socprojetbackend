package com.service;
import lombok.*;
@Data
@Getter 
public class Adherent {
	private int id_adherent;
	private String nom;
	private String prenom;
	@Override
	public String toString() {
		return "Adherent [id_adherent=" + id_adherent + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
