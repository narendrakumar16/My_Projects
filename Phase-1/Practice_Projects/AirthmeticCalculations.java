package pack1;

import java.util.Scanner;

public class AirthmeticCalculations {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1 Addition(+)");
		System.out.println("2 Subtraction(-)");
		System.out.println("3 Multiply(*)");
		System.out.println("4 Divide(/)");
		System.out.println("5 Division(%)");
		int k=scanner.nextInt();
		int a,b,res;
		switch(k)
		{
			case 1: System.out.println("Enter Two values");
					a=scanner.nextInt();
					b=scanner.nextInt();
					res=a+b;
					System.out.println("Addition of two numbers "+a+" and "+b+" is "+res+"...");
					break;
			case 2: System.out.println("Enter Two values");
					a=scanner.nextInt();
					b=scanner.nextInt();
					res=a-b;
					System.out.println("Subtraction of two numbers "+a+" and "+b+" is "+res+"...");
					break;
			case 3: System.out.println("Enter Two values");
					a=scanner.nextInt();
					b=scanner.nextInt();
					res=a*b;
					System.out.println("Multiply of two numbers "+a+" and "+b+" is "+res+"...");
					break;
			case 4: System.out.println("Enter Two values");
					a=scanner.nextInt();
					b=scanner.nextInt();
					res=a/b;
					System.out.println("Divide of two numbers "+a+" and "+b+" is "+res+"...");
					break;
			case 5: System.out.println("Enter Two values");
					a=scanner.nextInt();
					b=scanner.nextInt();
					res=a%b;
					System.out.println("Divison of two numbers "+a+" and "+b+" is "+res);
					break;
			default:System.out.println("Wrong choice");
			break;
			
	
			
		}
		

	}

}
