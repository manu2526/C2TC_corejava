package com.tns.multithreading;


class Eclipse2 implements Runnable 
{
public void run()
{
System.out.println("Eclipse thread is is " + " " + Thread.currentThread().getId());

}
} 
class PPT2  implements Runnable {
	public void run()
	{
	System.out.println("PPT thread is is " + " " + Thread.currentThread().getId());

	}
	
}
public class Multithread {
	public static void main(String[] args)
	{
		Eclipse2 obj = new Eclipse2();
		Thread t = new Thread(obj);
		t.start();
		
		PPT2 obj1 = new PPT2();
		Thread t1 = new Thread(obj1);
		t1.start();
	}

}


