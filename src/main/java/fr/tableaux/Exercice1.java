package fr.tableaux;

/**
 * @author Jean-Baptiste
 *
 */
public class Exercice1 {

	public static void main(String[] args) {
		int[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(tab[0]);
		System.out.println(tab[9]);
		System.out.println(tab.length);
		// l'entier 5 se situe à l'index 4
		// System.out.println(tab[10]);
		// une erreur se produit : ArrayIndexOutOfBoundsException
		// car l'index 10 sort du tableau (le maximum possible étant le 9)
		tab[4] = 8;
	}

}
