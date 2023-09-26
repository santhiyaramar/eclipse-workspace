package execise7;

public class Looping3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping3 looping = new Looping3();
		//looping.print_reverse(1234);
		//int n= looping.count_of_digits(751239);
		//System.out.println(n+" count of number");
		looping. sum_of_digits(1234);
		//looping.stright_print(3456);
		
	}

	private void stright_print(int no) {
		// TODO Auto-generated method stub
		int i = 1000;
		while(no>0)
		{
			System.out.println(no/i);
			
		no=no%i;
		i=i/10;
		}
	}

	private void sum_of_digits(int no) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(no>0)
		{
			int rem = no%10;//4	//3
			sum = sum +rem;//0+4	4+3=7
			no = no/10;	//123/10	12/10
			System.out.println(sum);
		}
	}

	private int count_of_digits(int no) {
		// TODO Auto-generated method stub
		int count = 0;
		while(no>0)
		{
			//System.out.println(no%10);
			no = no/10;
			count= count+1;
		}
		return count;
	}

	private void print_reverse(int cake) {
		// TODO Auto-generated method stub
		while(cake>0)
		{
			System.out.println( cake%100);
			cake= cake/100;
		}
	}

}
