package assignment7;
// Ciara McMullin
// Intro to Comp Sci
// 14 April 2017
// a program that takes a string as input and removes specific characters and returns new
// sanitized String

public class Sanitizer {
	
	// create variab;es
	static String x;
	
	
	//create private constructor so user cannot make instance of class
	private Sanitizer() {
	}
	
	// create static method to sanitize data
	static String sanitize(String x) {
		String y = x.replaceAll("[#!*$%&]", "");
		return y;
	}
	

}
