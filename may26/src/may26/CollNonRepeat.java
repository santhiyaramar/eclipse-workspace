package may26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
	    al.add("I"); 
	    al.add("love");
	    al.add("Java"); 
	    al.add("I"); 
	    al.add("love");
	    al.add("India"); //I love Java I love India
	    
	 LinkedHashSet hs = new LinkedHashSet();
	    
	   for(Object ob: al)
	    {
	       hs.add(ob);
	//      if(added == false)
	    }
	        System.out.println(hs);
	      }
	    
	}


