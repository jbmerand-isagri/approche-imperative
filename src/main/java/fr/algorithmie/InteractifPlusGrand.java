package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Jean-Baptiste
 *
 */
public class InteractifPlusGrand {

	public static void main(String[] args) {
		int maxValue = Integer.MIN_VALUE;
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i < 11; i++) {
			System.out.println("Saisir valeur n°" + i + " :");
			int valeur = scanner.nextInt();
			if (maxValue < valeur) {
				maxValue = valeur;
			}
		}
		
		System.out.println("Le plus grand de ces nombres est : " + maxValue + "." );
		scanner.close();

	}

}
