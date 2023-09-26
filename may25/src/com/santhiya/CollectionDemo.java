package com.santhiya;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles m1 = new Mobiles("Sony", 20);
	    Mobiles m2 = new Mobiles("Apple", 25);
	    Mobiles m3 = new Mobiles("Samsung", 28);
	    Mobiles m4 = new Mobiles("Vivo", 12);
	    
	    ArrayList<Mobiles> mobilesList = new ArrayList<Mobiles>(); 
	    mobilesList.add(m1);
	    mobilesList.add(m2);
	    mobilesList.add(m3);
	    mobilesList.add(m4);
	    System.out.println(mobilesList);
	    
	    Collections.sort(mobilesList);
	}

}
