package intrviewprogram;

public class PrintNo {

	public static void main(String[] args) {
		PrintNo pn=new PrintNo();
	//	pn.print1();
	//	pn.print2();
	//	pn.fibonaci();
	//	pn.fibonaci_normal();
	//	pn.GcdAndLcd();
		pn.factorial();
	//	pn.printreverse();
		
		
	}

	private void printreverse() {
		int no=1234;
		int rem=0;
		while(no>0)
		{
			rem=no%10;
			System.out.println(rem);
			no=no/10;
			rem=rem+1;
		
		}
	}

	private void factorial() {
		int no2=5;
		while(no2>1)
		{
			int no=no2;
			int fact=1;
			while(no>=1)
			{
				fact=fact*no;
			//	System.out.println(no);
				no--;
		//		System.out.println(no);
			
				
			}
			System.out.println(fact+" ");
			no2--;
		}
		
	}

	private void GcdAndLcd() {
		int gcd=0;
		int no1=100;
		int no2=120;
		int small=no1<no2?no1:no2;
		int div=2;
		boolean first=true;
		int lcd=0;
		while(div<= small)
		{
			if(no1%div==0 && no2%div==0)
			{
				if(first==true)
				{
					lcd=div;
					first=false;
					
				}
				gcd=div;
			}
			div++;
		}
		System.out.println("gcd "+ gcd);
		System.out.println("lcd "+ lcd);
	}

	private void fibonaci_normal() {
		int no1=0;
		int no2=1;
		int no3=0;
		System.out.println(no1+" "+no2);
		while(no3<=10)
		{
			no3=no1+no2;
			System.out.println(no3+" ");
			no1=no2;
			no2=no3;
			
		}
	}

	private void fibonaci() {
		int first=0;
		int second=1;
		int third=0;
		while(first<=80)
		{
			if(first>=5)
			{
				System.out.println(first+" ");
				
			}
			third=first+second;
//			System.out.println(third+" ");
			first=second;
			second=third;
		}
	}

	private void print2() {
		int no2=5;
		boolean first=true;
		for(int no=1;no<=5;no++)
		{
			System.out.println(no*no2);
			if(no==5&&first==true)
			{
				no2=4;
				no=0;
				first=false;
			}
		}
	}

	private void print1() {
		// print 1 11 111 1111 
				int no=1;
				int no1=1;
				while(no<=1111)
				{
					System.out.println(no);
					no1=no1*10;
					
					no=no+no1;
					
				}
	}

}
