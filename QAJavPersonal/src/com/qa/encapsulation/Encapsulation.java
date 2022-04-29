package com.qa.encapsulation;

public class Encapsulation {
	private String str;
	private int num;
	private double dub;
	private float flo;
	private long lengthy;
	
	public Encapsulation(String str, int num, double dub, float flo, long lengthy) {
		super();
		this.str = str;
		this.num = num;
		this.dub = dub;
		this.flo = flo;
		this.lengthy = lengthy;
	}
	public Encapsulation() {
		super();
	}
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getDub() {
		return dub;
	}
	public void setDub(double dub) {
		this.dub = dub;
	}
	public float getFlo() {
		return flo;
	}
	public void setFlo(float flo) {
		this.flo = flo;
	}
	public long getLengthy() {
		return lengthy;
	}
	public void setLengthy(long lengthy) {
		this.lengthy = lengthy;
	}
	@Override
	public String toString() {
		return "Encapsulation [str=" + str + ", num=" + num + ", dub=" + dub + ", flo=" + flo + ", lengthy=" + lengthy
				+ "]";
	}
	
	

}
