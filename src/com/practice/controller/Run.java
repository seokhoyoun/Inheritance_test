package com.practice.controller;

import com.practice.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Vehicle[] ve = new Vehicle[3];
		ve[0] = new Car("BMW",12.5,"sedan",4);
		ve[1] = new Airplane("보잉747",0.062,"점보 제트기", 16, 5);
		ve[2] = new Ship("낚시배", 3.0, "어선", 1);
		// 향상된 for문
		// for(클래스 래퍼런스변수 : 배열명){래퍼런스.메소드();}
		for(Vehicle e : ve) {
			System.out.println(e);
			System.out.println(e.howToMove());
			System.out.println(e.howToStop()+"\n");
		}
	}

}
