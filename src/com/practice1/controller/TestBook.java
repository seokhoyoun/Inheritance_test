package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestBook {

	public static void main(String[] args) {
		Book b = new Book("aaa","aa",10000);
		Book b2 = new Book("bbb","bb",20000);
		
		System.out.println(b.toString());
		System.out.println(b2.toString());
		
		System.out.println(b.equals(b2));
		System.out.println();
		
		Book b3 = b.clone();
		System.out.println(b.hashCode());
		System.out.println(b3.hashCode());
		System.out.println();
		
		
		System.out.println(b.toString());
		System.out.println(b3.toString());
	}

}
