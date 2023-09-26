package execise6;

public class StringReverse1 {
		String s3=" ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse1 s1= new StringReverse1(); 
		s1. reverse_whole_input();
	}

	private void reverse_whole_input() {
	    String s1 = "Today is Wednesday Tomorrow is Thursday";
	    
	    String s2 = ""; 
	    
	    System.out.println("s1 --> " + s1);
	    for(int i=s1.length()-1;i>=0;i--)
	    {
	      if(s1.charAt(i)!= ' ') {
	        s2 = s2 + s1.charAt(i); //YNNAD
	      }
	      else
	      {
	        reverse(s2);//reverse("YNNAD");
	        s2 = ""; 
	        continue; 
	      }
	    }
	    reverse(s2);
//	   System.out.println("s2 --> " + s2);
	    
	  }

	  private void reverse(String s2) { //YNNAD
	    // TODO Auto-generated method stub
	    for(int i=s2.length()-1; i>=0; i--)
	    {
	      s3 = s3 + s2.charAt(i);//BENI DANNY
	    }
    s3 = s3+" ";
	    System.out.println("s3 --> "+ s3);
	    
	  }
	
	  }



