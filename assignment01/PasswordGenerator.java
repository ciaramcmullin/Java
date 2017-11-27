// Ciara McMullin
// Intro to Comp Sci
// 2/1/17
// Assignment 1

//RaNd0m password generator: a program to generate a pseudo-random password of 6 character
import java.util.*;

public class PasswordGenerator {
	public static void main(String[] args) {
		
		// get random letters
		int firstLetter =  (97 + (int) (Math.random() * 26));
		int secondLetter = (int) (Math.random() * 10);
		int thirdLetter =  65 + (int) (Math.random() * 26);
		int fourthLetter = 97 + (int) (Math.random() * 26);
		int fifthLetter = (int) (Math.random() * 10);
		int sixthLetter = (int) (Math.random() * 10);
		
		// output results
		System.out.println("Generated password: " + (char) firstLetter + String.valueOf (secondLetter) + (char) thirdLetter + (char) fourthLetter + String.valueOf (fifthLetter) + String.valueOf(sixthLetter));
		
		
	}

}
