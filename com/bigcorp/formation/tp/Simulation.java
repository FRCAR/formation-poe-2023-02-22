package com.bigcorp.formation.tp;

public class Simulation {

    public static void main(String[] args){
        Bateau bateau1 = new Bateau("mon beau bateau"); 

        bateau1.prendLaMer();
        bateau1.navigue(1000);
        bateau1.navigue(300);
        bateau1.navigue(200);
        bateau1.arriveAuPort();


        Bateau bateau2 = new Bateau("La coquille de noix");
        System.out.println(bateau2.getNom());

        System.out.println(Bateau.getNombreDeBateauxConstruits());

        Avion monAvion = new Avion();
    }

}
