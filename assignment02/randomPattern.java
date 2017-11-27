// Ciara McMullin
// 17 February 2017
// a program that gets two characters from the user and generates a random
// pattern that is 100 by 100

import java.util.*;
public class randomPattern {
	public static void main(String[] args) {
		// get two characters from user
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 2 characters to use to generate a random pattern: ");
		String letters = input.next();
		// split string and get indiviual characters
		char firstChar = letters.charAt(0);
		char secondChar = letters.charAt(1);
		

		// create two for loop to output results
		for (int i=1; i <= 100; i++) {
			for (int u=1; u <=100; u++) {
				// use random method to get random pattern
				int tmp = (int) ( Math.random() * 2 + 1);
				if (tmp == 1) {
					System.out.print(firstChar);
				} else  if (tmp == 2) {
					System.out.print(secondChar);
				}
				
				
			}
			System.out.print("\n");
		} 
	}
}



