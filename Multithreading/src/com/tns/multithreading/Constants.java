package com.tns.multithreading;


class Cake extends Thread{
	public void run()
	{
		System.out.println("Cake thread ID is" + Thread.currentThread().getId());
		System.out.println("Cake thread Priority is" + Thread.currentThread().getPriority());
	}
}
class Pastry extends Thread{
	public void run()
	{
		System.out.println("Pastry thread ID is" + Thread.currentThread().getId());
		System.out.println("Pastry thread Priority is" + Thread.currentThread().getPriority());
	
	}
}
public class Constants {

	public static void main(String[] args)
	{
		Cake obj = new Cake();
		obj.start();
		obj.setPriority(Thread.MIN_PRIORITY);
		
		Pastry obj1= new Pastry();
		obj1.start();
		obj1.setPriority(Thread.MAX_PRIORITY);
		
	}
}
