package com.qa.animals;

public class Fish extends Animal implements eggBreeders{
	String ocean;
	

	public Fish(String _class, String genus, String species, String name, String ocean) {
		super(_class, genus, species, name);
		this.ocean = ocean;
	}

	@Override
	public void hatchTime() {
		System.out.println("7");
		
	}
	

}
