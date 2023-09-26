package execise7;

public class Looping4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping4 looping = new Looping4();
		int no=22;
		int result=looping.reverse_a_number(no);
		System.out.println("Reverse Number is"+result);
		if(no==result)
		{                                                                                                                   
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

	private static int reverse_a_number(int no) {
		// TODO Auto-generated method stub
	    int reverse = 0; 
	    while(no>0)
	    {
	      int rem = no%10; //2
	      reverse = (reverse*10) + rem; //4
	      no = no/10; //2
	    }
	    System.out.println(reverse);
	   return reverse;
	}

}
