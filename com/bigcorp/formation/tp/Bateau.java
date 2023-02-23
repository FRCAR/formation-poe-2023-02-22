package com.bigcorp.formation.tp;

public class Bateau {
    
    private static int nombreDeBateauxConstruits;
    
    private String nom;
    private double milesParcourus;
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public static int getNombreDeBateauxConstruits() {
        return nombreDeBateauxConstruits;
    }
    
    public boolean prendLaMer() {
        System.out.println("Je prends la mer");
        return true;
    }
    
    public void navigue(double miles) {
        System.out.println("Je navigue");
        this.milesParcourus = milesParcourus + miles;
    }
    
    public void arriveAuPort() {
        System.out.println("Je suis arrivé à bon port");
        System.out.println("Pendant mon voyage, j'ai parcouru " + milesParcourus + " miles.");
        milesParcourus = 0;
    }
    
}
