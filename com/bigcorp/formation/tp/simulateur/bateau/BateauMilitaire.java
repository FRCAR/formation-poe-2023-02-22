package com.bigcorp.formation.tp.simulateur.bateau;

public class BateauMilitaire extends Bateau {
    private int forceCanon;

    public BateauMilitaire(String nom) {
        super(nom);
    }

    public int getForceCanon() {
        return forceCanon;
    }

    public void setForceCanon(int forceCanon) {
        this.forceCanon = forceCanon;
    }




    @Override
    public void arriveAuPort() {
        super.arriveAuPort();
        System.out.println("Les marins vont faire la fête !");
    }

    @Override
    public void navigue(double miles) {
        super.navigue(miles);
        System.out.println("Je patrouille !");
    }

    @Override
    public boolean prendLaMer() {
        super.prendLaMer();
        System.out.println("Gare à mes canons !");
        return true;
    }

    public void attaque(Bateau cible) {
        // this attaque cible
        System.out.println(this.getNom() + " attaque " + cible.getNom());
    }

}
