package com.santhiya;

import java.util.HashSet;

public class CollectionDuplicate {

	public static void main(String[] args) {
		HashSet hs = new HashSet(); 
	    while(true) 
	    {
	    double d = Math.random();
	    int no = (int) (d * 100); 
	    boolean added = hs.add(no);
	    if(added == false)
	      break; 
	  
	    }
	    System.out.println(hs);
	}

}
