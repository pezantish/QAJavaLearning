package com.qa.animals;

public class Animal {
	String _class;
	String genus;
	String species;
	String name;
	
	
	public Animal(String _class, String genus, String species, String name) {
		super();
		this._class = _class;
		this.genus = genus;
		this.species = species;
		this.name = name;
	}

	public void printLatin() {
		System.out.println(_class +": "+ genus +" "+ species);
	}
	
	public void printEnglish() {
		System.out.println(name);
	}

}
