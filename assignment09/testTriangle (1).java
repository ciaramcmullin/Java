// Ciara McMullin
// 02 May 2017
// Intro to Comp Sci
// a program to test the subclass triangles

import java.util.*;

public class testTriangle {
	
	public static void main(String[] args){
		
		//create arraylist of triangle objects
		
		ArrayList<Triangle> triangles = new ArrayList<Triangle>();
		
		// declare sides
		
		int side1 = 5;
		int side2 = 4;
		int side3 = 3;
		
		// try catch block to check for exceptions
		// create 5 triangle objects
		
		try {
			for (int i = 0; i < 6; i++){
				Triangle t = new Triangle(side2, side2, side3);
				if (i%2 == 0){
					t.setColor("blue");
					t.setFilled(true);
				} else {
					t.setColor("red");
					t.setFilled(false);
				}
				
				triangles.add(t);
			} 
		} catch(IllegalArgumentException e) {
				System.out.println(e);
		}
		
		// output results
		
		for (Triangle t: triangles){
			System.out.println("Side 1: " + t.getSide1() + " " + "Side 2: " 
		    + t.getSide2() + " " + "Side 3: " + t.getSide3() + " " + "Color: " + t.getColor()
		    + " " + "Is Filled: " + t.isFilled());
		}
}

}