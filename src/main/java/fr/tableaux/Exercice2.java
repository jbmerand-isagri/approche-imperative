package fr.tableaux;

/**
 * @author Jean-Baptiste
 *
 */
public class Exercice2 {

	public static void main(String[] args) {
		int[][] tab = new int[2][];
		tab[0] = new int[3];
		tab[1] = new int[5];
		System.out.println("La longueur du tableau est : " + tab.length);
		System.out.println("La longueur de la première ligne est : " + tab[0].length);
		System.out.println("La longueur de la seconde ligne est : " + tab[1].length);
		System.out.println("Le premier élément du tableau est : " + tab[0][0]);
		
		// test
		tab[1][4] = 9;
		
		// afficher dernier élément en utilisant length
		int line = (tab.length)-1;
		int row = (tab[line].length)-1;
		System.out.println("Le dernier élément est : " + tab[line][row]);
	}
}
