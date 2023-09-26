package may26;

import java.util.ArrayList;

public class CollInterviewProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList kapil = new ArrayList(); 
	    kapil.add(173);
	    kapil.add(45);
	    kapil.add(78);
	    kapil.add(45);
	    kapil.add(50);
	  
	    System.out.println(kapil);
	    
	    int total=0;
	    
	    for(Object score: kapil)
	    {
	      Integer sc = (Integer)score; 
	      if(sc>=50)
	      {
	    	  total=total+sc; // auto unboxing
	        System.out.println(score);
	      }
	      
	    }
	    System.out.println(total);
	}

}
