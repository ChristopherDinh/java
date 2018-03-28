package demo;

import java.util.HashMap;

public class BallArrayDemo {

	public static void main(String[] args) {
	
	HashMap<Integer, Ball> binOfBalls = new HashMap<Integer, Ball>();
	Ball ball1 = new Ball(1, "black", "L");
	binOfBalls.put(ball1.getId(),ball1);
	Ball ball2 = new Ball(2, "red", "M");
	binOfBalls.put(ball2.getId(),ball2);
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y")) {
		int id = Console.getInt("Enter id: ");
		Ball b = binOfBalls.get(id);
		System.out.println(b);
	}
	}

}
