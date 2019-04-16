package fr.algorithmie;

/**
 * @author Jean-Baptiste
 *
 */
public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// affichage des éléments dans l'ordre
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		// affichage dans l'ordre inverse
		System.out.println("Affichage du tableau dans l'ordre inverse.");
		for (int i = array.length - 1; i > -1 ; i--) {
			System.out.println(array[i]);
		}
		
		// copie du tableau
		int[] arrayCopy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
		}
		System.out.println("Test, dernier nombre du tableau : " + arrayCopy[arrayCopy.length-1]);
	}

}
