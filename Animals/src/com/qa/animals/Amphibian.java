package com.qa.animals;

public class Amphibian extends Animal implements landCreatures, eggBreeders{
	String [] mainPredators;

	public Amphibian(String _class, String genus, String species, String name, String[] mainPredators) {
		super(_class, genus, species, name);
		this.mainPredators = mainPredators;
	} 
	
	@Override
	public void hatchTime() {
		System.out.println("3");
		
	}
	
	@Override
	public void legs() {
		System.out.println("Amphibians have cool legs");
	}

}
