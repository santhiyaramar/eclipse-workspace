package namakal;

public class Pattrens3 {

	public static void main(String[] args) {
		Pattrens3 pt=new Pattrens3();
	//	pt.A();
		pt.B();
	//	pt.c();
	//	pt.D();
	//	pt.E();
	}

	private void E() {
		for(int row=1; row<=5;row++)
		{
			for(int col=1;col<=6-row;col++)
			{
				System.out.print(col+" ");
			}
			for(int no=1;no<=5;no++)
			{
				System.out.print(1+" ");
				
			}
			System.out.println("  ");
		//	System.out.println();
			
			
		}
	}

	private void D() {
		char ch='A';
		for(int line=1;line<=5;line++)
		{
			for(int no=1;no<=line;no++)
			{
				System.out.print(ch+" ");
				ch++;
				
			}
			System.out.println();
		}
	}

	private void c() {
		for(int line=5;line>=1;line--)
		{
			for(int num=line;num>=1;num--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		for(int line=2;line<=5;line++)
		{
			for(int num=line;num>=1;num--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}
	

	private void B() {
		for(int line=1;line<=5;line++)
		{
			for(int num=1;num<=line;num++)
			{
				System.out.print("  ");
			}
			for(int num=1;num<=5-line;num++)
			{
			System.out.print(1+" ");
			}System.out.println();
		}
		
	}

	private void A() {
		for(int line=1;line<=5;line++)
		{
			for(int no=1; no<=5;no++)
				if(line==no)
		{
			System.out.print(line+" ");
		}
		else
		{
			System.out.print(1+" ");
		}
		System.out.println();
		
	}

}
}
