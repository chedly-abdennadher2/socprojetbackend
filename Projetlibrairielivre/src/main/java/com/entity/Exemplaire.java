package com.entity;
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
@Entity
public class Exemplaire implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numexemplaire;
	private String disponible;
	
	private BigDecimal prix;
	
	@ManyToOne
	@JoinColumn(name="numisbn",insertable=false,updatable=false)
	private Livre livre;

	public int getNumexemplaire() {
		return numexemplaire;
	}

	public void setNumexemplaire(int numexemplaire) {
		this.numexemplaire = numexemplaire;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	@Override
	public String toString() {
		return "Exemplaire [numexemplaire=" + numexemplaire + ", disponible=" + disponible + ", prix=" + prix
				+ ", livre=" + livre + "]";
	}	

}
