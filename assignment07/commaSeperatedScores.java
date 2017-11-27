// Ciara McMullin
// Intro to Comp Sci
// 16 April 2017
// program that asks user to enter a list of comma separated scores of type double and returns
// average pf te given scores

import java.util.*;

public class commaSeperatedScores {
	public static void main(String[] args){
		
		double total = 0;
		int count = 0;
		
		//get double scores from user
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the string of scores, separated by commas:");
		String x = input.nextLine();
		
		//split scores and convert to double
		String [] xSplit = x.split(",");
		
		// get average
		for (int i = 0; i < xSplit.length; i++) {
			double value = Double.parseDouble(xSplit[i]);
			total += value;
			count ++;
		}
		
		//output results
		System.out.println("Average score is " + total/count);
		
		
	}

}
