package com.tns.multithreading;



class Eclipse4 implements Runnable 
{
public void run()
{
	for(int i=0;i<5;i++)
	{
System.out.println("Eclipse thread is is " + " " + Thread.currentThread().getId());
	}
}
} 
class PPT4  implements Runnable {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
	System.out.println("PPT thread is is " + " " + Thread.currentThread().getId());

	}
	}
	
}
public class M1 {
	public static void main(String[] args)
	{
		Eclipse4 obj = new Eclipse4();
		Thread t = new Thread(obj);
		t.start();
		
		PPT4 obj1 = new PPT4();
		Thread t1 = new Thread(obj1);
		t1.start();
	}

}


