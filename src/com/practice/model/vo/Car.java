package com.practice.model.vo;

public class Car extends Vehicle {
	private int tire;
	
	public Car() {
		
	}

	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+this.tire;
	}
	
	@Override
	public String howToMove() {
		return "땅위를 달려서 이동.";
	}
	@Override
	public String howToStop() {
		return "브레이크를 밟아서 멈춘다.";
	}
	// Getter and Setter
	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}
	
	
	
	
}
