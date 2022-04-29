package com.qa.vehicle;

public abstract class Vehicle {
	double weight;
	int height;
	int numberOfWheels;
	String make;
	String model;
	
	public Vehicle(double weight, int heightCM, int numberOfWheels, String make, String model) {
		this.weight = weight;
		this.height = heightCM;
		this.numberOfWheels = numberOfWheels;
		this.make = make;
		this.model = model;
	}
	public abstract double calcBill();
}
