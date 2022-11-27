package com.service;

import java.math.BigDecimal;

import lombok.*;

@Data
public class Exemplaire {
	private int numexemplaire;
	private String disponible;
	
	private BigDecimal prix;
	
	private Livre livre;
}
