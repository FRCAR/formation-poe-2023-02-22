package com.bigcorp.formation.tp.simulateur.bateau;

import com.bigcorp.formation.tp.simulateur.bateau.piece.Coque;
import com.bigcorp.formation.tp.simulateur.bateau.piece.Moteur;

/**
 * Classe Bateau : navigue sur les flots
 */
public class Bateau extends Object{

    /**
     * attribut statique : a une seule valeur pour la classe (ne dépend pas
     * des instances )
     */
    private static int nombreDeBateauxConstruits;

    /**
     * attribut statique et final : a une seule valeur pour la classe
     * ET ne change jamais. On peut le mettre en public
     * pour que n'importe qui y accède : c'est une constante.
     */
    public static final int POIDS_MAX_EN_TONNES = 500_000_000;

    /**
     * attribut final : ne pourra plus être changé après
     * qu'on lui ait donné une valeur (cela peut se faire dans un
     * constructeur)
     */
    private final String nom;

    /** Attributs classiques */
    protected double milesParcourus;

    private Coque coque;
    private Moteur moteur;

    /**
     * Constructeur avec nom. Le nom étant final
     * il FAUT le mettre à jour à un moment. Ici, c'est
     * dans le constructeur
     * 
     * @param nom
     */
    public Bateau(String nom) {
        this.nom = nom;
        nombreDeBateauxConstruits++;
    }


    public Bateau(int param1, boolean param2, String param3) {
        System.out.println(param2);
        this.nom = param3;
    }

    // Le constructeur ci-dessous fait la même chose
    // que celui ci-dessus
    // public Bateau(String nouveauNom){
    // nom = nouveauNom;
    // }

    /**
     * Getter classique
     * 
     * @return
     */
    public String getNom() {
        return nom;
    }

    public Coque getCoque() {
        return coque;
    }

    public void setCoque(Coque coque) {
        this.coque = coque;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    /**
     * getter statique
     * 
     * @return
     */
    public static int getNombreDeBateauxConstruits() {
        return nombreDeBateauxConstruits;
    }

    public boolean prendLaMer() {
        System.out.println("Je prends la mer");
        return true;
    }

    public void navigue(double miles) {
        System.out.println("Je navigue");
        this.milesParcourus = milesParcourus + miles;
    }

    public void arriveAuPort() {
        System.out.println("Je suis arrivé à bon port");
        System.out.println("Pendant mon voyage, j'ai parcouru " + milesParcourus + " miles.");
        milesParcourus = 0;
    }

    @Override
    public String toString() {
       return this.nom; 
    }

}
