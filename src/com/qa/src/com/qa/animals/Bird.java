package com.qa.animals;

public class Bird extends Animal implements eggBreeders{
	boolean canFly;

	public Bird(String _class, String genus, String species, String name, boolean canFly) {
		super(_class, genus, species, name);
		this.canFly = canFly;
	}
	
	@Override
	public void hatchTime() {
		System.out.println("5");
		
	}

}
