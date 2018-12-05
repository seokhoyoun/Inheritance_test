package com.practice2.model.entity;

public class Circle extends Point{
	// Field
	private int radius;
	
	// Constructor
	public Circle() {
		
	}

	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	// Method
	@Override
	public void draw() {
		super.draw();
		double area = Math.PI * radius * radius;
		double circum = Math.PI * 2 * radius;
		System.out.println("원의 면적 : "+Math.round(area*10)/10.0);
		System.out.println("원의 둘레 : "+Math.round(circum*10)/10.0);
	}
}
