package may26;

import java.util.ArrayList;

public class WithWithoutGeniricCollection {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList(); 
	    al1.add(5);
	    al1.add(10);
	    al1.add("abcd");
	    al1.add("pqrs");
	    
	    
	    ArrayList al2 = new ArrayList(); 
	    for(Object ob: al1)
	    {
	      if(ob.getClass().getSimpleName().contains("String"))
	        al2.add(ob);
	    }
	    System.out.println(al2);
	}

}
