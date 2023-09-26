package com.santhiya;

public class FindPrimeNo {

	public static void main(String[] args) {
		int no=17;	// no=8 it is not a prime no
		int div=2;
		int count=0;
		while(div<no)
		{
			if(no%div==0)
			{
				System.out.println(div);
				count++;
			}
			div++;
		}
		if(count==0)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}
	}

}
