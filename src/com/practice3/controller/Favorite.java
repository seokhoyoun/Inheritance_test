package com.practice3.controller;

public class Favorite extends MyInfo {
	private String hobby;
	private int fNum;
	private String fruit;
	
	public Favorite() {
		
	}

	public Favorite(String hobby, int fNum, String fruit) {
		super();
		this.hobby = hobby;
		this.fNum = fNum;
		this.fruit = fruit;
	}

	public Favorite(String name, int age, String hobby, int fNum, String fruit) {
		super(name, age);
		this.hobby = hobby;
		this.fNum = fNum;
		this.fruit = fruit;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getfNum() {
		return fNum;
	}

	public void setfNum(int fNum) {
		this.fNum = fNum;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	
	@Override
	public String toString() {
		return String.format("%d세 %s씨가 좋아하는 취미는 %s, 숫자는 %d, 과일은 %s입니다.",super.getAge(),super.getName(),this.hobby,this.fNum,this.fruit);
	}
	
	
	
}
