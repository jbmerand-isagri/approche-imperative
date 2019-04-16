package fr.algorithmie;

/**
 * @author Jean-Baptiste
 *
 */
public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] arrayCopy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[(array.length-1) - i];
		}
		// affichage des valeurs du tableau array
		System.out.println("*** CONTENU DU TABLEAU array ***");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// affichage des valeurs du tableau arrayCopy
		System.out.println("*** CONTENU DU TABLEAU arrayCopy ***");
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.println(arrayCopy[i]);
		}
	}

}
