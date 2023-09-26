package assignment3;
class Grandma {

	String name="stella";
	public void work()
	{
System.out.println("working");
	}
}
	
 class Mother extends Grandma
 {
	 String name= "stella";
	 public void work()
	 {
	//	 super.work();
		 System.out.println("name "+name+" super.name "+super.name);
	 }
 }

public class Kid extends Mother{
	String name="suman";
		
		public static void main(String args[])
		{
			Kid kid= new Kid();
			kid.study();
		}
			public void work()
			{
				 super.work();
				 System.out.println("name " +name+" super.name "+super.name);
			}
			public void study()
			{
				work();
				System.out.println();
			}
			
			
			

}
