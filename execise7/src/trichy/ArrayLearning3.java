package trichy;

public class ArrayLearning3 {

	public static void main(String[] args) {
		ArrayLearning3 al=new ArrayLearning3();
		al.print_adjacent_elements();
	//	al.find_first_repeted_element();
	//	al.repeted_element();
	//	al.divided_by_three();
//		al.Find_non_repeted();
//		al.prime_no();
	//	al.Frequence_of_each_element();
	}

		
	private void Frequence_of_each_element() {
		char[] name = {'k','a','l','a','i','a','r','a','s','a','n'};
		int count=1;
	    for( int j =0; j<name.length;j++)
	    {
	    char ch = name[j]; 
	    if(ch!='*')
	    {
	     count = 1; 
	    for(int i=j+1; i<name.length;i++)
	    {
	      if(ch == name[i])
	      {
	        name[i] = '*';
	        count++;
	      }
	    }
	    int repeted=0;
	 //   if(count>1)
	    if(count==1)
	    	repeted++;
	    System.out.println(ch + " appears "+ count + " time(s)");  
	   // System.out.println(ch);
	    }
	    
	  }
	    
	}


	private void prime_no() {
		int[] ar= {5,7,17,29,19};
	
		}
		
		
			
		
	




	private void Find_non_repeted() {
		char[] name = {'h','a','r','i','s','h'};
		for(int j = 0; j<name.length-1; j++) {
		    char ch = name[j]; 
		    boolean repeated = false; 
		    for(int i=j+1; i<name.length;i++)
		    {
		      if(ch !=name[i])
		      {
		        continue; 
		      }
		      else
		      {
		        repeated = true; 
		      }
		    }
		    if(repeated == false)
		    {
		      System.out.println("First Non-repeated character is "+ ch);
		      break; 
		    }
		}
	}


	private void divided_by_three() {
	//	int[] ar = {3, 12, 9, 15, 18};

	//	ar[0] = ar[0]/3; 
	//	ar[1] = ar[1]/3; 
	//	ar[2] = ar[2]/3;
	//	ar[3] = ar[3]/3;

		int[] ar = {3, 12, 9, 15, 18};
		for(int i =0; i<ar.length; i++)
		{
		    ar[i] = ar[i]/3;
		    System.out.println(ar[i]);
	}
	}


	private void repeted_element() {
		   char[] name = {'s','h','r','i','r','a','m'}; 
		    int j = 1; 
		    while(j<name.length-1)
		    {
		    char ch = name[j]; 
		    for(int i=j+1; i<name.length;i++)
		        {
		          if(ch == name[i])
		          {
		            System.out.println("First repeated character is "+ ch);
		            break; 
		          }
		        }
		    j++;
		    }

		    
		  }
	


	private void find_first_repeted_element() {
	    char[] name = {'s','r','i','v','a','r','s','h','a','n'};
	    char ch = name[0]; 
	    for(int i=1; i<name.length;i++){
	      if(ch == name[i])
	      {
	        System.out.println("yes, first repeated character is "+ ch);
	        break; 
	      }
	    }
	    
	  }
	


	

	private void print_adjacent_elements() {
	    int[] a = {3, 8, 5, 13};  int i =0; 
	      //         0  1  2   3
	    while(i<a.length-1)
	      {
	    int start = a[i]; 
	    int end = a[i+1]; 
	    if(start<end) 
	    {
	    for(int no = start+1; no<end; no++)
	        System.out.print(no+" "); 
	    System.out.println();
	    i++;
	    }
	    else
	    {
	      for(int no = start-1; no>end; no--)
	          System.out.print(no+" "); 
	      System.out.println();
	      i++;
	    }
	    
	      }		      
		    
		    
		  
		
			
	}

}
