package com.qa.vehicle;

public class PickupTruck extends Vehicle{
	int[] bedDimensions = new int[2];
	
	//CONSTRUCTOR
	public PickupTruck(int customerID, String reg, String make, String model, double weight, int height, double price,
			int[] bedDimensions) {
		super(customerID, reg, make, model, weight, height, price);
		this.bedDimensions = bedDimensions;
	}

	@Override
	//DIFFERENT CALCULATION DEPENDING ON WHICH CLASS IS CALLED
	public double calcBill() {
		return price + 3;
	}
	

}
