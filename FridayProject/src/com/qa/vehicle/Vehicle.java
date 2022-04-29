package com.qa.vehicle;

public abstract class Vehicle {
	private int customerID;
	private String reg;
	private String make;
	private String model;
	double weight;
	int height;
	double price;
	
	
	//CONSTRUCTOR
	public Vehicle(int customerID, String reg, String make, String model, double weight, int height, double price) {
		this.customerID = customerID;
		this.reg = reg;
		this.make = make;
		this.model = model;
		this.weight = weight;
		this.height = height;
		this.price = price;
	}
	//ABSTRACT METHOD
	public abstract double calcBill();
	
	//GETTERS
	public int getCustomerID() {
		return customerID;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getReg() {
		return reg;
	}
}
