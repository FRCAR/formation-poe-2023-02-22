package com.bigcorp.formation;

/**
 * Classe sans package : une très mauvaise habitude. Utile pour les tests et la
 * formation mais à ne pas reproduire chez vous :D.
 *
 */
public class MaPremiereClasseBienPackagee {

	private static Object monObjetStatique;

	private Object monObjet;
	private Object monObjet2;

	public int maMethode(){
		Object monAutreObject = new Object();
		monObjet = monAutreObject;
		return 3;
	}

	// La méthode main ci-dessous est appelée lorsque l'on lance java
	// avec le nom de cette classe-ci
	/*
	 * 
	 * Ici, on  a un bloc de commentaire
	 * 
	 */



	 public static int getCompteur(){
		return 4;
	 }








	 /**
	  * Cette méthode est exécutée lorsqu'on lance : java MaPremiereClasse 
	  * @param args
	  */
	public static void main(String[] args) {
		// La commande suivante affiche : "Salut !" sur la console
		System.out.println("Salut ! "); // fin de ligne
		Object monAutreObject = new Object();
		
	}

}
