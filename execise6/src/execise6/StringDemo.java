package execise6;

public class StringDemo {

	public static void main(String[] args) {
	StringDemo str=new StringDemo();
	int[] ar= {10,8,5,1};
//	str.Find_biggest(ar);
//	str.bubble_sorts(ar);
	str.learn_binary_search();
	

	}

	private void learn_binary_search() {
		  int[] ar = {10,8, 5,1};
		    int key = 3;
		    boolean position=false;
		    int start = 0, end = ar.length-1; // start = 0 end = 3
		      //mid = 1
		    while(true)
		    {
		      int mid = (start+end)/2;
		      if(key == ar[mid])  // 5 == 8 
		      {
		    	  position=true;
		        System.out.println("Yes, present at position: "+ mid );
		   //     position=true;
		       break;
		      }
		      else if(key>ar[mid])
		      {
		        end = mid - 1; 
		      }
		      else 
		      {
		        start = mid + 1; 
		      }
		    
		    if(position==false)
		    {
		    	System.out.println("yes the position is not present");
		    	break;
		    }
		  }
	}
	

	private void bubble_sorts(int[] ar) {
	    //int n 
		  for(int j = 1; j<ar.length; j++)
		    {
		    for(int i=0; i<ar.length-j; i++)
		      {
		        if(ar[i]>ar[i+1])	//decending	order  if(ar[i]<ar[i+1])
		        {
		          int temp = ar[i];
		          ar[i] = ar[i+1];
		          ar[i+1] = temp;
		        }
		      }
		    }  //return ar;
		  System.out.print("[ ");
		  for(int i=0; i<ar.length;i++)
		  {
		    System.out.print(ar[i]+ " | ");
		  }
		  
		  System.out.print(" ] ");
		  }
	

	private void Find_biggest(int[] ar) {
	    for(int i=0; i<ar.length-1; i++)
	    {
	      if(ar[i]>ar[i+1])
	      {
	        int temp = ar[i];
	        ar[i] = ar[i+1];
	        ar[i+1] = temp;
	      }
	    }
	    System.out.println("Biggest is "+ ar[ar.length-1]);
	  } 
		
	}
	


