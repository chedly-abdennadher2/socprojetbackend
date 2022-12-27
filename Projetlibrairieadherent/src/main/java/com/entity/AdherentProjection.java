package com.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection (name="adherentprojection",types= {Adherent.class})
public interface AdherentProjection   {
public String getNom();
public String getPrenom();
}
