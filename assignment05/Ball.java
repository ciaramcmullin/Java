// Ciara McMullin
// Intro to Comp Sci
// 30 March 2017
// Ball class: class created to construct a ball object for class arrayOfBalls

public class Ball {
	// create private variables
	private int size;
	private int xPos;
	private int yPos;
	// construct a ball object
	public Ball(int startSize, int startX, int startY) {
		size = startSize;
		xPos = startX;
		yPos = startY;
		}
	// create methods
	public int setSize(int newSize) {
		return size = newSize;
	}
	public void setPosition(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public int getXPosition () {
		return xPos;
	}
	public int getYPosition(){
		return yPos;
	}
	public int getSize(){
		return size;
	}
	public int drop(){
		return yPos ++;
		
	}
}
