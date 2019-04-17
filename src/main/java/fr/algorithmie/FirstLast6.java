package fr.algorithmie;

/**
 * @author Jean-Baptiste
 *
 */
public class FirstLast6 {

	public static void main(String[] args) {

		int[] array = new int[0];
		boolean isMatchingArray = false;

		if (array.length > 0) {
			if (array[0] == 6 || array[array.length - 1] == 6) {
				isMatchingArray = true;
			}
		}
	}

}
