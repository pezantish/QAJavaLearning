package com.qa.vehicle;

public class Car extends Vehicle{
	boolean hasSunroof;
	int bootSize;
	
	public Car(double weight, int heightCM, int numberOfWheels, String make, String model, boolean hasSunroof,
			int bootSize) {
		super(weight, heightCM, numberOfWheels, make, model);
		this.hasSunroof = hasSunroof;
		this.bootSize = bootSize;
	}

	@Override
	public double calcBill() {
		return 35.3;
	}

	
}
