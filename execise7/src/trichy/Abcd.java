package trichy;

@FunctionalInterface
public interface Abcd {
	
	public static void test()
	{
		System.out.println("hi");
	}
	 abstract void display();
	
	 default void add(int no1,int no2)
	{
		System.out.println(no1+no2);
	} 
}
	
	 
	
	


