package com.bigcorp.formation.tp.simulateur;

import com.bigcorp.formation.tp.simulateur.bateau.Bateau;
import com.bigcorp.formation.tp.simulateur.bateau.implementation.BateauCivil;
import com.bigcorp.formation.tp.simulateur.bateau.piece.Coque;
import com.bigcorp.formation.tp.simulateur.bateau.piece.Moteur;

public class Simulation {

    public static void main(String[] args) {

        // Création d'un nouveau Bateau
        Bateau bateau1 = new Bateau("mon beau bateau");

        // Appels de méthodes sur le bateau
        bateau1.prendLaMer();
        bateau1.navigue(1000);
        bateau1.navigue(300);
        bateau1.navigue(200);
        bateau1.arriveAuPort();

        // Création d'un autre bateau
        Bateau bateau2 = new Bateau("La coquille de noix");
        System.out.println("le nom du bateau 2 vaut : " + bateau2.getNom());
        // Création d'une coque
        Coque coqueDuBateau2 = new Coque(40);

        // Assignation (ou rattachement) de cette coque au bateau2
        bateau2.setCoque(coqueDuBateau2);

        // Affichage des points de vie de la coque du bateau 2 :
        System.out.println("La coque coqueDuBateau2 a " + coqueDuBateau2.getPointsDeVie() + " points de vie.");

        // Appels de méthodes chaînées
        int pointsDeVieCoqueBateau2 = bateau2.getCoque().getPointsDeVie();
        System.out.println("La coque coqueDuBateau2 a " + pointsDeVieCoqueBateau2 + " points de vie.");

        // Rattachement d'un moteur au bateau 2, en construisant l'instance
        // mais sans l'affecter à une variable
        bateau2.setMoteur(new Moteur(100, 10));

        System.out.println("Ont été construits : " + Bateau.getNombreDeBateauxConstruits());

        // Ici, on instancie un bateau civil
        System.out.println("Un bateau civil prend la mer");
        BateauCivil bateauCivil = new BateauCivil("Le Queen Elizabeth II");
        bateauCivil.prendLaMer();

        System.out.println("Mon bateau est : " + bateau1);

        BateauCivil bateauCivil2 = new BateauCivil("Le paquebot");

        Bateau bateauCache = bateauCivil2;

        maMethode(bateau1);
        maMethode(bateauCivil);

    }

    public static void maMethode(Bateau bateau) {
        System.out.println("le bateau est : " + bateau);
    }

}
