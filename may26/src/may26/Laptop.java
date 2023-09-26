package may26;

public class Laptop {
		  int price; 
		  public Laptop(int price)
		  {
		    this.price = price; 
		  }

		  public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    Laptop lap1 = new Laptop(30000);
		    Laptop lap2 = new Laptop(30000);
		    System.out.println(lap1.equals(lap2));
		    System.out.println(lap1.hashCode());
		    System.out.println(lap2.hashCode());
		  }
		  public boolean equals(Object oo)
		  {
		    Laptop ll = (Laptop)oo;
		    if (this.hashCode() == ll.hashCode())
		      return true; 
		    return false;
		  }
		  public int hashCode()
		  {
		    return -123;
		  }
	}




