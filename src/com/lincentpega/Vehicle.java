package com.lincentpega;

public class Vehicle {
	private int maxSpeed;
	private int minSpeed;
	private int drivers;
	private String engineType;
	private String movementEnvironment;
	

	public Vehicle(int maxSpeed, int minSpeed, int drivers, String engineType, String movementSurface) {
		this.maxSpeed = maxSpeed;
		this.minSpeed = minSpeed;
		this.drivers = drivers;
		this.engineType = engineType;
		this.movementEnvironment = movementSurface;
	}


	public void move(int speed) {
		if (speed > maxSpeed) {
			System.out.println("Isn't able to move with " + speed + " speed. Maximal speed is " + this.maxSpeed);
			return;
		}
		if (speed < minSpeed) {
			System.out.println("Isn't able to move with " + speed + " speed. Minimal speed is " + this.minSpeed);
			return;
		}

		System.out.println("Now you are moving with " + speed + " speed");
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public int getMinSpeed() {
		return minSpeed;
	}


	public int getDrivers() {
		return drivers;
	}


	public String getEngineType() {
		return engineType;
	}


	public String getMovementEnvironment() {
		return movementEnvironment;
	}


	
}
