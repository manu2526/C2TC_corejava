package com.tns.multithreading;

class Counter{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class Synchronization {

	public static void main(String[] args) throws Exception
	{
	Counter c = new Counter();
	Thread t1= new Thread(new Runnable()
			{
		public void run()
		{
			c.increment();
		}
			});
	t1.start();
	t1.join();
	Thread t2 = new Thread(new Runnable()
	{
public void run()
{
	c.increment();
}
	});
	t2.start();
	t2.join();
	System.out.println(c.count);
	}
}
