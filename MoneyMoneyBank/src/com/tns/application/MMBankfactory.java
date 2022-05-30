package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;


public class MMBankfactory extends BankFactory{
	
	public SavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal,boolean isSalary) {
		MMSavingAcc mmsaving = new MMSavingAcc(AccNo, accNm, accBal, isSalary);
		return mmsaving;
	
	}
	public CurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal,float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(AccNo, accNm, creditLimit,creditLimit );
		return mmcurrent;
	}

	

}