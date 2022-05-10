package com.tns.multithreading;


class Bike extends Thread
{
public void run()
{
	for(int i =0;i<5;i++)
	{
		System.out.println("Bike thread ID is" + Thread.currentThread().getId());
		try {
			sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
			
		}
	}
}
}
public class Sleep {
	public static void main(String[] args)
	{
		Bike obj = new Bike();
		obj.start();
	}
}
