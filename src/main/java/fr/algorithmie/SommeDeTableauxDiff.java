package fr.algorithmie;

/**
 * @author Jean-Baptiste
 *
 */
public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };

		
		// finds the right length (biggest array) for the new array and stores it
		int lengthOfBiggestArray = array2.length;
		if (array1.length > array2.length) {
			lengthOfBiggestArray = array1.length;
		}
		
		// creates the new array
		int[] sumOfArrays = new int[lengthOfBiggestArray];
		for (int i = 0; i < array2.length; i++) {
			sumOfArrays[i] = array2[i]; 
		}
		for (int i = 0; i < array1.length; i++) {
			sumOfArrays[i] = sumOfArrays[i] + array1[i];
		}
		
		// displays to verify
		for (int i : sumOfArrays) {
			System.out.println(i);
		}
	}

}
