package com.santhiya;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionRotate {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
	    al.add(10);
	    al.add(20);
	    al.add(30);
	    al.add(40);
	    System.out.println(al);
	    
	    Collections.rotate(al, -1); //(al, 1)
	    System.out.println(al);
	  
	    ArrayList al2 = new ArrayList(); 
	  for(int i=1; i<al.size(); i++)
	  {
	    al2.add(al.get(i));
	  }
	  al2.add(al.get(0));
	  System.out.println(al2);
	}

}
