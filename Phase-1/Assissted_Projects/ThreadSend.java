package com.mphasis.multi;

public class ThreadSend extends Thread 
{
	private String msg;
	private Sender sender;
	public ThreadSend(String msg,Sender sender) {
		super();
		this.msg = msg;
		this.sender = sender;
	}
	@Override
	public void run() 
	{
		synchronized (sender)
		{
			sender.send(msg);
		}
	}
	public static void main(String[] args) 
	{
		Sender  sender=new Sender();
		ThreadSend t1=new ThreadSend("Welcome to Sender...", sender);
		ThreadSend t2=new ThreadSend("Hello World", sender);
		t1.start();
		t2.start();
		try {
			
				t1.join();
				t2.join();
			
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}

}
