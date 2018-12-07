package com.mvc.model;

import java.util.Scanner;

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
			super.setOvertimeP(getOvertime() * 5000);
		// 세금
		super.setTax((long)(getPay()*0.1));
		// 성과금
		super.setIncenP((long)(super.getIncentive()*super.getPay()));
		// 실수령액
		super.setTotalPay(getPay()+ getFamilyP()+getIncenP()+getOvertimeP() -getTax());
		
	}
	@Override
	public void out() {
		
		System.out.println(super.getName()+"\t"+super.getPay()+"\t"+super.getFamily()+" 명\t"+super.getFamilyP()+"\t\t"
		+super.getOvertime()+"\t"+super.getOvertimeP()+"\t"+super.getTax()+"\t"+super.getIncentive()+"\t"+super.getIncenP()+"\t"+super.getTotalPay());
		
	}
	
}
