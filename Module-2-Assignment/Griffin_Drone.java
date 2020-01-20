//Author Name: Gregory Allen Griffin
//Date: 1/15/2020
//Program Name: Griffin_Drone
//Purpose: Simulation using button, drone movement in x, y,z location

import java.util.Scanner;


class Control {
	
	private int pos_x;
	private int pos_y;
	private int pos_z;
	
	//setter
	public void setX(int x) {
		pos_x = x;
	}
	//getter
	public int getX() {
		return pos_x;
	}
	public int incX() {
		return pos_x++; //increase x value by 1
	}
	public int decX() {
		return pos_x--; //decrease x value by 1
	}
	
	//setter
	public void setY(int y) {
		pos_y = y;
	}
	//getter
	public int getY() {
		return pos_y;
	}
	public int incY() {
		return pos_y++; //increase y value by 1
	}
	public int decY() {
		return pos_y--; //decrease y value by 1
	}
	
	//setter
	public void setZ(int z) {
		pos_z = z;
	}
	//getter
	public int getZ() {
		return pos_z;
	}
	public int incZ() {
		return pos_z++; //increase z value by 1
	}
	public int decZ() {
		return pos_z--; //decrease z value by 1
	}
	
	//public method(s) in response to user input to control drone direction
	public void up() {
		System.out.println("You have moved up");
	}
	public void down() {
		System.out.println("You have moved down");
	}
	public void forward() {
		System.out.println("You have moved forward");
	}
	public void backward() {
		System.out.println("You have moved backward");
	}
	public void left() {
		System.out.println("You have turned left");
	}
	public void right() {
		System.out.println("You have turned right");
	}
	public void displayPosition() {
		System.out.printf("Drone Position: x_pos = %d, y_pos = %d, z_pos = %d", pos_x, pos_y, pos_z);
	}
	public void exitNavigation() {
		System.out.println("You have exited navigation");
	}
	

	}





public class Griffin_Drone {

	public static void main(String[] args) { //main method
		
		Scanner input = new Scanner(System.in); //user input
		Control c = new Control();	//using class Control from above, object created
		
        
		do {
		//prompt
		System.out.println("\nWhich direction would you like to move the drone?");
		System.out.println("1 - Move Up");
		System.out.println("2 - Move Down");
		System.out.println("3 - Move Forward");
		System.out.println("4 - Move Backward");
		System.out.println("5 - Turn Left");
		System.out.println("6 - Turn Right");
		System.out.println("7 - Display Position");
		System.out.println("8 - Exit Navigation");
		
		
		int temp = input.nextInt(); //user input used in prompt
		
		//conditional statements
		
		if (temp == 1) {
			c.incY();
			c.up();
	
		}
		else if (temp == 2) {
			c.decY();
			c.down();

		}
		else if (temp == 3) {
			c.incZ();
			c.forward();
			
		}
		else if (temp == 4) {
			c.decZ();
			c.backward();
		}
		else if (temp == 5) {
			c.incX();
			c.left();
		}
		else if (temp == 6) {
			c.decX();
			c.right();
		}
		else if (temp == 7) {
			c.displayPosition();
		}
		else if (temp == 8) {
			c.exitNavigation();
		}
		else{ 
			System.out.println("Error. Invalid Command");
		}
		
		

		}while(true);
	}

}

