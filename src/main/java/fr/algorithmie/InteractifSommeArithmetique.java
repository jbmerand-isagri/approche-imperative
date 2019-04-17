package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Jean-Baptiste
 *
 */
public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		int somme = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir une valeur :");
		int valeur = scanner.nextInt();
		System.out.println("Vous avez saisi la valeur " + valeur);

		scanner.close();
		
		for (int i = 1; i < valeur+1; i++) {
			somme = somme + i;
		}
		
		System.out.println("La somme de tous les entiers compris entre 1 et ce nombre est : \n" + somme + ".");


	}

}
