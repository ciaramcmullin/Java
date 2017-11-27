// Ciara McMullin
// 24 April 2017
// class that extends the enemy class

public class Level2Enemy extends Enemy{
	
	// default constructor
	
	Level2Enemy(){
	}
	
	// constrcutor
	
	Level2Enemy(int xPos, int yPos, int health) {
		setX(xPos);
		setY(yPos);
		setHealth(health);
	}
	
	// methods
	
	public void fire(){
		System.out.println("PEW PEW");
	}

}
