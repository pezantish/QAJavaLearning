package com.qa.main;

import com.qa.vehicle.*;
import com.qa.garage.*;

public class Runner {
	public static void main(String[] args) {
		//CREATE EMPTY VARS FOR READABILITY ON INSTANTIATION
		int customerID;
		String reg;
		String make;
		String model;
		double weight;
		int height;
		double price;
		
		int[] dimensions = new int[2];
		
		//INSTANTIATE
		Garage garage = new Garage();
		Vehicle car = new Car(customerID=1, reg="QA51 LOP", make= "Ford", model = " Focus", weight = 42.1, height=234, price=230.00, false, 123);
		Vehicle convertible = new Car(customerID=2, reg="JI45 FRE", make= "Fiat", model = " Punto", weight = 61.3, height=340, price=300.00, false, height);
		Vehicle bike = new Motorbike(customerID=3, reg="MP89 VAS", make= "Triumph", model = " X7", weight = 23.1, height=104, price=150.00, 0);
		Vehicle truck = new PickupTruck(customerID=4, reg="WA67 POL", make= "Ford", model = " Pickup", weight = 40.0, height=400, price=599.00, dimensions);
		
		//STORE VEHICLES IN GARAGE
		garage.addVehicle(car);
		garage.addVehicle(convertible);
		garage.addVehicle(bike);
		garage.addVehicle(truck);
		
		
		//FIX ONE VEHICLE
		garage.fixVehicle(convertible);
		System.out.println();
		System.out.println();
		
		//REMOVE VEHICLE BY ID
		garage.removeVehicle(2);
		
		//FIX ALL VEHICLES
		garage.fixVehicles();
		
		//REMOVE VEHICLE BY CLASS TYPE
		garage.removeVehicle("Car");
		
		//EMPTY GARAGE
		garage.clearGarage();
	}
}
