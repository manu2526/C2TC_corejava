package com.tns.application;

import com.tns.framework.SavingAcc;



public class MMSavingAcc extends SavingAcc {
	
	private static final float MINBAL=500;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}

	public void withdraw(float accBal) {
		System.out.println("Dear Saving Account User,your Balance is: "+accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ",hashcode()="
			+ hashCode()+"]";
	}
	

}
