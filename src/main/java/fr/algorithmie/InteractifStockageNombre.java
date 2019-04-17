package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Jean-Baptiste
 *
 */
public class InteractifStockageNombre {

	public static void main(String[] args) {
		int[] values = new int[0];
		int valeur = 0;
		
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("****** MENU ****** \n 1. Ajouter un nombre. \n 2. Afficher les nombres existants. \n 3. Pour quitter.");			
			System.out.println("\nSaisir votre choix :");
			valeur = scanner.nextInt();
			
			if (valeur == 1) {
				int[] tempArray = new int[values.length+1];
				System.out.println("Saisissez la valeur à ajouter :");
				int valeur2 = scanner.nextInt();
				for (int i = 0; i < values.length; i++) {
					tempArray[i] = values[i];
				}
				tempArray[tempArray.length-1] = valeur2;
				values = tempArray;
			} else if (valeur == 2) {
				System.out.println("Voici les valeurs contenues dans le tableau : ");
				if (values.length == 0) {
					System.out.println("Aucune valeur n'a encore été entrée.\n");
				}
				
				for (int i : values) {
					System.out.println(i);
				}
			}
		} while (valeur != 3);
		
		scanner.close();
	}

}
