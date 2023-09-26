package consstructor;

public class Redmi extends Mobile{
	public Redmi()
	{
		System.out.println("REDMI CONSTRUCTOER");
	}
	public Redmi(int no)
	{
		super();
		System.out.println("redmy one arg cunstructor");
	}

	public static void main(String[] args) {
		Redmi obj=new Redmi(10);

	}

}
