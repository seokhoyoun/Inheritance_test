package com.practice3.controller;

public class Stuff extends MyInfo{
	private String watch;
	private String phone;
	private int shoesNum;
	
	public Stuff() {
		
	}

	public Stuff(String watch, String phone, int shoesNum) {
		super();
		this.watch = watch;
		this.phone = phone;
		this.shoesNum = shoesNum;
	}

	public Stuff(String name, int age, String watch, String phone, int shoesNum) {
		super(name,age);
		this.watch = watch;
		this.phone = phone;
		this.shoesNum = shoesNum;
	}

	public String getWatch() {
		return watch;
	}

	public void setWatch(String watch) {
		this.watch = watch;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getShoesNum() {
		return shoesNum;
	}

	public void setShoesNum(int shoesNum) {
		this.shoesNum = shoesNum;
	}
	
	@Override
	public String toString() {
		return String.format("%d세 %s씨가 소유한 시계는 %s, 폰은 %s, 신발의 갯수는 %d개 입니다.",super.getAge(),super.getName(),this.watch,this.phone,this.shoesNum );
	}
	
	
}
