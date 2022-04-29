package com.qa.vehicle;

public class Motorbike extends Vehicle{
	int cc;
	
	public Motorbike(double weight, int heightCM, int numberOfWheels, String make, String model, int cc) {
		super(weight, heightCM, numberOfWheels, make, model);
		this.cc = cc;
	}



	@Override
	public double calcBill() {
		return 87.6;
	}

}
