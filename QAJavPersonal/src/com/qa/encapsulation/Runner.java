package com.qa.encapsulation;

public class Runner {
	public static void main(String[] args) {
		Encapsulation example = new Encapsulation();
		example.setDub(1d);
		example.setFlo(2f);
		example.setLengthy(3L);
		example.setNum(4);
		example.setStr("Hello");
		System.out.println(example.getStr());
		System.out.println(example.getDub());
		System.out.println(example.getFlo());
		System.out.println(example.getLengthy());
		System.out.println(example.getNum());
		System.out.println(example.toString());
	}
}
