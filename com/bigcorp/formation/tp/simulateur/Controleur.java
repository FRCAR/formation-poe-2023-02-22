package com.bigcorp.formation.tp.simulateur;

import com.bigcorp.formation.tp.simulateur.bateau.Bateau;

/**
 * Contrôle les bateaux, en les faisant naviguer
 */
public class Controleur {

    /**
     * Controle un bateau en le faisant prendre la mer
     * naviguer et arriver au port
     * @param bateau
     */
    public void controle(Bateau bateau){
        System.out.println("Le contrôle de : " + bateau.getNom()+ " va commencer.");
        bateau.prendLaMer();
        bateau.navigue(34);
        bateau.arriveAuPort();
        System.out.println("Contrôle terminé \r\n\r\n");
    }


}
