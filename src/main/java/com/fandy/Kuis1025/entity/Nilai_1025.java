/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fandy.Kuis1025.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "nilai_1025")
public class Nilai_1025 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String name;
    @Column(length = 150, nullable = false)
    private String matkul;
    @ManyToOne
    private Cv_1025 nilai;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /**
     * @return the price
     */
    public String getMatkul() {
        return matkul;
    }

    /**
     * @param price the price to set
     */
    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }


    /**
     * @return the category
     */
    public Cv_1025 getCategory() {
        return nilai;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Cv_1025 nilai) {
        this.nilai = nilai;
    }
    
}
