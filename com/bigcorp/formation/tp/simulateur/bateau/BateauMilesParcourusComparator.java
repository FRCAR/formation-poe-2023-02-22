package com.bigcorp.formation.tp.simulateur.bateau;

import java.util.Comparator;

/**
 * Implémente Comparator<Bateau> : peut être utilisé par COllections.sort(...)
 * pour trier
 * des bateaux. En l'occurence ici, trie des bateaux par miles parcourus
 * croissants.
 */
public class BateauMilesParcourusComparator implements Comparator<Bateau> {

    /**
     * Doit renvoyer une valeur négative si
     * bateau1 est AVANT bateau2 dans le tri.
     * Doit renvoyer une valeur positive si
     * bateau1 est APRES bateau2 dans le tri.
     * Doit renvoyer 0 sinon.
     */
    @Override
    public int compare(Bateau bateau1, Bateau bateau2) {
        System.out.println("Je suis appelé ");
        return (int) (bateau1.getMilesParcourus() - bateau2.getMilesParcourus());
        // On pourrait utiliser Math.signum pour être sûr d'avoir de bons résultats quel
        // que
        // soit le résultat de la soustraction
        // return (int) Math.signum(bateau1.getMilesParcourus() -
        // bateau2.getMilesParcourus());
    }

}
