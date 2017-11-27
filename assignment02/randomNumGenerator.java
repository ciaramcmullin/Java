// Ciara McMullin
// 17 February 2017
// a program that generates a random number between a lower int and upper int
// the main method calls the randomNum method to generate random numbers until 
// the random number equals 50

public class randomNumGenerator {
	public static void main(String[] args) {
		// call the randomNum method
		int num = randomNum(0,100);
		// set up accumulator
		int tries = 1;
		System.out.print(num + "\n");
		// create while loop until random number equals 50 then break
		while (num != 50) {
			num = randomNum(0,100);
			System.out.print(num + "\n");
			tries++;
		}
		// output results
		String strTries = tries + "";
		
		System.out.print("It took " + strTries + " tries to get a 50" );		
	}
	// create method to find a random number between two values; use Math.random()
	public static int randomNum (int lower, int upper) {
		int randomNum = (int) (((Math.random() * (upper-lower)) + 1) + lower);
		return randomNum;
	}
	

}
