package com.santhiya;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles m1 = new Mobiles("Sony", 15000);
	    Mobiles m2 = new Mobiles("Samsung", 18000);
	    Mobiles m3 = new Mobiles("Apple", 12000);
	    Mobiles m4 = new Mobiles("Vivo", 25000);
	    ArrayList mobilesList = new ArrayList(); 
	    mobilesList.add(m1);
	    mobilesList.add(m2);
	    mobilesList.add(m3);
	    mobilesList.add(m4);
	    System.out.println( mobilesList);
	    for(Object ob: mobilesList)
	    {
	    	//type casting;down casting
	    	Mobiles mobile=(Mobiles)ob;
	    	if(mobile.price>15000)
	      System.out.println(ob);
	    }
	}

}
