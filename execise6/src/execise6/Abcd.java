package execise6;

public class Abcd {
	
	public static void main(String args[]) {
		Functional_Interface_Rules fid_obj =  ( no1,  no2) -> 
	    {
	      System.out.println(no1+no2);
	    };
	    fid_obj.add(100,200);
	}

}
