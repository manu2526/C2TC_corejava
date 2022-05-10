package com.tns.multithreading;



class Eclipse1 implements Runnable 
{
public void run()
{
	
	for(int i=0; i<5;i++)
	{
System.out.println("Eclipse thread is is " + " " + Thread.currentThread().getId());

}
}
} 
class PPT1  implements Runnable {
	public void run()
	{
		for(int i=0; i<5;i++)
		{
	System.out.println("PPT thread is is " + " " + Thread.currentThread().getId());

	}
	}
	
}
public class Multithread1 {
	public static void main(String[] args)
	{
		Eclipse1 obj = new Eclipse1();
		Thread t = new Thread(obj);
		t.start();
		
		PPT1 obj1 = new PPT1();
		Thread t1 = new Thread(obj1);
		t1.start();
	}

}


