package may26;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		Mobilee m1 = new Mobilee("Sony", 15000);
	    Mobilee m2 = new Mobilee("Samsung", 18000);
	    Mobilee m3 = new Mobilee("Apple", 12000);
	    Mobilee m4 = new Mobilee("Vivo", 25000);
	    ArrayList mobileList = new ArrayList(); 
	    mobileList.add(m1);
	    mobileList.add(m2);
	    mobileList.add(m3);
	    mobileList.add(m4);
	    System.out.println(mobileList);
	    for(Object ob:mobileList)
	    {
	    	Mobilee mobilee=(Mobilee)ob;
	    	if(mobilee.price>1500)
	    		System.out.println(ob);
	    }
	}

}
