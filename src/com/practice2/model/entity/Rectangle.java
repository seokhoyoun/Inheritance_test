package com.practice2.model.entity;

public class Rectangle extends Point{
	// Field
	private int width;
	private int height;
	
	// Constructor
	public Rectangle() {
		
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	// Getter/Setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	// Method
	@Override
	public void draw() {
		super.draw();
		double area = height * width;
		double perimeter = 2 * (width + height);
		System.out.println("사각형의 면적 : "+Math.round(area*10)/10.0);
		System.out.println("사각형의 둘레 : "+Math.round(perimeter*10)/10.0);
	}
	
	
	
	
}
