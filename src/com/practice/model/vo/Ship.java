package com.practice.model.vo;

public class Ship extends Vehicle{
	private int propeller;
	
	public Ship() {
		
	}

	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+this.propeller;
	}
	@Override
	public String howToMove() {
		return "프로펠러를 돌려서 이동한다";
	}
	@Override
	public String howToStop() {
		return "프로펠러를 역회전 시켜서 멈춘다.";
	}
	
	
}
