package com.bigcorp.formation.tp;

/**
 * Classe Bateau : navigue sur les flots
 */
public class Bateau {

    /** attribut statique : a une seule valeur pour la classe (ne dépend pas 
     * des instances ) */
    private static int nombreDeBateauxConstruits;

    /**
     * attribut statique et final : a une seule valeur pour la classe
     * ET  ne change jamais. On peut le mettre en public
     * pour que n'importe qui y accède : c'est une constante.
     */
    public static final int POIDS_MAX_EN_TONNES = 500_000_000; 

    /**
     * attribut final :  ne pourra plus être changé après
     * qu'on lui ait donné une valeur (cela peut se faire dans un 
     * constructeur)
     */
    private final String nom;


    /**Attribut classique */
    private double milesParcourus;

    public Bateau(String nom){
        this.nom = nom;
    }
    // Le constructeur ci-dessous fait la même chose
    // que celui ci-dessus
    // public Bateau(String nouveauNom){
    //     nom = nouveauNom;
    // }

    
    public String getNom() {
        return nom;
    }

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

}
