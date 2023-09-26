package execise7;

public class L2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		L2 l2 = new L2();
		l2.great(250);
	}

	private void great(int no) {
		// TODO Auto-generated method stub
		int div = 2, small =0,greater=0;
		while(no/2>=div)
		{
			if(no%div==0)
			{
				if(small==0)
					small=div;
					greater=div;
					System.out.println(greater);
			}
			
			div+=1;
			
		}
		System.out.println(small+" small");
		System.out.println(greater+" greater");
		
	}
}
	


