// Ciara McMullin
// 02 May 2017
// Intro to Comp Sci
// a program designed to test the index using exceptions

// import java
import java.util.*;

public class OutOfBounds {
	
	public static void main(String[] args) {
		
		// create array 
		int [] randomArrays = new int [100];
		
		// fill with random ints from 0-9
		for (int i = 0; i < randomArrays.length; i++){
			int rand = (int) (Math.random() * 10);
			randomArrays[i] = rand;
		}
		
		// get user input for index
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an index: " );
		int index = input.nextInt();
		
		// call method to checl
		System.out.println(checkIndex(index));
		}
	
	// method to check if index is in bounds
	public static int checkIndex(int index) throws ArrayIndexOutOfBoundsException{
		if (index <= 0 || index > 100) {
			throw new ArrayIndexOutOfBoundsException("Index is invalid!");
		}
		else {
			return index;
			
		}
	}
	
	}
