package com.tns.client;


import com.tns.application.MMBankfactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.SavingAcc;
import com.tns.framework.CurrentAcc;


public class Client {

	public static void main(String[] args) {
		
		BankFactory bf=new MMBankfactory();
		SavingAcc  sa=new MMSavingAcc(6543, "huma", 8000.0f, true);
		sa.withdraw(sa.getaccBal());
		sa.toString();
		CurrentAcc ca=new MMCurrentAcc(3456, "seema", 4000.0f, 2000.0f);
		ca.withdraw(ca.getcreditLimit());
		ca.toString();
		
		
		}

}
