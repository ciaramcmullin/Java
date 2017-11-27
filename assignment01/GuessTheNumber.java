// Ciara McMullin
// Intro to Comp Sci
// Feb. 2 2017
// Assignment 01 

// Guess the Number Program: a program that generates a random number between 0 and 9 and then asks user to guess
import java.util.*;
public class GuessTheNumber {
	public static void main(String[] args){
		// get random number from 0 to 9
		// use Math.random() to get number from 0 to 1.0 so multiply by 10
		// cast the number so it is integer
		int num = (int) (Math.random() * 10);
		// ask user for guess
		Scanner input = new Scanner(System.in);
		System.out.print("Guess a number between 0 and 9: ");
		double guess = input.nextDouble();
		// check to see if guess equals random number or if it is too high or low
		if (guess == num){
			System.out.println("You got it! The number was " + num);
		} else if (guess > num){
			System.out.println("Too high. The number was " + num);
		} else {
			System.out.println("Too low. The number was " + num);
		}
		
		
		
				
		
	}

}
