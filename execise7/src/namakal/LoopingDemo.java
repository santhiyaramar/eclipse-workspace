package namakal;

public class LoopingDemo {

	public static void main(String[] args) {
	LoopingDemo ld=new LoopingDemo();
	ld.patrn_S();
;//	ld.pattern();
//	ld.pattern2();
//	ld.print_I();
//	ld.print_T();
//	ld.star();
//	ld.print_C();
//	ld.print_O();
//	ld.print_D();
//	ld.print_B();
//	ld.patter();
//	ld.pattern_Y();
//	ld.pattern_M();
//	ld.pattern_N();
//	ld.pattern_X();
//	ld.pattern_Y2();
	//ld.pattren_A();
	}

	private void patrn_S() {
		for(int row=1;row<=5; row++)
		{
		for(int col=1;col<=5; col++)
		{
			if( row==1||row==5||row==5/2+1||col==1&&row<7/2||col==5&&row>=7/2)
			{
				System.out.print("* ");
			}
			else
			{System.out.print("  ");
			
			}
		
		}
		System.out.println();
		}
	}
	

	private void pattren_A(){
		for(int line=1;line<=7;line++)
		{
			for(int star=1;star<=7;star++)
			{
				if(line==1||star==1||line==7)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			
		//	if(row==4)
		//	{
		//		System.out.print("* ");
	//		}
	//		else
	//		{
		//		System.out.print("  ");
	//		}
				
					
			}
			System.out.println();
		}
		
	}

	private void pattern_Y2() {
	    for(int line = 1; line<=7;line++)
	    {
	        for(int star = 1; star<=7; star++)
	        {
	        if(line<=4) 
	        {
	          if(star==line || star==8-line)
	            {
	            
	              System.out.print("* ");
	            }
	            else
	            {
	                System.out.print("  "); 
	            }
	        }
	        else
	        {
	          if(star==8-line)
	            System.out.print("* ");
	          else
	            System.out.print("  "); 
	        }
	        }
	        System.out.println();
	    }
		
	}

	private void pattern_X() {
		   for(int line = 1; line<=7;line++)
		    {
		        for(int star = 1; star<=7; star++)
		        {
		          if(star==line || star==8-line)
		            {
		              System.out.print("* ");
		            }
		            else
		            {
		                System.out.print("  "); 
		            }
		        }
		        System.out.println(); 
		    } 
		
	}

	private void pattern_N() {
	    for(int line = 1; line<=7;line++)
	    {
	        for(int star = 1; star<=7; star++)
	        {
	          if(star==1||star==7||star==line)
	            {
	              System.out.print("* ");
	            }
	            else
	            {
	                System.out.print("  "); 
	            }
	        }
	        System.out.println(); 
	    } 
	    
		
	}

	private void pattern_M() {
	    for(int line = 1; line<=9;line++)
	    {
	        for(int star = 1; star<=7; star++)
	        {
	          if(line<=4)
	          {
	            if(star==line||star==8-line||star==1 || star==7)
	            {
	              System.out.print("* ");
	            }
	            else
	            {
	                System.out.print("  "); 
	            }
	          }
	          else
	          {
	        	  if(star==1||star==7)
	        		  System.out.print("* ");
	        	  else
	        		  System.out.print("  ");
	          }
	          
	      
	        }
	        System.out.println(); 
	    } 
	    
	  }
		
	

	private void pattern_Y() {
	    for(int line = 1; line<=9;line++)
	    {
	        for(int star = 1; star<=7; star++)
	        {
	          if(line<=4)
	          {
	            if(star==line || star==8-line)
	            {
	              System.out.print("* ");
	            }
	            else
	            {
	                System.out.print("  "); 
	            }
	          }
	            else
	            {
	            	if(star==4)
	            		System.out.print("* ");
	            	else
	            		System.out.print("  ");
	          }
	      
	        }
	        System.out.println(); 
	    }
		
	}

	private void patter() {
		for(int row=1;row<=9; row++)
		{
			for(int col=1; col<=9; col++)
			{
				if(row==9||col==1||col==9)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	private void print_B() {
		for(int row=1;row<=9; row++)
		{
			for(int col=1; col<=9; col++)
			{
				if(row==1||row==9||col==1||col==9||row==9/2+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			
			}
			System.out.println();
		}
	
	}

	private void print_D() {
	for(int row=1;row<=9;row++)
	{
		for(int col=1;col<=9;col++)
		{
			if(row==1||row==9||col==9||col==2)
			{
				System.out.print("* ");
				
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
		
	}

	private void print_O() {
		for(int row = 1; row<=9; row++)
	       { //row=2 1<=9
	        if(row==1 || row==9)
	        {
	            for(int col = 1; col<=9; col++)
	            {
	            	  {
	                      if(col==1 || col==9) {
	                        System.out.print("  ");
	                      }
	                      else
	                System.out.print("* "); 
	            }
	        }
	        }
	        else
	        {
	            System.out.print("*"); 
	            for(int space=1;space<=15; space++)
	            {
	              System.out.print(" ");
	            }
	            System.out.print("*");
	        }
	        System.out.println(); 
	      }
		
	}

	private void print_C() {
		   for(int row = 1; row<=9; row++)
		   {
		        if(row==1 || row==9)
		        {
		            for(int col = 1; col<=9; col++)
		            {
		                System.out.print("* "); 
		            }
		        }
		        else
		        {
		            System.out.print("* "); 
		        }
		        System.out.println(); 
		      }
		    
		  }
		
	

	private void star() {
		for(int row = 1; row<=9; row++)
		   {
		    for(int col = 1; col<=9; col++)
		    {
		        System.out.print("* "); 
		    }
		    System.out.println(); 
		   }
		
	}

	private void print_T() {
		for(int star=1; star<=7; star++)
	    {
	    System.out.print("* "); 
	    }
	    System.out.println(); 
	    for(int star=1; star<=6; star++)
	    {
	      for(int space=1; space<=6; space++)
	      {
	        System.out.print(" ");
	      }
	    System.out.println("* ");
	    }
		
	}

	private void print_I() {
		for(int star=1; star<=7; star++)
		{
		System.out.print("* "); 
		}
		System.out.println(); 
		for(int star=1; star<=6; star++)
		{
		System.out.println("      * ");
		}
		for(int star=1; star<=7; star++)
		{
			for(int space=1; space<=1;space++)
			{
				  System.out.println(" ");
			}
		System.out.print("* "); 
		}
		for(int star=1; star<=7; star++)
		{
		System.out.print("* "); 
		}
		System.out.println(); 
		for(int star=1; star<=6; star++)
		{
		System.out.println("      * ");
		}
		for(int star=1; star<=7; star++)
		{
		System.out.print("* "); 
		}
		
	}

	private void pattern2() {
		  for(int star=1; star<=7; star++)
		    {
		      System.out.print("* ");
		    }
		    System.out.println();
		    for(int star=1; star<=6; star++)
		    {
		      System.out.println("* ");
		    }
		    for(int star=1; star<=7; star++)
		    {
		      System.out.print("* ");
		    }
		  }

	private void pattern() {
		   for(int row = 1; row<=3;row++)
		      {
		      for(int col=1; col<=7; col++)
		      {
		        System.out.print("* ");
		      }
		     System.out.println();
		      }    
		  }
		
		
	}


