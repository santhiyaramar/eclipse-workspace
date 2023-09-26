package execise7;

public class Looping5 {
	
	public int getAmstrong(int aa)
	{
		int sum=0;
		while(aa>0)
		{
			int i = aa%10;
			sum+=power(i);
			aa=aa/10;
		}
		return sum;
	}
	public int power(int a)
	{
		return a*a*a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping5 obj=new Looping5();

		int aa=1;
		while(aa<1000)
		{
			int bb=obj.getAmstrong(aa);
			if(aa==bb)
			{
				System.out.println(aa);
			}
			
			aa++;
		}
	}
}
		/*
		 * int no = 153; int sum=0; while(no>0) { int i = no%10; 
		 * int power= i*i*i;
		 * sum=sum+power; no=no/10; }
		 * 
		 * System.out.println(sum);
		 */
	
	
