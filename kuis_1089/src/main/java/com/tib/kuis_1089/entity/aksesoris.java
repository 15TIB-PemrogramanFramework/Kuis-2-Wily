/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1089.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "aksesoris_1089")
public class aksesoris implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String merek;
    @Column(length = 255, nullable = true)
    private String jenis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    public String getJenis() {
        return jenis;
    }

    /**
     * @param description the description to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
