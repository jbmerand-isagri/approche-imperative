package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Jean-Baptiste
 *
 */
public class InteractifTableMult {

	public static void main(String[] args) {
		int valeur = 0;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Veuillez saisir une valeur entre 1 et 10 :");
			valeur = scanner.nextInt();
			if (valeur > 0 && valeur <= 10) {
				System.out.println("Vous avez saisi la valeur " + valeur);
			} else {
				System.out.println("Votre nombre est incorrect.");
			}
			
		} while (valeur < 1 || valeur > 10);

		scanner.close();
		
		System.out.println("Table de " + valeur + " :");
		for (int i = 1; i < 11; i++) {
			System.out.println(valeur + " * " + i + " = " + valeur * i);
		}
	}
}
