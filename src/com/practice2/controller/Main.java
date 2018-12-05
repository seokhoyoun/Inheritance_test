package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Point;
import com.practice2.model.entity.Rectangle;

public class Main {

	public static void main(String[] args) {
		Point[] c = new Circle[3];
		Point[] r = new Rectangle[3];
	/*	Circle cc = new Circle();
		cc.draw();
		Rectangle rr = new Rectangle();
		rr.draw();*/
		
		Point[] p = new Point[5];
		for(int i = 0; i < p.length; i++) {
			p[i] = new Point();
		}
		
		
		
		c[0] = new Circle(1,2,3);
		c[1] = new Circle(4,5,6);
		c[2] = new Circle(7,8,9);
		r[0] = new Rectangle(1,2,3,4);
		r[1] = new Rectangle(5,6,7,8);
		r[2] = new Rectangle(9,10,11,12);
		
		for(int i = 0; i < 3; i++) {
			c[i].draw();
			r[i].draw();
		}
	}

}
