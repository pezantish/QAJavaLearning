package com.qa.animals;

public class Mammal extends Animal implements landCreatures{
	int legs;

	public Mammal(String _class, String genus, String species, String name, int legs) {
		super(_class, genus, species, name);
		this.legs = legs;
	}

	@Override
	public void legs() {
		System.out.println(legs);
		
	}
	

}
