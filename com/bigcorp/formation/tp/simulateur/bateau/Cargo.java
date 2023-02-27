package com.bigcorp.formation.tp.simulateur.bateau;

/**
 * Interface des cargos : navires qui chargent et déchargent
 */
public interface Cargo {

    /**
     * Charge tonnage sur le Cargo
     * @param tonnage
     */
    void chargeTonnage(int tonnage);

    /**
     * Décharge le tonnage : renvoie le tonnage déchargé.
     * @return
     */
    int dechargeTonnage();
}