package com.tns.lam;

interface substraction{
	public int sub();
	
}
public class Variable {
	public static void main(String[] args )
	
	{
		substraction d2=() -> (60-20);
		{
			System.out.println(d2.sub());
			
		};
	}

}