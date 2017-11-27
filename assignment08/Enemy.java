// Ciara McMullin
// 24 April 2017
// a super enemy class that will be used for two subclasses to make enemy objects

public class Enemy {
	
	// create private variables
	
	private int xPos;
	private int yPos;
	private int health;
	
	
	// default constructor
	
	Enemy(){
		xPos = 100;
		yPos = 50;
		health = 100;
	}
	
	
	// constructors
	
	Enemy (int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	Enemy(int xPos, int yPos, int health) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.health = health;
	}
	
	// make setters and getters to update and get private variables
	
	public void hit(){
		this.health = health - 10;
	}
	
	public void hit(int amount) {
		this.health = health-amount;
	}
	
	public void setX(int xPos){
		this.xPos = xPos;
	}
	
	public void setY(int yPos){
		this.yPos = yPos;
	}
	public void setHealth(int health){
		this.health = health;
	}
	public int getX(){
		return xPos;
	}
	
	public int getY(){
		return yPos;
	}
	
	public int getHealth(){
		return health;
	}
	

}
