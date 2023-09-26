package execise7;

public class Looping10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping10 ll = new Looping10();
		ll.find_lcm(3,9);
		//ll.swap_amount(10,20);
		//ll.swap_without_third(123,234);
	//	ll.print_fibo();
	}

	private void print_fibo() {
		// TODO Auto-generated method stub
		//0 1 2 3 5 8 13
		int a=0,b=1;
		int count=0;
		while(count<10)
		{
			//int c=a+b;
			System.out.print(a+" ");
			a=b-a;
			b=a+b;
			count=count+1;
		}
	}

	private void swap_without_third(int no1, int no2) {
		// TODO Auto-generated method stub
		  System.out.println("No1 " + no1);
		    System.out.println("No2 " + no2);
		    no1 = no1 + no2; 
		    System.out.println("No1 " + no1);
		    no2 = no1 - no2; 
		    System.out.println("No2 " + no2);
		    no1 = no1 - no2; 
		    System.out.println("No1 " + no1);
		  
	}

	private void swap_amount(int old_coin, int new_coin) {
		// TODO Auto-generated method stub
		System.out.println(" old "+old_coin);
		System.out.println(" new "+new_coin);
		int box=old_coin;
		old_coin=new_coin;
		new_coin=box;
		System.out.println(" old "+old_coin);
		System.out.println(" new "+new_coin);
	}

	private void find_lcm(int no1, int no2) {
		// TODO Auto-generated method stub
		int big = no1>no2?no1:no2; 
		int temp=big;
	    System.out.println(big);
	    while(true)
	    {
	    if(big%no1==0 && big%no2==0)
	    {
	    	System.out.println(" LCM is "+big);
	   	break;
	    }
	    big=big+temp;  
	    
	}

}
}
