// Ciara McMullin
// 20 February 2017
// a program that will take in an array of integers, find any duplicates in the array, 
// and then return another integer array without any duplicate values
import java.util.*;
public class dupeEliminator {
	public static void main(String[] args) {
		// get number of ints from user
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers do you want to enter?");
	    int num = input.nextInt();
	    int [] arraysInts = new int[num];
	    // get ints from user and store in an array
	    System.out.print("Enter numbers: ");
	    for (int i = 0 ; i < arraysInts.length; i++ ) {
	    	arraysInts[i] = input.nextInt();
	        }
	    // output results
	    System.out.println(Arrays.toString(removeDuplicates(arraysInts)));
	    }
		
	// create method to get unique integers
	public static int[] removeDuplicates (int[] list) {
		// create new array and accumulator for array length
		boolean duplicate = false;
		int [] removed = new int[list.length];
		int count = 0;
		int x= 0;
		// use two for loops to create new list without duplicates
		for (int i =0; i < list.length; i++) {
			for (int j=0; j <removed.length;j++) {
				if ( removed[j] == list[i]) {
					duplicate = true;
					break;
				}	
			}
			 if (duplicate == false) {
				removed[i] = list[i];
			}
			duplicate = false;
		}
		// array puts a value of 0 into duplicate places so remove those 0's
		for (int k =0; k < list.length; k++) {
			if (list[k] == removed[k]) {
				count ++;
			}
		}
		int [] unique = new int[count];
		for (int l = 0; l < list.length; l++ ) {
			if (list[l] == removed[l]) {
				unique[x] = removed[l];
				x++;
			}
		}
		
		// return unique array
		return unique;
		
	}
	
	}

