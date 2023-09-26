package com.santhiya;

public class Amstrongnumber {

	public static void main(String[] args) {
		int no=153;
		int no2=no;
		int sum=0;
		while(no>0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(no2==sum)
		{
			System.out.println("amstrong number");
		}
		else
		{
			System.out.println("not amstrong number");
		}
	}

}
