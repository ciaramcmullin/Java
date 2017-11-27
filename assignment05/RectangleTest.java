// Ciara McMullin
// Rectangle test: class that creates two rectangles that will create two rectangles
// and print out perimeter, area, and count
// 24 March 2017
// Intro to Comp Sci

public class RectangleTest {
	public static void main(String[] args) {
		// create rectangle with no-arg constructer
		Rectangle rect1 = new Rectangle();
		// output results of rect1
		System.out.println("The area of Rectangle 1 is " + rect1.getArea());
		System.out.println("The perimeter of Rectangle 1 is " + rect1.getPerimeter());
		System.out.println("The count now is " + rect1.counter);
		// create rectangle with passing in width and height
		Rectangle rect2 = new Rectangle(6,4);
		// output results
		System.out.println("The area of Rectangle 1 is " + rect2.getArea());
		System.out.println("The perimeter of Rectangle 1 is " + rect2.getPerimeter());
		System.out.println("The count now is " + rect2.counter);
	}

}
