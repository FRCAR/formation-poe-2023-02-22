package com.bigcorp.formation.tp;

/**
 * Classe Message . Est un POJO : Plain Old Java Object .
 * A un constructeur public et sans paramètre.
 * A un getter et un setter par attribut.
 * 
 * <message>
 *    <taille>3</taille>
 *    <emetteur>jeanjean</emetteur>
 *    <destinataire>sophie</destinataire>
 *    <message>salut, ça va</message> 
 * </message>
 * 
 */
public class Message {
   
    private int taille;
    private String message;
    private String emetteur;
    private String destinataire;

    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getEmetteur() {
        return emetteur;
    }
    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }
    public String getDestinataire() {
        return destinataire;
    }
    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    

}
