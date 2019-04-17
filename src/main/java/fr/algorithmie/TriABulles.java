package fr.algorithmie;

/**
 * @author Jean-Baptiste
 *
 */
public class TriABulles {

	public static void main(String[] args) {
		
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		int savedValue = 0;
		int swapQtty = 0;
		
		do {
			swapQtty = 0;
			for (int i = 0; i < array2.length-1; i++) {
				if (array2[i+1] < array2[i]) {
					savedValue = array2[i];
					array2[i] = array2[i+1];
					array2[i+1] = savedValue;
					swapQtty++;
				}
			}
		} while (swapQtty > 0);
		
		// displays to verify
		for (int i : array2) {
			System.out.println(i);
		}
	}
}
