package execise1;

public class Whilecondition {
	public static void main(String args[])
	{
		Whilecondition obj=new Whilecondition();
	//	obj.sequre();	
	//	obj.smallest_diviser();
	//	obj.greatest_diviser();
	}
		//if(a==(i*i))
		//{
		
			//System.out.println("sequre root is:"+i);
		//	break;
			
	//	}
	
			
		//	i++;
//	}
	
	//}



	private void greatest_diviser() {
		int no=40;
		int div=2;
		int greatest=1;
		while(div<=no)
		{
			if(no%div==0)
			{
				greatest=div;
			//System.out.println(div);
		}
		div=div+1;
		
	}
		System.out.println(greatest);
	}
		

	

	private void smallest_diviser() {
		int no=50;
		int div=2;
		int smallest=1;
		while(div<=no)
		{
			if(no%div==0)
				smallest=div;
			System.out.println(div);
			break;
		//	div=div+1;
		}
		div=div+1;
	}
	

	private void sequre() {
		int no=1;
		int i=0;
		int k=10;
		while(no<=k)
		{
			i=no*no;
			System.out.println(i);
			no=no+1;
		}
		
	}
}


