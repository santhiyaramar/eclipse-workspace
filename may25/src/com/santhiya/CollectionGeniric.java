package com.santhiya;

import java.util.ArrayList;

public class CollectionGeniric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>(); 
	    al.add(10);
	    al.add(20);
	    al.add(30);
	    al.add(40);
	    
	    find_total(al);
		ArrayList<Integer> al2 = new ArrayList<Integer>(); 
	    al2.add(10);
	    al2.add(20);
	    al2.add(30);
	    al2.add(40);
	    find_total(al2);
	
	}

	private static void find_total(ArrayList <Integer>al) {
		// TODO Auto-generated method stub
		int total=0;
		for(Integer ob:al)
		{
			total=total+ob;
		}
		System.out.println(al);
	}

}
