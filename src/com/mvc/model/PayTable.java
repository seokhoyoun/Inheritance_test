package com.mvc.model;

public class PayTable extends Salary implements Calculate, Output {
	
	public PayTable() {
		
	}
	public PayTable(String name, long pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}

	public PayTable(String name, long pay, long familyP, long overtimeP, long incenP, long tax, long totalPay,
			int family, int overtime) {
		super(name, pay, familyP, overtimeP, incenP, tax, totalPay, family, overtime);
	}
	@Override
	public void calc() {		
		if(super.getFamily() < 3) {
			
		}
	}
	@Override
	public void out() {
		
	}
	
}
