package com.lincentpega;

public class Car extends Vehicle {
	private int wheels;
	private int doors;
	private String brand;
	private String gear;

	public Car(int maxSpeed, int minSpeed, int drivers, String engineType, int wheels,
			   int doors, String brand, String gear) {
		super(maxSpeed, minSpeed, drivers, engineType, "Ground");
		this.wheels = wheels;
		this.doors = doors;
		this.brand = brand;
		this.gear = gear;
	}
	

	@Override
	public void move(int speed) {
		sitInCar();
		turnOnIgnition();
		setGear("N");
		super.move(speed);
	}
	
	public void moveLeft() {
		System.out.println("You have succesfully moved left");
	}
	
	public void moveRight() {
		System.out.println("You have succesfully moved right");
	}


	public void setGear(String gear) {
		this.gear = gear;
	}


	private void sitInCar() {
		System.out.println("You have succesfully seat");
	}


	private void turnOnIgnition() {
		System.out.println("You have successfully turned ignition on");
	}

}
