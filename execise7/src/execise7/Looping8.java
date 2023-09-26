package execise7;

public class Looping8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=153;
		//int sum=0;
		sum_of_number(i);
	}

	private static void sum_of_number(int i) {
		int sum =0,temp=i;
		int count=count_of_digit(i);
		while(i>0)
		{

			int rem =i%10;//no ha odaika use pandram
			
			sum=sum+(int)Math.pow(rem,count);//odacha reminder value ha add pandrathukaga pandram
			i=i/10;//decremet
			System.out.println(sum);
		}
		if(sum==temp)
		{
			System.out.println("it is a amstrong number");
		}
		else
		{
			System.out.println("it is not amstrong number");
		}
		
	}

	private static int count_of_digit(int i) 
	{
		// TODO Auto-generated method stub
		int count=0;
		while(i>0)
		{
		count= count+1;
		i=i/10;
		}
		return count;
	}

}
