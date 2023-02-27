package com.bigcorp.formation.tp.simulateur.bateau;

public class BateauCivil extends Bateau {

    private int nbCivils;

    /**
     * Construit un bateau civil en appelant
     * le constructeur de la classe mère : Bateau(String)
     * 
     * @param nom
     */
    public BateauCivil(String nom) {
        super(nom);
    }

    public int getNbCivils() {
        return nbCivils;
    }

    public void setNbCivils(int nbCivils) {
        this.nbCivils = nbCivils;
    }

    @Override
    public boolean prendLaMer() {
        boolean appelClasseMere = super.prendLaMer();
        System.out.println("J'embarque : " + nbCivils + " civils.");
        return appelClasseMere;
    }

    @Override
    public void arriveAuPort() {
        super.arriveAuPort();
        System.out.println("Tuuut tuut, je décharge " + nbCivils + " civils.");
    }

    @Override
    public void navigue(double miles) {
        super.navigue(miles);
        System.out.println("Je navigue avec : " + nbCivils + " civils.");
    }




}
