package com.qa.vehicle;

public class Motorbike extends Vehicle{
	int cc;

	//CONSTRUCTOR
	public Motorbike(int customerID, String reg, String make, String model, double weight, int height, double price,
			int cc) {
		super(customerID, reg, make, model, weight, height, price);
		this.cc = cc;
	}

	@Override
	//DIFFERENT CALCULATION DEPENDING ON WHICH CLASS IS CALLED
	public double calcBill() {
		return price + 5;
	}

}
