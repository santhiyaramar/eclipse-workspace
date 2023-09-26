package consstructor;

public class Mobile {

	public Mobile()
	{
		this(10,20);
		System.out.println("Mobile_one_arg_cunstructor");
	}

	public Mobile(int no1,int no2) 
	{
		
		System.out.println("Mobile_two_arg_cunstructor");
	}

}
