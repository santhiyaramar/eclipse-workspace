package trichy;

import java.util.Scanner;

public class ArrayPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a1 = new int [size];
		System.out.println("Enter the values");
		for (int i =0;i<=a1.length-1;i++);{
			a1[size]=sc.nextInt();
		}
		int a=2;
		int n = 17;
		while(a<= n/2) {
			if(n%a==0) {
				break;
			}
			a++;
			}
		if(a>n/2)
		{
			System.out.println("Prime");
			
		}
		else {
			System.out.println("Not a Prime");
		}

	}

}
