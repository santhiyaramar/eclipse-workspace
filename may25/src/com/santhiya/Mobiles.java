package com.santhiya;

public class Mobiles implements Comparable {
	String brand;
	int price;
	public Mobiles(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	
      public String toString() {
		
		return this.brand+":"+this.price;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
	    int price2 = this.price; 
	    Mobiles m1 = (Mobiles) o;
	    int price1 = m1.price; 
	    if(price1>price2)
	      return 10; 
	    else if (price1<price2)
	      return -10; 
	    
	    return 0;
		
	}
}
