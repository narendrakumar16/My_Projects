package com.mphasis.exp;

public class AddArguments2 {

	public static void main(String[] args) 
	{
		try {
			int sum=0;
			for(int i=0;i<args.length;i++)
			{
				sum+=Integer.parseInt(args[i]);
			}
			System.out.println("sum="+sum);
		}
		catch (NumberFormatException nfe)
		{
			System.err.println("one of the command line "+" arguments is not integer");
		}
		finally {
			//code which mandatory to excutive irrespective of exp
			// System.exit(0); to terminate  jvm
			System.out.println("finally block is excuted");
		}
		

	}

}
