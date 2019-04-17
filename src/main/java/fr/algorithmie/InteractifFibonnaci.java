package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Jean-Baptiste
 *
 */
public class InteractifFibonnaci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int finalNumber = 1;
		int nMinus1 = 1;
		int tempValue = 0;

		System.out.println("Veuillez saisir le rang du nombre voulu dans la suite de Fibonnaci :");
		int userValue = scanner.nextInt();
		if (userValue == 1) {
			finalNumber = 0;
		} else {
			for (int i = 4; i < userValue + 1; i++) {
				tempValue = finalNumber;
				finalNumber = finalNumber + nMinus1;
				// prépare les valeurs pour la prochaine boucle
				nMinus1 = tempValue;
			}
		}

		System.out.println("Le nombre au rang " + userValue + " est : " + finalNumber);

		scanner.close();
	}

}
