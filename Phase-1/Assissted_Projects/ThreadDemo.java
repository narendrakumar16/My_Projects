package com.mphasis.multi;

public class ThreadDemo extends Thread {

	public static void main(String[] args)
	{
		
		ThreadDemo td=new ThreadDemo();
		System.out.println(td);
		td.start();
		
		}
	@Override
	public void run()
	{
		System.out.println("run()  from current class");
		for (int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		}

}
