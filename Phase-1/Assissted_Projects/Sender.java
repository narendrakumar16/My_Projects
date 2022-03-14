package com.mphasis.multi;

public class Sender
{
	public void send(String msg)
	{
		System.out.println("sending "+msg);
		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}

}
