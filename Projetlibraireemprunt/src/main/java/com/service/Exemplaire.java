package com.service;

import java.math.BigDecimal;

import lombok.*;

@Data
@Getter
public class Exemplaire {
	private int numexemplaire;
	private String disponible;
	
	private BigDecimal prix;
	
	private Livre livre;

	@Override
	public String toString() {
		return "Exemplaire [numexemplaire=" + numexemplaire + ", disponible=" + disponible + ", prix=" + prix
				+ ", livre=" + livre + "]";
	}

}
