// Ciara McMullin
// Intro to Comp Sci
// Array of Balls using processing: using processing, create array of balls using the ball
// class. when user clicks on screen the balls should drop one pixel at a time
// 30 March 2017
import processing.core.PApplet;

public class ArrayOfBalls extends PApplet{
	static Ball[] ballArray = new Ball[10];
	
    public static void main(String[] args) {
        PApplet.main("ArrayOfBalls"); 
     
        int size = 30;
    	int xPos = 60;
    	int yPos = 30;
    	// create array of ball objects
    	for (int i = 0; i <ballArray.length; i++) {
       		ballArray[i] = new Ball(size, xPos, yPos);
    		ballArray[i].setPosition(xPos, yPos);
    		xPos += 40;
    	}

    }
   
    // set up dimensions
    public void settings(){
        size(500,500);
    }
    // make initial background white
    public void setup(){
        background(255);
    }
    
    public void draw(){
    	background(255);

        // use for loop to draw the 10 balls
    	for (int j = 0; j <ballArray.length; j++) {
    		fill(0,0,100);
    		ellipse(ballArray[j].getXPosition(),ballArray[j].getYPosition(),ballArray[j].getSize(), ballArray[j].getSize());
    		if (mousePressed == true) {
    			ballArray[j].drop();
    		}
    	}
    }
}


