package namakal;

public class Pattern2 {

	public static void main(String[] args) {
		Pattern2 pp=new Pattern2();
	//	pp.print_star();
	//	pp.print_number();
	//	pp.print_pattren1();
	//	pp.print_pattren2();
	//	pp.print_pattren3();
	//	pp.print_pattren4();
	//	pp.print_pattren5();
	//	pp.print_pattren6();
	//	pp.print_pattren7();
	//	pp.print_pattren8();
	//	pp.print_pat();
	//	pp.pattren1();
	//	pp.pattren2();
	//	pp.pattren3();
		
}
	private void pattren3() {
		 for(int line =1; line<=5;line++)
		    {
		    for(int no = 1; no<line; no++)
		        System.out.print("* "); 
		    System.out.println();
		    }
	}
	private void pattren2() {
	    for(int line =1; line<=5;line++)
	    {
	    for(int no = 1; no<line; no++)
	        System.out.print("* "); 
	    for(int star=1; star<=6-line; star++)
	      System.out.print(star+" "); 
	    System.out.println();
	    }

	    
	  }
	
	private void pattren1() {
		for(int line=1;line<=5; line++)
	    {
	       for(int space=1; space<=5-line; space++)
	        {
	        System.out.print(" ");
	        }
	        for(int star = 1; star<=line; star++)
	        {
	        System.out.print("* "); 
	        }
	    System.out.println(); 
	    }
	}
	private void print_pat()
	{
		for(int line = 5; line>=1; line--)
	    {
	        for(int no=1; no<=line; no++)
	        {
	        System.out.print(" "+" ");
	        }
	        for(int no=1; no<=6-line; no++)
	          System.out.print(6-no+" "); 	
	       
	    System.out.println(); 
	    }
	}
		private void print_pattren8() {
			for(int line = 5; line>=1; line--)
		    {
		        for(int no=1; no<=line; no++)
		        {
		        System.out.print("*"+" ");
		        }
		        for(int no=1; no<=6-line; no++)
		          System.out.print(6-no+" "); 	//6-no+""
		       
		    System.out.println(); 
		    }
			
	}
		private void print_pattren7() {
			for(int line = 5; line>=1; line--)
		    {
		        for(int no=1; no<=line; no++)
		        {
		        System.out.print(no+" ");
		        }
		        for(int no=1; no<=6-line; no++)
		          System.out.print(6-no+" "); 	//6-no+""
		       
		    System.out.println(); 
		    }
	}
		private void print_pattren6() {
			for(int line = 5; line>=1; line--)
		    {
		        for(int no=1; no<=line; no++)
		        {
		        System.out.print(no+" ");
		        }
		        for(int no=1; no<=6-line; no++)	//no<=5  //print la no kudutha
		          System.out.print(1+" "); 
		       
		    System.out.println(); 
		    }
	}
		private void print_pattren5() {
			for(int line = 5; line>=1; line--)
			{
			    for(int no=5; no>=line; no--)
			    {
			    System.out.print("  ");
			    }
		//	    System.out.print(1+" "); 
			System.out.println(); 
			}
	}
		private void print_pattren4() {
			for(int limit = 1; limit<=5; limit++) 
			{
			    for(int no=1; no<=limit; no++)
			    System.out.print(no+" "); 
			    System.out.println(); 
			}
	}
		private void print_pattren3() {
			for(int no2 = 9; no2>=7; no2--)
			{
			    for(int no = no2; no>=3; no-=3)
			        System.out.print(no + " ");
			    System.out.println(); 
			}
	}
		private void print_pattren2() {
			for(int limit = 7; limit>=1; limit-=2)
		    {
		        for(int no = 1; no<=limit; no++)
		            System.out.print(no+" "); //1   2   3   4   5 6 7
		        System.out.println(); 
		    }
	}
													//	1 2 3 4 5
	private void print_pattren1() {					//	1 2 3 4
		for(int limit = 5; limit>=1; limit--)		//  1 2
		{											//  1
		    for(int no = 1; no<=limit; no++)
		        System.out.print(no+" ");   
		    System.out.println(); 
		}
	}

	private void print_number() {
		for(int line=1;line<=5; line++)
		{
		for(int no = 1; no<=5; no++)
		    System.out.print(no + " "); 
		System.out.println(); 
		}
	}

	private void print_star() {
		for(int line=1; line<=5; line++)
		{
		    for(int star = line; star<=5; star++)
		    {
		    System.out.print("* "); 
		    }
		    System.out.println(); 
		}
	}
	}
