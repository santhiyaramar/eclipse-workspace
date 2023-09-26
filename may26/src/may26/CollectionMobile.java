package may26;

import java.util.ArrayList;

public class CollectionMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1 = new ArrayList(); 
	    al1.add(5);
	    al1.add(10);
	    al1.add("abcd");
	    al1.add("pqrs");
	    
	    Mobiles m1 = new Mobiles("Samsung", 16000);
	    al1.add(m1);
	    
	    
	    ArrayList al2 = new ArrayList(); 
	    for(Object ob: al1)
	    {
	      if(ob.getClass().getSimpleName().contains("Mobiles"))
	        al2.add(ob);
	    }
	    System.out.println(al2);
	}

}
