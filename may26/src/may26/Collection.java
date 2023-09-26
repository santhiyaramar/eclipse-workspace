package may26;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); // Array --> Growable Array
	    al.add("hi");
	    al.add(5);
	    al.add(true);
	    al.add(10.4f);
	    al.add('c');
	    System.out.println(al);
	    
	    al.add(2, "Kalai");
	    al.add(2, "Kalai");
	    System.out.println(al);
	    
	    ArrayList al2 = new ArrayList(); 
	    al2.add(100);
	    al2.add(200);
	    al2.add(300);
	    al2.addAll(2,al);
	    System.out.println(al2);
	    System.out.println(al2.size());
	    
	    System.out.println(al2.contains("Harish"));
	    
	    System.out.println(al2.containsAll(al));
	    
	    System.out.println(al2.get(5)); 
	    
	    System.out.println(al2.indexOf("Kalai"));
	    
	    List ll  = al2.subList(3, 7);
	    System.out.println(ll);
	    al2.remove("kalai");
	    System.out.println(al2);
	}

}
