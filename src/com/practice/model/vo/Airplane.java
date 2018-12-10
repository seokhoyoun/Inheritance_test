package com.practice.model.vo;

public class Airplane extends Vehicle {
	private int tire; //바퀴 개수
	private int wing; // 날개 개수
	
	public Airplane() {
		
	}

	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	@Override
	public String toString() {
		return super.toString()+", "+this.tire+", "+this.wing;
	}
	@Override
	public String howToMove() {
		return "하늘을 날아서 이동한다.";
	}
	@Override
	public String howToStop() {
		return "땅에 착지에서 브레이크 밟아 멈춘다.";
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	
	
}
