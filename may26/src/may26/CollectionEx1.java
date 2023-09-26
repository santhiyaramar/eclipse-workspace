package may26;

import java.util.ArrayList;

public class CollectionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "i love java , java is one of the easiest programming languages. Java has more inbuilt libraries";
	    
	    String output = input.replace("java", "python");
	    //System.out.println(output);

	    ArrayList al = new ArrayList(); 
	    String[] str = input.split(" ");
	    for(String st: str)
	    {
	      if(st.equals("java"))
	        al.add("Python");
	      else
	        al.add(st);
	    }
	    System.out.println(al);
	}

}
