package com.santhiya;

import java.util.ArrayList;

public class CollectinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
	    al.add(10);
	    al.add(20);
	    al.add(30);
	    al.add(40);
	    
	    find_total(al);
	}

	private static void find_total(ArrayList al) {
		// TODO Auto-generated method stub
		    int total = 0; 
		    for(Object ob: al)//(Onject ob: al)
		    {
		    int value = (Integer)ob;
		    total = total + value; 
		    }
		    System.out.println(total);
		    
		  }
		
	}


