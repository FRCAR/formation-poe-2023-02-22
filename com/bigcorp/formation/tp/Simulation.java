package com.bigcorp.formation.tp;

public class Simulation {
    

    public static void main(String[] args){
        Bateau[] bateaux = new Bateau[3];
        Bateau bateau1 = new Bateau();
        bateau1.setNom("Oh Mon Bateau");
        bateaux[0] = bateau1;
        Bateau bateau2 = new Bateau();
        bateau2.setNom("Niña");
        bateaux[1] = bateau2;
        Bateau bateau3 = new Bateau();
        bateau3.setNom("Titanic");
        bateaux[2] = bateau3;

        for(Bateau bateau : bateaux){
            System.out.println(bateau);
        }

    }


}
