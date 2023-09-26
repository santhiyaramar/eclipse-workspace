package may26;

import java.util.ArrayList;

public class StringOrIntegerInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		  Integer no = 5; 
		  String name = no.getClass().getSimpleName();
		  if(name.equals("String"))
		    al.add(no);
		  
		  String s = "abcd";
		  name = s.getClass().getSimpleName();
		  if(name.equals("String"))
		    al.add(s);
		  
		  System.out.println(al);
	}

}
