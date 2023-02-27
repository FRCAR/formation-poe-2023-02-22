package com.bigcorp.formation.tp.simulateur;

import com.bigcorp.formation.tp.simulateur.bateau.Cargo;
import com.bigcorp.formation.tp.simulateur.bateau.implementation.PorteContainer;

public class SimulationAvecInterfaces {

    public static void main(String[] args) {
        PorteContainer erika = new PorteContainer("Erika");
        envoieADecharger(erika);
    }

    private static void envoieADecharger(Cargo cargo) {
        cargo.dechargeTonnage();
    }

}
