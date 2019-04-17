package fr.algorithmie;

/**
 * @author Jean-Baptiste
 *
 */
public class SommeDeTableaux {

	public static void main(String[] args) {
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		int[] sumOfArray = new int[array1.length];
		for (int i = 0; i < sumOfArray.length; i++) {
			sumOfArray[i] = array1[i] + array2[i];
		}
		
		// affichage du tableau pour test
		for (int i : sumOfArray) {
			System.out.println(i);
		}
	}

}
