package com.bigcorp.formation.tp;

public class Bateau {
    
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom  + " : super bateau";
    }

}
