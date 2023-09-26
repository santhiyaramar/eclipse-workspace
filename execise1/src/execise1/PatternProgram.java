package execise1;

public class PatternProgram {

	public static void main(String[] args) {
		PatternProgram pp=new PatternProgram();
	//	pp.A();
	//	pp.B();
	//	pp.C();
	//	pp.D();
	//	pp.E();
	//	pp.F();
	//	pp.G();
	//	pp.H();
		pp.I();
	}

	private void I() {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				
			}
		}
	}

	private void H() {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print((char)(65+i)+" ");
			}
			System.out.println();
		}

	}

	private void G() {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print((char)(74-j)+" ");
			}
			System.out.println();
		}
	}
	

	private void F() {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}
	}
	

	private void E() {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(9-i+" ");
			}
			System.out.println();
		}
	}
	

	private void D() {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	private void C() {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	private void B() {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(9-j+" ");
			}
			System.out.println();
		}
	}

	private void A() {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
