package com.tns.multithreading;
class Eclipse extends Thread 
{
public void run()
{
System.out.println("Eclipse thread is is " + " " + Thread.currentThread().getId());

}
} 
class PPT   extends Thread {
	public void run()
	{
	System.out.println("PPT thread is is " + " " + Thread.currentThread().getId());

	}
	
}
public class Threadclass {
	public static void main(String[] args)
	{
		Eclipse obj = new Eclipse();
		obj.start();
		PPT obj1 = new PPT();
		obj1.start();
	}

}
