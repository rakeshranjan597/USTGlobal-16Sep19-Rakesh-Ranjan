package com.ust_global.objectclass;

public class Car {
	int cost;
	String brand;
	String color;
	
	public Car(int cost,String brand, String color) {
		this.cost = cost;
		this.brand = brand;
		this.color = color;
	}
	@Override
	public int hashCode() {
		return cost;
	}
	
	@Override
	public String toString() {
		return "The Car brand is: "+brand+", color is: "+color+", cost is: "+cost;
	}
}
