// Ciara McMullin
// 24 April 2017
// main class that creates new enemy 1 and 2 objects 

// import java

import java.util.*;


public class Game {
	
	public static void main(String[] args){
		
		// create two instances of enemy1 and enemy 2 classes
		
		Level1Enemy enemy1 = new Level1Enemy(50, 50, 150);
		
		Level2Enemy enemy2 = new Level2Enemy(75,75,200);
		
		// use math class to get two random numbers
		
		int hit1 = (int) (Math.random() * 10);
		
		int hit2 = (int)(Math.random() * 10);
		
		// update instances
		
		// output results
		
		enemy1.hit(hit1);
		
		System.out.println("The health of enemy 1 is now: " + enemy1.getHealth());
		
		enemy2.hit(hit2);
		
		System.out.println("The health of enemy 2 is now: " + enemy2.getHealth());
		
		enemy1.move();
		
		System.out.println("Enemy 1 X position: " + enemy1.getX());
		
		System.out.println("Enemy 1 Y position: " + enemy1.getY());
		
		enemy2.fire();
		
	}

}
