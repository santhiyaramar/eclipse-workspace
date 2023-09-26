package execise7;

public class Looping7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping7 ll= new Looping7();
		ll.find_common_divisor(100,1000);
	}

	private void find_common_divisor(int no1, int no2) 
	{
		// TODO Auto-generated method stub
		int div= 2;
//	    int small = 0; 
//	    if(no1<no2)
//	    {
//	      small = no1; 
//	    }
//	    else
//	    {
//	      small = no2; 
//	    }
	    //Ternary Operator
		int greatest=-1;
	    int small = no1<no2? no1:no2; 
	   // while(div<=small)
	    while(div<=no1 && div<=no2)
		{
			if(no1%div==0 && no2%div==0)
			{
				System.out.println(div);
				greatest=div;
			}
			div=div+1;
		
	}
	   System.out.println("greatest divisor"+greatest); 
	  
}
}
