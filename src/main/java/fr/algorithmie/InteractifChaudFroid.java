package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Jean-Baptiste
 *
 */
public class InteractifChaudFroid {

	public static void main(String[] args) {
		int valeur = 0;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Veuillez saisir une valeur entre 1 et 10 :");
			valeur = scanner.nextInt();
			if (valeur > 0 && valeur <= 10) {
				System.out.println("Vous avez saisi la valeur " + valeur);
			} else if (valeur > 10){
				System.out.println("Ce nombre est trop grand, veuillez recommencer.");
			} else {
				System.out.println("Ce nombre est trop petit, veuillez recommencer");
			}
			
		} while (valeur < 1 || valeur > 10);

		scanner.close();

	}

}
