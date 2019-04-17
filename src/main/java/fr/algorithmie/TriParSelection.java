package fr.algorithmie;

/**
 * @author Jean-Baptiste
 *
 */
public class TriParSelection {

	public static void main(String[] args) {
		
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		int minValue = Integer.MAX_VALUE;
		int indexOfMinValue = 0;
		
		for (int j = 0; j < array2.length; j++) {
			for (int i = j; i < array2.length; i++) {
				if (array2[i] < minValue) {
					minValue = array2[i];
					indexOfMinValue = i;
				}
			}
			// swaps values
			array2[indexOfMinValue] = array2[j];
			array2[j] = minValue;
			minValue = Integer.MAX_VALUE;
		}
		
		// displays to verify
		for (int i : array2) {
			System.out.println(i);
		}
	}
}
