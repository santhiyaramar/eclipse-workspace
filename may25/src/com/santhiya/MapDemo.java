package com.santhiya;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
	    HashMap hm = new HashMap(); 
	    hm.put("virat", 45);
	    hm.put("dhoni", 55);
	    hm.put("rohit", 85);
	    hm.put("dhawan", 50);
	    hm.put("kapil", 100);
	    hm.put("rohit", 87);
	    hm.put("rohit", 91);
	    hm.put("raina", 91);
	//    System.out.println(hm.keySet());
	//    System.out.println(hm.values());
	//    System.out.println(hm);
	//    System.out.println(hm.entrySet());
	    int total=0;
	    String name="";
	    int big=0;
	    Entry en=null;
	    Set s  = hm.entrySet();
	    for(Object ob: s)
	    {
	    	Entry entry=(Entry)ob;
	    //	total=total+(Integer)entry.getValue();
	  //                                                                                                                                                             	System.out.println(entry.getKey()+":"+entry.getValue());
	    	total=total+(Integer)entry.getValue();
	 //     System.out.println(ob);
	  //  	if(total==100)
	    	if(total>big)
	    	{
	    		en=entry;
	    	//	big=total;
	    //		name=(String)entry.getKey();
	    	//	System.out.println(entry.getKey());
	    	}
	   // 	System.out.println(total);
	    }
	    System.out.println(en);
	 //   System.out.println(name+"scored highest"+big);
	    
	}
	
}
