package oop.inherit.sample;

public class Member extends Person{
	// Field
	private double point;
	private String memberId;
	private String password;
	
	// Constructor
	public Member() {
	}

	public Member(double point, String memberId, String password) {
		this.point = point;
		this.memberId = memberId;
		this.password = password;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String information() {
		return this.memberId +", "+ this.password+", "+this.point+" 포인트";
	}
	
	
}
