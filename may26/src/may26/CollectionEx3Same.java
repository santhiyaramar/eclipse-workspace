package may26;

import java.util.ArrayList;

public class CollectionEx3Same {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
	    al.add("I"); 
	    al.add("love");
	    al.add("Java"); 
	    for(int i=0; i<al.size(); i++)
	    {
	    Object ob = al.get(i); //I love Java
	    if(ob.equals("Java"))
	        {
	        al.set(i, "Python"); 
	        }
	    }
	    System.out.println(al);
	}

}
