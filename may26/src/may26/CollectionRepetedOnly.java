package may26;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionRepetedOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
	    al.add("I"); 
	    al.add("love");
	    al.add("Java"); 
	    al.add("I"); 
	    al.add("love");
	    al.add("India"); //I love Java I love India
	    
	    HashSet hs = new HashSet();
	    
	    for(Object ob: al)
	    {
	      boolean added = hs.add(ob);
	      if(added == false)
	      {
	        System.out.println(ob);
	      }
	    }
	}

}
