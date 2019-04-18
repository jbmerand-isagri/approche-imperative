package fr.algorithmie;

/**
 * @author Jean-Baptiste
 * version 2.0 : gestion des doublons
 */
public class ComparaisonTableau {

	public static void main(String[] args) {
		Integer[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, -1, -1, 3, 0, 14, -4};
		Integer[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		int sharedElements = 0;
		
		for (Integer i : array2) {
			for (Integer j : array1) {
				if (i.equals(j)) {
					sharedElements = sharedElements + 1;
					j = null;
					break; // faudrait break la boucle sur array2
				}
			}
		}
		
		// displays to verify
		System.out.println("Nombre d'éléments en commun : \n" + sharedElements);
		
	}

}
