package com.mphasis.exp;

public class UncheckedExceptionDemos {

	public static void main(String[] args)
	{
		int num=100;
		int result=0;
		System.out.println("Open file");
		System.out.println("Read file");
		System.out.println("Process data");
		//int result=num/10;
		try {
			
		result=UncheckedExceptionDemos.div(4,2);//main caller
		}
		catch (ArithmeticException e)
		{
			//e.prtintStackTrace();
			System.err.println("Sorry u can't div num by 0");
		}
		//int result=num/0;//unchecked exception terminate
		System.out.println(result);
		System.out.println("Close a file");

	}
	public static int div(int num1,int num2)throws ArithmeticException
	{
		return num1/num2;
	}

}
