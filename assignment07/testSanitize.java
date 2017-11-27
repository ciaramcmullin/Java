package assignment7;
// Ciara McMullin
// Intro to Comp Sci
// 16 April 2017
// test class for santizier class

public class testSanitize {
	
	public static void main(String[] args){
		
		// create unsantized variab;e
		String unsantized = "h!e*l#l%o";
		
		// call static method
		String santizied = Sanitizer.sanitize(unsantized);
		
		// output results
		System.out.println("Before the string is: " + unsantized);
		System.out.println("After is it: " + santizied);
		
		
		
		
	}
	
	
	

}
