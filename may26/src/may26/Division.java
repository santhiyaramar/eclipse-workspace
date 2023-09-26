package may26;

import java.io.FileNotFoundException;

public class Division {

	public static void main(String[] args) {
			    Division d = new Division(); 
			    try {
					d.divide(100, 20);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
			public void divide(int no1, int no2) 
			    throws FileNotFoundException		//compile time error
			  {
			    System.out.println(no1/no2);
			    int[] ar = new int[no1];
			    for(int i=0; i<10;i++)
			      System.out.println(ar[i]);
			  }
	}


