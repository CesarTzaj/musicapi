package com.musicapi.musicapi.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "composer")
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomposer")
    private Integer idComposer;
    private String band;

    public Integer getIdComposer() {
        return idComposer;
    }

    public void setIdComposer(Integer idComposer) {
        this.idComposer = idComposer;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }
    
}
