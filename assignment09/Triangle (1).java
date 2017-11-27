// Ciara McMullin
// 02 May 2017
// Intro to Comp Sci
// a program designed to create a triangle subclass from the geometric object class

public class Triangle extends GeometricObject {
	
	// create variables
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	
	// no arg constructor
	Triangle() {}
	
	
	// constructor with sides and checks for exception
	Triangle(double side1, double side2, double side3) throws IllegalArgumentException{
		if ((side1+side2 > side3) || (side3+side2 > side1) || (side3+side1 > side2)){
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		} else {
			throw new IllegalArgumentException("Sum of any 2 sides must be greater than other side!");
		}
		
		
	}
	
	// getters 
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public double getArea(){
		double side4 = (side1 + side2 + side3 )/ 2 ;
		double area = Math.sqrt(side4 * (side4 - side1) * (side4 - side2) * (side4 - side3));
		return area;
	}
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	// method to return sides of triangle as string
	public String toString(){
		return "Triangle: side 1 = " + side1 + ", side2 = " + side2 + ",side 3 = " + side3;
		
	}
	
	
	
	

}
