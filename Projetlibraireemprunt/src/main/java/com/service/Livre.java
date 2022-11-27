package com.service;
import java.util.List;

import com.service.Exemplaire;

import lombok.*;
@Data
public class Livre {
	private int numISBN;
	private String titre;
	List <Exemplaire>exemplaires;
}
