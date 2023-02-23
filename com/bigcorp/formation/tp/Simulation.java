package com.bigcorp.formation.tp;

public class Simulation {

    public static void main(String[] args){
        Bateau bateau1 = new Bateau();
        bateau1.setNom("Oh Mon Bateau");
        bateau1.prendLaMer();
        bateau1.navigue(1000);
        bateau1.navigue(300);
        bateau1.navigue(200);
        bateau1.arriveAuPort();
    }

}
