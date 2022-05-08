package com.tns.interf;

interface Bike{
	int a=10;
	static void display()
	{
		System.out.println("in bike interface");
	}
	 
}
public class INF{
	public static void main(String[] args)
	{
		Bike.display();
	}
}