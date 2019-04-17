package fr.algorithmie;

/**
 * @author Jean-Baptiste
 *
 */
public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int sumOfNumbers = 0;
		for (int i : array) {
			sumOfNumbers = sumOfNumbers + i;
		}
		float averageOfNumbers = sumOfNumbers / array.length;
		System.out.println("La moyenne des éléments d'array est : " + averageOfNumbers);
	}

}
