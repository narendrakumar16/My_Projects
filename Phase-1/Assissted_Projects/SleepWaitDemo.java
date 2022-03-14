package com.mphasis.multi;

public class SleepWaitDemo {

	public static final Object LOCK=new Object();
	public static void main(String[] args)throws InterruptedException
	{
		System.out.println("Welcome to main");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName()+" work after 2 sec");
		synchronized (LOCK)
		{
			LOCK.wait(3000);
			System.out.println("LOCK OF "+LOCK+" RELEASE AFTER 3 SEC");
			
		}

	}

}
