package com.bigcorp.formation.tp.simulateur.bateau.implementation;

import com.bigcorp.formation.tp.simulateur.bateau.Cargo;
import com.bigcorp.formation.tp.simulateur.bateau.Submersible;

public class SousMarinRavitailleur extends BateauMilitaire 
    implements Submersible, Cargo {

    private int tonnage;

    public SousMarinRavitailleur(String nom) {
        super(nom);
    }

    @Override
    public void plonge() {
        System.out.println("Fermez les écoutilles : nous plongeons.");
    }

    @Override
    public void faitSurface() {
        System.out.println("Vite, de l'air !");
    }

    @Override
    public void chargeTonnage(int tonnage) {
        System.out.println("Tonnage bateau: " + this.tonnage);
        this.tonnage += tonnage;
    }

    @Override
    public int dechargeTonnage() {
        int tonnageDecharge = this.tonnage;
        this.tonnage = 0;
        return tonnageDecharge;
    }

}
