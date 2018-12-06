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
	// Get/Setter
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
	// Method
	// 어노테이션 : 컴파일러 주석문
	@Override
	public String toString() {
		// return "클래스명@해시코드";
		return "제목 :"+this.title+" \n저자 : "+this.author+"\n가격 : "+this.price+"\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		//return this == obj;
		// 부모 래퍼런스는 후손 객체의 주소를 받을 수 있음
		// Object obj = new Book();
		// 부모 래퍼런스는 상속된 부모 멤버에만 접근할 수 있음
		// 후손 멤버에 접근하려면, 레퍼런스가 후손 클래스형 이어야 한다.
		// 클래스 형변환 : 상속관계일 때만 가능
		Book other = (Book)obj;
		/*boolean result = false;
		if(this.title.equals(other.title)&&this.author.equals(other.author)&&this.price == other.price)
			result = true;
		return result;*/
		
//		if(obj.toString() == this.toString()) 
		if(obj.toString().equals(this.toString())) 
			return true;		
		else 
			return false;
		
	}
	
	@Override
	public Object clone() {
		return new Book(this.title,this.author,this.price);
	}
	// 오버라이딩 시에 접근 제한자는 변경 할 수 있다.
	// 부모의 접근 제한자보다 좁게 변경할 수는 없다.
	// 반대로 예외처리는 같게하거나 줄일 수 있다
	//protected Object clone()
//    throws CloneNotSupportedException 
	/*public Book clone() {
		Book book2 = new Book();
		book2.setTitle(title);
		book2.setAuthor(author);
		book2.setPrice(price);
		return book2;
	}*/
	
	
	
	
	
	

}
