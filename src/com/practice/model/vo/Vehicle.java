package com.practice.model.vo;

public abstract class Vehicle {
	// Field
	private String name; // 이름
	private double mileage; //연비
	private String kind; // 종류
	// Constructor
	public Vehicle() {
		
	}

	public Vehicle(String name, double mileage, String kind) {
		super();
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	// Method
	@Override
	public String toString() {
		return this.name +", "+ this.mileage+", "+this.kind;
	}
	public abstract String howToMove();
	public abstract String howToStop();
	
	// Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}
