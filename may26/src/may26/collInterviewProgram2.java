package may26;

import java.util.ArrayList;

public class collInterviewProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
	    al.add("KapilDev");
	    al.add(150);
	    al.add(23);
	    al.add(45.4f);
	    al.add(50);
	    al.add(true);
	    al.add(true);
	    al.add(false);
	    System.out.println(al);
	    
//	    int[] ar = {10,20,30}; 
//	    for(int aa:ar)
//	    {
//	      
//	    }
	    
	    
	    for(Object elem: al)
	    {
	      try 
	      {
	    	  // type casting
	    	  //parent object to child object
	      Integer i = (Integer) elem; 
	      System.out.println(i);
	      }
	      catch(ClassCastException cce)
	      {
	        
	      }
	    }
	}

}
