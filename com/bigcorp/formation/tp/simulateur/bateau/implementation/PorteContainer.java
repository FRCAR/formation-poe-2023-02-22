package com.bigcorp.formation.tp.simulateur.bateau.implementation;

import com.bigcorp.formation.tp.simulateur.bateau.Cargo;

/**
 * Un porte container est un bateau civil qui offre
 * en plus les capacités d'un Cargo.
 */
public class PorteContainer extends BateauCivil implements Cargo {

    private int tonnage;

    public PorteContainer(String nom) {
        super(nom);
    }

    @Override
    public void chargeTonnage(int tonnage) {
        this.tonnage += tonnage;
        System.out.println("Tonnage bateau: " + this.tonnage);
    }

    @Override
    public int dechargeTonnage() {
        System.out.println("decharge tonnage");
        int tonnageDecharge = this.tonnage;
        this.tonnage = 0;
        return tonnageDecharge;
    }

}