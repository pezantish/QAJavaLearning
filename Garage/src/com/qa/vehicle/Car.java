package com.qa.vehicle;

public class Car extends Vehicle{
	boolean hasSunroof;
	int bootSize;
	
	//CONSTRUCTOR
	public Car(int customerID, String reg, String make, String model, double weight, int height, double price,
			boolean hasSunroof, int bootSize) {
		super(customerID, reg, make, model, weight, height, price);
		this.hasSunroof = hasSunroof;
		this.bootSize = bootSize;
	}

	@Override
	//DIFFERENT CALCULATION DEPENDING ON WHICH CLASS IS CALLED
	public double calcBill() {
		return price + 75;
	}

	
}
