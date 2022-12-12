package com.service;
import java.util.List;

import com.service.Exemplaire;

import lombok.*;
@Data
@Getter
public class Livre {
	private int numISBN;
	private String titre;
	List <Exemplaire>exemplaires;
	@Override
	public String toString() {
		return "Livre [numISBN=" + numISBN + ", titre=" + titre + ", exemplaires=" + exemplaires + "]";
	}

}
