package com.qa.classes;

public class Person {
	String name;
	int heightCM;
	int shoeSize;
	String jobTitle;
	int age;
	
	public Person(String name, int height, int shoeSize, String jobTitle, int age) {
		super();
		this.name = name;
		this.heightCM = height;
		this.shoeSize = shoeSize;
		this.jobTitle = jobTitle;
		this.age = age;
	}

	public Person(String name, int height) {
		super();
		this.name = name;
		this.heightCM = height;
	}

	public void shame() {
		if(shoeSize<6) {
			System.out.println("No wonder you've got an expensive car!");
		}else if (shoeSize < 10) {
			System.out.println("You're not special!");
		} else {
			System.out.println("Respect.");
		}
	}
	
	public void dox() {
		System.out.println("This guy is " + heightCM + "cm tall and is called " + name);
	}

}
