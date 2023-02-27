package com.bigcorp.formation.tp.animal;

/**
 * POJO : Plain Old Java Object
 */
public class Animal {

    private Integer masse;

    private String nom;

    public Integer getMasse() {
        return masse;
    }

    public void setMasse(Integer masse) {
        this.masse = masse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void emetSon() {
        System.out.println("je fais un son");
    }

}
