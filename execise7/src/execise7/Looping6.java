package execise7;

public class Looping6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Looping6 looping = new Looping6();
		looping.stright_print(3456);
	}
		private void stright_print(int no) {
			// TODO Auto-generated method stub
			int i = 1000;
			int count=0;
			while(no>0)
			{
				System.out.println(no/i);
				
			no=no%i;
			i=i/10;
			count++;
			
	}
			System.out.println("no of count "+count);
			
			

}
		}
	
	
