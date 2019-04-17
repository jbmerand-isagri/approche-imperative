package fr.algorithmie;

/**
 * @author Jean-Baptiste
 *
 */
public class FirstLast {

	public static void main(String[] args) {

		int[] array = new int[9];
		boolean isMatchingArray = false;

		if (array.length >= 1) {
			if (array[0] == array[array.length - 1]) {
				isMatchingArray = true;
			}
		}
		// displays result
		System.out.println(isMatchingArray);
	}

}
