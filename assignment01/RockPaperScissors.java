// Ciara McMullin
// intro to Comp Sci
// Feb. 2 2017
// Assignment 01

// Rock, Paper, Scissors: randomly generate a number of 0, 1, or 2 to represent Rock, Paper, Scissors.
// Have the program then prompt the user to enter a 0, 1, or 2 and then display a message of who won

import java.util.*;
public class RockPaperScissors {
	public static void main(String[] args){
		// set max and min and variables
		int max = 2;
		int min = 0;
		int weapon;
		int Scissors = 2;
		int Paper = 1;
		int Rock = 0;
		
		// get a random move from the computer between 0 and 2 exclusively
		int range = (max-min) + 1;
		int num = (int) (min + (Math.random()*2));
		
		// get guess from user
		Scanner input = new Scanner(System.in);
		// ask user to choose weapon
		System.out.print("Choose your weapon rock(0), paper(1), scissors(2): ");
		weapon = input.nextInt();
		// check to see who wins or if it is a draw
		if (((weapon == 0) && (num == 2)) || ((weapon == 2) && (num == 0))) {
			if (weapon == 0)
				System.out.println("Rock crushes scissors. You Win!");
			else
				System.out.println("Rock crushes scissors. You lose!");
			
			}
		else if (((weapon == 0) && (num == 1)) || ((weapon == 1) && (num == 0))) {
				if (weapon == 0)
					System.out.println("Paper covers rock. You lose!");
				else
					System.out.println("Paper covers rock. You win!");
			}
		else if (((weapon == 2) && (num == 1)) || ((weapon == 1) && (num ==2))) {
				if (weapon == 2)
					System.out.println("Scissors cuts paper. You win!");
				else
					System.out.println("Scissors cuts paper. You lose!");
			}
		else if (((weapon == 0) && (num == 0)) || ((weapon == 1) && (num ==1)) || ((weapon == 2) && (num == 2)) ) {
				System.out.println("Its a draw!");
			}
					
				
		
			
				
			
			
		}
		
		
		
		
		
		
		
		
				
		
	}


