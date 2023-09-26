package may26;

public class RecursionDemo {

	public static void main(String[] args) {
		RecursionDemo rd=new RecursionDemo();
		rd.display(1);
		rd.stringtointeger();
//	int result=	rd.fact(4);
//	System.out.println(result);
	}

	private void stringtointeger() {
		String s = "abcd1234";
	    
	    try {
	    int no = Integer.parseInt(s);
	    System.out.println("Yes, full of numbers");
	    System.out.println(no);
	    }
	    catch(NumberFormatException nn)
	    {
	      System.out.println("No, it contains other than number");
	    }
	}

	private int fact(int no) {
		  if(no==1)
		      return 1; 
		    return no * fact(no-1);
		  }
	

	private void display(int no) {
		   System.out.println(no);
		    no++; 
		    if(no<=5)
		      display(no);
		  }
	}


