package practice;
import java.io.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		 int a=10,b=5;
		 
		 int  c=0;
	try	 {
		int arr[]=null;
//		System.out.println(arr[1]);
			c=a/b; //error vanthuduchina odana catch kupooidum
			System.out.println("try block");
		 }
	catch(ArithmeticException e)
	{
		System.out.println("arthmetic exception is occure occure");
	}
	catch(NullPointerException e)
	{
		System.out.println("null pointer exception is occure");
	}
	catch(Exception e)
	{
		System.out.println("error is occure");
	}
	finally {
		System.out.println("this gets printed no matter what");
	}
	
	File file=new File("abc.text");
	try {
		//checked exception copli limela varathala
		FileInputStream fs=new FileInputStream(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(c);
	System.out.println("end of the program");
		
		
	
	}

}
