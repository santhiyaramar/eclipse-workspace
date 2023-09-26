package com.santhiya;

public class FindCountOfDivisor {

	public static void main(String[] args) {
		int no =100;
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
		System.out.println(count);
	}
	

}
