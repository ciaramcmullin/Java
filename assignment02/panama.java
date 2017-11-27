// Ciara McMullin
// 16 February 2017
// program that contains the 3 methods that takes in a string, reverses it,
// and checks whether or not a string is a palindrome

import java.util.*;
public class panama {
	public static void main(String[] args) {
		// get word from user using input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to check if it's a palindrome: ");
		String strWord = input.next();
		// call the reverse method to reverse word from user
		String newWord = reverse(strWord);
		// call the check method to see if palindrome
		String answer = check(strWord);
		// output results
		if (answer.equals("True")) {
			System.out.println(strWord +" is, in fact a palindrome.");
		} else {
			System.out.println(strWord + " is not a palindrome.");
		}
		
	}
	// method to reverse the word
	public static String reverse (String strWord) {
		String result = "";
		for (int i=(strWord.length()-1); i >= 0; i--) {
			result = result + strWord.charAt(i);
		
		}
		return result;
	}
	// method to see if the word equals the reversed word
	public static String check (String strWord) {
		String newWord = reverse(strWord);
		String answer1 = "True";
		String answer2 = "False";
		if (strWord.equals(newWord)) {
			return answer1;
		} else {
			return answer2;
		}
		
		
	}
}