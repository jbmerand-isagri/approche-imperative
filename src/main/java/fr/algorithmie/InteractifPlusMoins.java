package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Jean-Baptiste
 *
 */
public class InteractifPlusMoins {

	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 100) + 1;
		int quantityOfTries = 0;
		int userValue = 0;
		Scanner scanner = new Scanner(System.in);

		while (userValue != randomNumber) {
			System.out.println("Veuillez saisir une valeur entre 1 et 100 compris.");
			userValue = scanner.nextInt();
			quantityOfTries++;
			if (userValue > randomNumber) {
				System.out.println("Ce nombre est trop grand.");
			} else if (userValue < randomNumber) {
				System.out.println("Ce nombre est trop petit.");
			} else if (userValue == randomNumber) {
				System.out.println("Bravo, vous avez trouvé !\nIl vous a fallu " + quantityOfTries + " coups pour réussir.");
			}
		}

		scanner.close();
	}

}
