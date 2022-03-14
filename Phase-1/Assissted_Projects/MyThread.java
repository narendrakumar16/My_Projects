package com.mphasis.multi;

public class MyThread implements Runnable 
{
	static int k;//class level var
	int h;//object level var
	public static void main(String[] args) //main thread
	{
		int n;//local var/thread level var
		System.out.println("main() excuted by main thread");
		MyThread mt=new MyThread();
		//mt.run();// not using multi-thread
		Thread t=new Thread(mt);;
		t.start();
			
		
	}
	public void run() {
		System.out.println("run() invoke");
	}

}
