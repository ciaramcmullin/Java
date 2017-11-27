// Ciara McMullin
// 24 April 2017
// a subclass that extends from the enemy class

public class Level1Enemy extends Enemy {
	
	// create speed variable
	
	int speed = 1;
	
	// constructor
	
	Level1Enemy(int xPos, int yPos, int health){
		setX(xPos);
		setY(yPos);
		setHealth(health);
	}
	
	//methods
	
	public void move(){
		int xPos = getX();
		xPos += speed;
		setX(xPos);
	}

}
