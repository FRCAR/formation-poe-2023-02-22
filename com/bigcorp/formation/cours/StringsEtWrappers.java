package com.bigcorp.formation.cours;

import java.util.Scanner;

public class StringsEtWrappers{
	
	
	public static void main(String[] args) {
        
        //Chaîne de caractère
		String maChaine = "ma chaîne";
		
		// Autoboxing
		Integer monInstanceDe4 = 4;
        
        // Unboxing
		int sommeDe4Et5 = monInstanceDe4 + 5;
        
        // Conversion d'une String en classe Float
		float monFloat = Float.parseFloat("45.3");
        
        // Conversion du float en String
		Float monInstanceDeFloat = monFloat;
		monInstanceDeFloat.toString();
		
		double sommeDeTout = monInstanceDeFloat + monInstanceDe4;

        // Saisir au clavier et affecter la saisie a une variable
		// Scanner devrait être utilisé plus 'proprement'
		// La suite du cours expliquera commment
		Scanner scannerClavier = new Scanner(System.in);
		System.out.println("Veuillez entrer une chaîne de caractères");
		String venantDuClavier = scannerClavier.nextLine();
		System.out.println("La chaine de caractères vaut  " + venantDuClavier);
        
        // Recuperer un double
		Double monDoubleVenantDuClavier = Double.parseDouble(venantDuClavier);
		System.out.println("Le triple de la valeur rentrée au clavier vaut : "  + 3 * monDoubleVenantDuClavier);
		
		
	}
}