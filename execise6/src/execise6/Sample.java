package execise6;

public class Sample{

	public static void main(String[] args) {
		Sample  ad=new Sample();
		int total=ad.add();
		System.out.println(total);
		ad.add(total,20);
		ad.add("Kavi");
	}
		
private void add(String k) {
		System.out.println(k);
		
	}

private void add(int total, int i) {
		System.out.println(total*20);
		
	}

//		Sample ex=new Sample();
//		Example e=new Sample();
//		ex.add();
//
//	}
//	public void add()
//	{
//		System.out.println("ss");
//	}

		public int add()
		{
			int no=2;
			int no1=10;
			int total=no+no1;
			return total;
		}
}
