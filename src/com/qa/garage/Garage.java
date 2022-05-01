package com.qa.garage;
import java.util.ArrayList;
import java.util.List;

import com.qa.vehicle.*;

public class Garage {
	private List<Vehicle> storage = new ArrayList<>();
	
	//CONSTRUCTOR
	public Garage() {}
	
	//GETTER
	public List<Vehicle> getStorage() {
		return storage;
	}
	
	//ADDS VEHICLE TO STORAGE ARRAYLIST
	public void addVehicle(Vehicle v) {
		storage.add(v);
	}
	
	//REMOVES VEHICLE BY ID
	public void removeVehicle(int ID) {
		//for every vehicle in storage, if it matches id, remove it
		for(int i=0; i < storage.size(); i++) {
			Vehicle v = storage.get(i);
			if(v.getCustomerID() == (ID)){
				storage.remove(v);
				//this accounts for the array index decreasing in size when you remove an object
				i--;
			}
		}
	}
	
	//REMOVES VEHICLE BY CLASS TYPE
	public void removeVehicle(String s) {
		//for every vehicle in storage, if it matches class string, remove it
		for(int i=0; i < storage.size(); i++) {
			Vehicle v = storage.get(i);
			//converts class name into string and compares with s
			if(v.getClass().getSimpleName().equals(s)){
				storage.remove(v);
				//this accounts for the array index decreasing in size when you remove an object
				i--;
			}
		}
	}
	
	//EMPTIES STORAGE ARRAYLIST
	public void clearGarage() {
		storage.clear();
	}
	
	//OUTPUTS VEHICLE PARAMS
	public void fixVehicle(Vehicle v) {
		System.out.println("-------------------------------");
		System.out.println("CustomerID: " + v.getCustomerID());
		System.out.println("Car Type: " + v.getMake() + " " + v.getModel());
		System.out.println("Registration: "+ v.getReg());
		System.out.println("Cost: "+ v.calcBill());
		System.out.println("-------------------------------");
	}
	
	public void outputGarage() {
		for(Vehicle v:storage) {
			System.out.println("CustomerID: " + v.getCustomerID());
			System.out.println("Car Type: " + v.getMake() + " " + v.getModel());
			System.out.println("Registration: "+ v.getReg());
		}
	}
	
	//OUTPUTS VEHICLE PARAMS FOR ALL VEHICLES IN STORAGE
	public void fixVehicles() {
		for(Vehicle v:storage) {
			fixVehicle(v);
		}
	}
	
	
	

}
