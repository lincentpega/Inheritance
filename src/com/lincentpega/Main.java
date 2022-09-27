package com.lincentpega;

public class Main {

	public static void main(String[] args) {
		Vehicle carriage = new Vehicle(25, 1, 1, "horses", "ground");
		carriage.move(10);
		
		Car porsche = new Car(300, 10, 1, "petrol", 4, 2, "911", "0");
		porsche.move(100);
		porsche.setGear("5");
		porsche.moveLeft();
		porsche.moveRight();
		
		Truck cat = new Truck(100, 2, "diesel", 8, 2, "Cat", "N", 1500, "tank", "fossil fuel");
		cat.move(30);
	}
}