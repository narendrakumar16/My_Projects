package com.practiceproject2;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidationEID 
{
	   public static void main(String[] args)
	   {
	      ArrayList <String> email = new ArrayList<String>();
	     
	      email.add("ravi@gmail.com");
	      email.add("sai@gmail.com");
	      email.add("ram@yahoo.com");
	      email.add("sita@gmail.com");
	      email.add("jai@gmail.com");
	      email.add("nani@yahoo.com");
	      email.add("bhanu@gmail.com");
	      email.add("gani@gmail.com");
	      email.add("queen@gmail.com");
	      email.add("king@yahoo.com");
	      Scanner sc=new Scanner(System.in);
	     
	      System.out.println("Enter an E-mail ID");
	      String string= sc.nextLine();
	      if (email.contains(string)) 
	      {
	    	    System.out.println(string+ " Is Exist");
	      }
	      else 
	      {
	    	    System.out.println(string+" Is Not Exists");
	      }
	   }
	}


