package patternsprogram;

import java.util.Scanner;

public class Paatern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark");
		int n=sc.nextInt();

		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print(row+"  ");
				
			}
			System.out.println();
		}
	}

}
