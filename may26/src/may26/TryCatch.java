package may26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		TryCatch tc=new TryCatch();
		try {
		    tc.methodA(); 
		    // DB Connection - username, password: 
		    try {
		        tc.methodA();
		        }
		        catch(ArithmeticException aa)
		        {
		          aa.printStackTrace();
		          System.out.println(aa.getMessage());
		          System.out.println("Check no2");
		        }
		        catch(InputMismatchException ii)
		        {
		          System.out.println("Should enter only numbers");
		        }
		        catch(NegativeArraySizeException nn)
		        {
		          System.out.println("Array length should be from zero");
		        }
		      
//		        catch(Exception e)
//		        {
//		          System.out.println("Something went wrong");
//		        }
		        finally
		        {
		          
		        }
		    }
		    finally
		    {

		      System.out.println("DB Connected ");
		      System.out.println("Disconnecting DB");
		    }
	}

	
		
	private void methodA() {
	    // TODO Auto-generated method stub
	    methodB(); 
	  }

	  private void methodB() {
	    // TODO Auto-generated method stub
	    methodC(); 
	  }

	  private void methodC() {
	    // TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Numbers");
	    int no1 = sc.nextInt();
	    int no2 = sc.nextInt();
	    System.out.println(no1/no2);
	    int[] ar = new int[no1];
	    System.out.println(ar.length);
	    for(int i=0; i<10; i++)
	      System.out.println(ar[i]);
	    
	  }

}
