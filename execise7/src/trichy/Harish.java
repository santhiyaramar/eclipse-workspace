package trichy;

import namakal.Harish_parents;

public class Harish extends Harish_parents implements FranceGovernment{
	
	int income= 40000;
	final int doorNo = 15; 
	  
	  static boolean indian = true;
	  
	  protected void chooseBride()
	  {
		  System.out.println("My life my bride");
	  }
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Harish harish = new Harish(); 
	 //   harish.give_invitation();
	//	Harish.play();
		Harish hh=new Harish();
		System.out.println(hh.doorNo); 
	    System.out.println(Harish.indian);
	    hh.chooseBride();
	    
	}

}
