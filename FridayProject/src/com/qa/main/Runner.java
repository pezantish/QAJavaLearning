package com.qa.main;

import com.qa.vehicle.*;
import com.qa.garage.*;

public class Runner {
	public static void main(String[] args) {
		//a waste of memory probably, but makes it easier to remember which bit is which
		double weightKG;
		int heightCM;
		int numberOfWheels;
		String make;
		String model;
		
		Garage garage = new Garage();
		Vehicle car = new Car(weightKG=0, heightCM=0, numberOfWheels=0, make=null, model=null, false, 0);
		Vehicle convertible = new Car(weightKG=0, heightCM=0, numberOfWheels=0, make=null, model=null, true, 0);
		Vehicle bike = new Motorbike(weightKG=0, heightCM=0, numberOfWheels=0, make=null, model=null, 0);
		Vehicle truck = new PickupTruck(weightKG=0, heightCM=0, numberOfWheels=0, make=null, model=null, null);
		garage.addVehicle(car);
		garage.addVehicle(convertible);
		garage.addVehicle(bike);
		garage.addVehicle(truck);	
		System.out.println(garage.getStorage());
		garage.fixVehicles();
		garage.removeVehicle(2);
		garage.removeVehicle("Car");
		System.out.println(garage.getStorage());
	}
}
