package com.qa.classes;

public class Runner {
	static Person randolph = new Person("Randolph", 134, 7, "Doctor", 45);
	static Person jerry = new Person("Jerry", 154, 10, "Doctor", 45);
	static Person chris = new Person("Chris", 171, 4, "Doctor", 45);
	static Person james = new Person("James", 111);
	
	public static void main(String[] args) {
		jerry.shame();
		james.dox();
	}

}
