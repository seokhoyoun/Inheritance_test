package com.practice1.model.vo;

public class Book extends Object{
	// Field
	private String title;
	private String author;
	private int price;
	
	// Constructor
	public Book() {
		
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return this.title+" \n"+this.author+"\n"+this.price+"\n";
	}
	
	public boolean equals(Book book2) {
		if(this.title.equals(book2.getTitle())&&this.author.equals(book2.getAuthor())&&this.price == book2.getPrice()) 
			return true;
		else
			return false;
	}
	
	public Book clone() {
		Book book2 = new Book();
		book2.setTitle(title);
		book2.setAuthor(author);
		book2.setPrice(price);
		return book2;
	}
	
	
	
	

}
