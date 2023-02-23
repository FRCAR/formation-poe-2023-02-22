package com.bigcorp.formation.tp.simulateur.bateau.piece;

/**
 * Classe Moteur : immutable (son état interne
 * ne change jamais car ses deux attributs sont final)
 */
public class Moteur {

    private final int puissance;
    private final int consommation;
    
    public Moteur(int puissance, int consommation) {
        this.puissance = puissance;
        this.consommation = consommation;
    }
    
}
