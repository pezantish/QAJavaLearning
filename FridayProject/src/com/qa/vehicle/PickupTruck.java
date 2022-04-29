package com.qa.vehicle;

public class PickupTruck extends Vehicle{
	int[] bedDimensions = new int[2];
	
	public PickupTruck(double weight, int heightCM, int numberOfWheels, String make, String model,
			int[] bedDimensions) {
		super(weight, heightCM, numberOfWheels, make, model);
		this.bedDimensions = bedDimensions;
	}

	@Override
	public double calcBill() {
		return 90.7;
	}
	

}
