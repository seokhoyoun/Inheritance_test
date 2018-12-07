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
		// 가족수당
		if(super.getFamily() < 3) 
			super.setFamilyP(20000 * super.getFamily()) ;
		else 
			super.setFamilyP(60000);
		// 시간 외 수당
		if(super.getOvertime() > 0) {
			super.setOvertimeP(getOvertime() * 5000);
		}
		// 세금
		
		
	}
	@Override
	public void out() {
		
	}
	
}
