package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Jean-Baptiste
 * 
 */
public class Interactif21Batons {

	public static void main(String[] args) {
		
		// VARIABLES
		int remainingSticks = 21;
		int playerChoice = 0;
		int computerChoice = 0;
		int turnCounter = 0;
		boolean isUserWinner = false;
		boolean isComputerWinner = false;
		Scanner scanner = new Scanner(System.in);
		
		// PROGRAM
		System.out.println("******** JEU DES BATONS ********");
		System.out.println("Règles : il y a 21 batons. L'ordinateur est l'autre joueur.\nA chaque tour, un joueur choisit entre 1 et 3 batons.\nSi jamais il prend le dernier baton, il perd.\n");
		
		// 1 iteration = 1 complete turn
		while (remainingSticks > 0) {
			turnCounter++; 
			// user turn
			do {
				System.out.println("**********\nTOUR DU JOUEUR N°" + turnCounter + " :\n**********");
				System.out.println("Combien de batons prenez-vous (1 à 3) ?");
				playerChoice = scanner.nextInt();
			} while (playerChoice < 1 || playerChoice > 3);
			
			remainingSticks -= playerChoice;
			if (remainingSticks <= 0) {
				isComputerWinner = true;
				break;
			} else {
				System.out.println("=> Il reste " + remainingSticks + " batons.\n----------");
			}
			
			// computer turn
			System.out.println("**********\nTOUR DE L'ORDINATEUR N°" + turnCounter + " :\n**********");
			Random randNumber = new Random(); // creates random object
			computerChoice = randNumber.nextInt(3) + 1; // number from 1 to 3
			System.out.println("L'ordinateur prend " + computerChoice + " baton(s).");
			remainingSticks -= computerChoice;
			if (remainingSticks <= 0) {
				isUserWinner = true;
				break;
			} else {
				System.out.println("=> Il reste " + remainingSticks + " batons.\n----------");
			}
	
		}
		
		// displays the defeat or victory message
		if (isUserWinner == true) {
			System.out.println("Bravo, vous avez gagné !!");
		} else if (isComputerWinner == true){
			System.out.println("GAME OVER :/\nL'ordinateur gagne !");
		}
	
		scanner.close();
	}

}
