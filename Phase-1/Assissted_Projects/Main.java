package com.mphasis.exp;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main 
{
	public  static void main(String[] args)
	{
		//throw new ArithmeticException();//explicitly raise exp
		System.out.println("welcome to mphasis bank");
		int accounts[]= {101,102,103,104};
		String names[]= {"a","b","c","d"};
		double bal[]= {5000.0,2000.0,600.0,4000.0};
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]+" "+names[i]+" "+bal[i]);
			if (bal[i]<1000)
			{
				try {
					throw new LowBalanceException();
				} catch (LowBalanceException e)
				{
					System.err.println(names[i]+" your bal is low please deposit");
					// TODO: handle exception
				}
				
			}
		}
	}
	
	 
		

}
