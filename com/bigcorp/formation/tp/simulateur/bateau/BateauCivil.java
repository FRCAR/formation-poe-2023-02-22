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
        System.out.println("J'ai appelé la classe mère et j'exécute du code spécifique.");
        return appelClasseMere;
    }

}
