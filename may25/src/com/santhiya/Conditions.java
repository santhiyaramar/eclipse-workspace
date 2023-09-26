package com.santhiya;

public class Conditions {

	public static void main(String[] args) {
		int no=9;
		int sum=0;
		int sqr=no*no;
		while(sqr>0)
		{
			int digit=sqr%10;
			sum=sum+digit;
			sqr=sqr/10;
		}
		if(sum==no)
		{
			System.out.println("the no is neoun");
		}
		else
		{
			System.out.println("the no is not neoun");
		}
		
	}

}
