package com.tns.multithreading;


class Eclipse3 extends Thread 
{
public void run()
{


System.out.println("Eclipse thread  ID is " + " " + Thread.currentThread().getId());

System.out.println("Eclipse thread Priority is " + " " + Thread.currentThread().getPriority());
}
} 
class PPT3   extends Thread {
	public void run()
	{
	System.out.println("PPT thread ID is " + " " + Thread.currentThread().getId());
	System.out.println("PPT thread Priority is " + " " + Thread.currentThread().getPriority());

	}
}

public class Multithreading1{
	public  static void main(String[] args)
	{
		Eclipse3 obj = new Eclipse3();
		obj.start();
		obj.setPriority(7);
//		
		PPT3 obj1 = new PPT3();
		obj1.start();
		obj1.setPriority(3);
//		Eclipse3 obj = new Eclipse3();
//		obj.start();
//		obj.set
		
	}
	
}