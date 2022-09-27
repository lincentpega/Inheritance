package com.lincentpega;

public class Truck extends Car {
	int loadCapacity;
	String trailer;
	String cargoType;
	

	public Truck(int maxSpeed, int minSpeed, String engineType, int wheels, int doors, String brand,
				 String gear, int loadCapacity, String trailer, String cargoType) {

		super(maxSpeed, minSpeed, 1, engineType, wheels, doors, brand, gear);

		this.cargoType = cargoType;
		this.loadCapacity = loadCapacity;
		this.trailer = trailer;
	}
	
	public void attachTrailer() {
		System.out.println("Trailer was successfully attached");
	}
	
	public void detatchTrailer() {
		System.out.println("Trailer was successfully detached");
	}
}
