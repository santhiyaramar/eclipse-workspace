package execise7;

public class Looping9 {

	public static void main(String[] args) {
		Looping9 lp9=new Looping9();
		//lp9.neon();
	//	lp9.perfect_number(28);
		lp9.strong(145);
	}

	private void strong(int no) {
		// TODO Auto-generated method stub
		int sum=0;
		int temp=no;
		while(temp!=0)
		//	for(int temp=no;temp!=0;temp--)
		{
			int rem=temp%10;
			System.out.println("rem " +rem+" fac "+factor(rem));
			sum=sum+factor(rem);
			temp=temp/10;
			//System.out.println(sum);
			
		}
		if(no==sum)
			System.out.println("strong number ");
		else
			System.out.println("not strong number ");
			
		
	}
		static int factor(int no)
		{
			int mul=1;
			//int i=1;
			//while(i<=no)
			for(int i=1;i<=no;i++)
			{
				mul=mul*i;
			//	i++;
			}
			
			return mul;
		}
	private void perfect_number(int no) {
		// TODO Auto-generated method stub
		int sum=0;
		int div=1;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				System.out.print(sum+" div "+div+" ");
				sum=sum+div;
				System.out.println(sum);
				
			}
			div=div+1;
		}
		
				if(no==sum)
				{
					System.out.println("the number is perfect");
				}
				else
				{
					System.out.println("the number is not perfect");
				}
			}
		
	
		

	private void neon() {
		// TODO Auto-generated method stub
		int no =9;
		int sum= 0;
		int sqr=no*no;
		while(sqr!=0)
		{
			int rem=sqr%10;
			System.out.println(rem);
			sum=sum+rem;
			sqr=sqr/10;
			System.out.println(sum);
		}
		if(no==sum)
		{
			System.out.println("it is a neon number");
			
		}
		else
		{
			System.out.println("it is not a neon number");
		}
	}
}
		


