package com.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.service.Adherent;
import com.service.Exemplaire;

@Entity 
public class Emprunt implements Serializable {
@Id 
private int numemprunt;

@ManyToOne (cascade=CascadeType.ALL,fetch=FetchType.LAZY)
private Adherent adh;
@ManyToOne (cascade=CascadeType.ALL,fetch=FetchType.LAZY)
private Exemplaire exemplaire;


}
