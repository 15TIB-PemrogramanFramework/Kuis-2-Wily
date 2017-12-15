/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1089.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "mobil_1089")
public class mobil implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mobil;
    @Column(length = 100, nullable = false, unique = true)
    private String merek;
    @Column(length = 255, nullable = true)
    private String warna;
    
    @OneToMany
    @JoinColumn(name = "id_mobil")
    private Set<aksesoris> id;

    public Long getId() {
        return id_mobil;
    }

    public void setId(Long id) {
        this.id_mobil = id;
    }

    /**
     * @return the name
     */
    public String getMerek() {
        return merek;
    }

    /**
     * @param name the name to set
     */
    public void setMerel(String merek) {
        this.merek = merek;
    }

    /**
     * @return the description
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param description the description to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }
}