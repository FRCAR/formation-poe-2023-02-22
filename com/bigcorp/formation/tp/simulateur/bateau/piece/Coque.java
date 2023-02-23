package com.bigcorp.formation.tp.simulateur.bateau.piece;

/**
 * Une coque : gère les points de vie d'un bateau
 */
public class Coque {

    private int pointsDeVie;
    private int pointsDeVieMax;

    /**
     * Une coque doit être construite avec
     * un nombre de points de vie maximum.
     * Son nombre de points de vie actuel est initialisé
     * à la valeur max.
     * @param pointsDeVieMax
     */
    public Coque(int pointsDeVieMax) {
        this.pointsDeVie = pointsDeVieMax;
        this.pointsDeVieMax = pointsDeVieMax;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getPointsDeVieMax() {
        return pointsDeVieMax;
    }

    public void setPointsDeVieMax(int pointsDeVieMax) {
        this.pointsDeVieMax = pointsDeVieMax;
    }

}
