// Ciara McMullin
// February 20 2017
// a program that generates 20 random digits (0-9) and counts
//how many times each digit appears in the first array. 

import java.util.*;
public class countDigits {
	public static void main(String[] args) {
		// create an array
		int [] numbers = new int[20];
		int [] counts = new int[10];
		// create for loop to generate 20 random numbers between 0-9
		for (int i=0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
			System.out.print(numbers[i]);
		}
		// use for loop to count occurrence of each number
		System.out.print("\n");
		for (int u =0; u < numbers.length; u++) {
			counts[numbers[u]]++;
			
		}
		//output results
		for (int x=0; x<10; x++) {
			if (counts[x] > 0 && counts[x] != 1) {
				System.out.print("There were " + (counts[x]) + " "+ x + "'s \n");
				
			}
			else if (counts[x] == 0) {
				System.out.print("There were no "+ x + "'s \n");
			}
			else if (counts[x] ==1) {
				System.out.print("There was 1 "+ x + "\n");
			}
			
		}
	
	}
	

}

