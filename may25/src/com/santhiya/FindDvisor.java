package com.santhiya;

public class FindDvisor {

	public static void main(String[] args) {
		int no=100;
		int div=2;
		int no1=0;
		while(div<no)
		{
			if(no%div==0)
			{
				if(no1<2)
				{
					System.out.println(div);
				}
				no1=no1+1;
			}
			div++;
		}
	}
}
			