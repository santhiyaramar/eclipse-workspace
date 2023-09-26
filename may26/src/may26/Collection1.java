package may26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedHashSet hs = new LinkedHashSet(); 
		  hs.add(true);
		  hs.add(10);
		  hs.add(5.4f);
		  hs.add("abcd");
		  hs.add('c');
		  
		  ArrayList al = new ArrayList(); 
		  al.add('h');
		  al.add('a');
		  al.add('r');
		  al.add('i');
		  al.add('s');
		  al.add('h');
		  System.out.println(al);
		  
		  LinkedHashSet lhs = new LinkedHashSet(al);
		  System.out.println(lhs);
	}
		

}
