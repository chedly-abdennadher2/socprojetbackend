package com.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.service.Adherent;
import com.service.Exemplaire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity 
@Data
@NoArgsConstructor @AllArgsConstructor
@Getter 
@Setter 
public class Emprunt implements Serializable {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int numemprunt;
private int id_adherent;
private int numexemplaire;


private Date dateemprunt;
private Date dateretourprevu;
private Date dateretourreel;


}
