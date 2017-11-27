// Ciara McMullin
// Rectangle class: class that will create a no-arg constructor and
// a constructor with a given height and width; will return area and perimeter of each
// 24 March 2017
// Intro to Comp Sci
public class Rectangle {
	// create static counter
	static int counter = 0;
	double width;
	double height;
	// construct rectangle object
	Rectangle(){
		width = 1;
		height = 1;
		counter ++;
	}
	// construct rectangle object with passing arguments
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
		counter ++;
	}
	// return area of rectangle
	double getArea(){
		return (width * height);
	}
	// return area of perimeter
	double getPerimeter(){
		return((2*width) + (2*height));
	}

}
