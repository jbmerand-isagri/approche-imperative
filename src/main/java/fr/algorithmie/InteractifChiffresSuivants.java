package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Jean-Baptiste
 *
 */
public class InteractifChiffresSuivants {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir une valeur :");
		int valeur = scanner.nextInt();
		System.out.println("Vous avez saisi la valeur " + valeur);

		scanner.close();
		
		System.out.println("Les 10 nombres qui suivent " + valeur + " sont :");
		for (int i = 1; i < 11; i++) {
			System.out.println(valeur + i);
		}

	}

}
