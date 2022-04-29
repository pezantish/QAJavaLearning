package com.qa.garage;
import java.util.ArrayList;
import java.util.List;

import com.qa.vehicle.*;

public class Garage {
	private List<Vehicle> storage = new ArrayList<>();
	public Garage() {}
	
	public List<Vehicle> getStorage() {
		return storage;
	}
	
	public void addVehicle(Vehicle v) {
		storage.add(v);
	}
	
	public void removeVehicle(int index) {
		storage.remove(index);
	}
	
	public void removeVehicle(String s) {
		for(int i=0; i < storage.size(); i++) {
			Vehicle v = storage.get(i);
			if(v.getClass().getSimpleName().equals(s)){
				storage.remove(v);
				i--;
			}
		}
	}
	
	public void clearGarage() {
		storage.clear();
	}
	
	public void fixVehicles() {
		for(Vehicle v:storage) {
			System.out.println(v.calcBill());
		}
	}
	
	
	

}
