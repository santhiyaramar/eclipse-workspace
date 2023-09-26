package intrviewprogram;

public class Programs {

	public static void main(String[] args) {
		Programs ps =new Programs();
	//	ps.level();
	//	ps.level1();
	//	ps.level2();
	//	ps.level3();
	//	ps.level4();
//		ps.level5();
	//	ps.level6();
	//	ps.reverse_printing();
	//	ps.space();
	//	ps.start();
		ps.end();
		
	}

	private void end() {
			String s1="santhiya";
			String s2="ya";
			int len1=s1.length();
			int len2=s2.length();
			int count=0;
			for(int i=1;i<=s2.length();i++)
			{
				if(s2.charAt(len2-i)==s1.charAt(len1-i))
				{
					count++;
					continue;
				}
			
				else
				{
					
				System.out.println("no not ends with");
			}
			}
	System.out.println(count);
			if(count==s2.length())
			{
				System.out.println("no ends with");
			}
	}
	

	private void start() {
		String s1="santhiya";
		
		String s2="sa";
		int count=0;
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)==s1.charAt(i))
			{	
			count++;
			continue;
		}
			else 
			{
			System.out.println("no not start with");
			}
		}
		if(count==s2.length())
		{
			System.out.println("no  start with");
		}
		}
		

	private void space() {
		String s1="MondayTuesday";
		for (int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A'&&(s1.charAt(i)<='Z'))
			{
				if(i!=0)
				{
					System.out.print("day "+s1.charAt(i));
				}
					else
					{	
					System.out.print(s1.charAt(i));
					}	
					
				}
			else
			{	
				System.out.print(s1.charAt(i));
				}	
				
			}
		}
	

	private void reverse_printing() {
		int no=12345;
		while(no>0)
		{
			int rem=no%10;
			System.out.print(rem);
			no=no/10;
	//		System.out.println();
		}
		
	}

	private void level6() {
		int no=50;
		int div=2;
		int count=0;
		while(div<=no)
		{
			if(no%div==0)
			{
				System.out.println(div);
				count++;
			}
			div++;
		}
		System.out.println("the count is "+count);
	}

	private void level5() {
		int no=100;
		int div=2;
		while(div<=no)
		{
			if(no%div==0)
			{
				System.out.println(div);
			}
			div++;
		}
	}

	private void level4() {
		int no=1;
		while(no<=50)
		{
			if(no%3==0||no%5==0)
			{
				System.out.println(no+" ");
				
			}
			no++;
		}
	}

	private void level3() {
		int no=1;
		while(no<=60)
		{
			if(no%3==0&&no%5==0)
			{
			System.out.println(no);
			}
			no++;
				
			}
		}
	

	private void level2() {
		int no=10;
		while(no>=1)
		{
			System.out.println(no+" ");
			no--;
		}
	}

	private void level1() {
		int no=1;
		while(no<=10)
		{
			System.out.println(no+" ");
			no++;
		}
	}

	private void level() {
		int no=1;
		while(no<=5)
		{
			System.out.println(1+" ");
			no++;
		}
	}

}
