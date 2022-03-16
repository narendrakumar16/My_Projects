package pack1;

import java.util.Scanner;


public class InnerClassDemo
{
	 String msg;
		Scanner sc = new Scanner(System.in);

		class Inner {
			void hello() {
				System.out.println("Enter String");
				System.out.println(msg=sc.nextLine()+",It is an Inner Classes");
			}
		}

		public static void main(String[] args) {

			InnerClassDemo obj = new InnerClassDemo();
			InnerClassDemo.Inner in = obj.new Inner();
			in.hello();
		}


}
