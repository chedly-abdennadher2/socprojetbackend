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

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity

public class Livre implements Serializable {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numISBN;
	private String titre;
	private String auteur;
	private String dateedition;
	@OneToMany (mappedBy="livre",cascade=CascadeType.ALL)
	@JsonIgnore
	List <Exemplaire>exemplaires;
	@Enumerated (EnumType.STRING)
	private Categorie categorie;
	
	public int getNumISBN() {
		return numISBN;
	}
	public void setNumISBN(int numISBN) {
		this.numISBN = numISBN;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getDateedition() {
		return dateedition;
	}
	public void setDateedition(String dateedition) {
		this.dateedition = dateedition;
	}
	public List<Exemplaire> getExemplaires() {
		return exemplaires;
	}
	public void setExemplaires(List<Exemplaire> exemplaires) {
		this.exemplaires = exemplaires;
	}
	@Override
	public String toString() {
		return "Livre [numISBN=" + numISBN + ", titre=" + titre + ", auteur=" + auteur + ", dateedition=" + dateedition
				+ ", exemplaires=" + exemplaires + "]";
	}

}
