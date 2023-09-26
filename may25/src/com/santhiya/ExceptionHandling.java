package com.santhiya;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		ExceptionHandling ex=new ExceptionHandling();
			    ex.divide();
			    System.out.println("Check Me");
			  }

			  private void divide() {
			    // TODO Auto-generated method stub
			    Scanner sc = new Scanner(System.in);
			    System.out.println("Enter two numbers ");
			    int no1 = sc.nextInt();
			    int no2 = sc.nextInt();
			    try {
			    System.out.println(no1/no2);
			    }
			    catch(ArithmeticException ae)
			    {
			      System.out.println("Check no2. It should not be zero.");
			      no2 = sc.nextInt();
			      System.out.println(no1/no2);
			    }
			    
			    
			    
			  }

			  
	}


