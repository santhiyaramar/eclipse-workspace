package trichy;


public class ArrayLeaning2 {

	public static void main(String[] args) {
		ArrayLeaning2 ar=new ArrayLeaning2(); 
	//	ar.find_number();
	//	ar.findstoreanotherarray();
	//	ar.find_count_of_no();
	//	ar.add_index_no();
	//	ar.odd_element();
	//	ar.even_element();
	//	ar.multilple_of_ten();
	//	ar.multiple_of_two_div();
	//	ar.odd_element_store_another_array();
	//	ar.negative_number();
	//	ar.store_negative_number();
	//	ar.store_odd_index();
	//	ar.odd_element_even_index();
	//	ar.even_element_odd_index();
	//	ar.linear_search();
	//	ar.index_position();
	//	ar.biggest_element();
	//	ar.next_biggest_elenent();
	//	ar.second_Biggest_no();
		
	}

	
	

	private void second_Biggest_no() {
		int ar[]= {6,8,9,12,16,11};
		int big=ar[0];
		int secondbig=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>big)
			{
				secondbig=big;
				big=ar[i];
			}
			else if(ar[i]>secondbig)
			{
				secondbig=ar[i];
			}
			System.out.println("biggest is "+big);
			System.out.println("second biggest is "+secondbig);

		}
		
	}



	private void next_biggest_elenent() {
		int ar[]= {8,13,9,10,12,44,5};
		int no =ar[i];
		int big=100;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>no)
			{
				if(ar[i]<big)
				{
					big=ar[i];
				}
			}
			if(big==100)
			{
				System.out.println("no "+no);
			}
			else
			{
				System.out.println(no+".....> "+big);
			}
		}
		
	}

	private void biggest_element() {
		int ar[]= {5,8,9,12,4};
		int big=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>big)
			{
				big=ar[i];
				
			}
		}System.out.println("the biggest no is "+big);
		
			
	}

	private void index_position() {
		int ar[]= {5,8,3,4,9};
		int no=9;
		for(int i=0;i<ar.length;i++)
		{
			if(no==ar[i])
			{
				System.out.println("yes we got the no in index "+": "+i);
			}
		}
	}

	private void linear_search() {
		int ar[]= {5,8,7,3};
		int no=13;
		boolean present=false;
		for(int i=0;i<ar.length;i++)
		{
			if(no==ar[i])
			{
				System.out.println("yes we got the no in index "+i+": "+ar[i]);
				present=true;
				break;
			}
		}
		if(present==false)
		{
			System.out.println("not present");
		}
	}

	private void even_element_odd_index() {
		int ar[]={11,12,13,15,12,16,18};
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
			{
				System.out.println(ar[i]);
			}
			
		}
	}

	private void odd_element_even_index() {
		int ar[]={11,12,13,15,12,16,18};
		for(int i=1;i<ar.length;i+=2)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
			
		}
	}

	private void store_odd_index() {
		int[] ar=  {10,20,30,40,50,60};
		int count=0;
		for(int i=0;i<ar.length;i++)
		{	
		//	if(ar[i]%2==0)
			count++;
		}
		System.out.println("the count is "+count);
		int[] b= new int[count];
		int j=0;
		for (int i=0;i<ar.length;i++)
		{
	//		if(ar[i]%2==0)
			{
			b[j]=ar[i];
			System.out.println(b[j]);
			j++;
			}
		}
	}

	private void store_negative_number() {
		int[] ar= {10,20,-30,-40,50,60};
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
				count++;
		}
		System.out.println("the count is " + count);
		int[] b= new int[count];
			int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				b[j]=ar[i];
				System.out.println(b[j]);
				j++;
			}
		}
	}

	private void negative_number() {
		int[] ar= {10,20,-30,-40,-50,60};
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				System.out.println(ar[i]);
			}
		}
	}

	private void odd_element_store_another_array() {
	
			int [] a= {10,20,30,40,15,3,7};
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2!=0)
					count++;
			}
			int []b= new int[count];
			int j=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2!=0)
				{
					b[j]= a[i];
					System.out.println(b[j]);
					j++;
				}
			}
		}
	

	private void multiple_of_two_div() {
		int[] ar= {10,20,30,40,50,60};
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%10==0 && ar[i]%15!=0) 
			{
				System.out.println(ar[i]);
				
			}
		}
	}

	private void multilple_of_ten() {
		int[]ar= {10,20,30,36,40,50,60};
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%10==0)
			{
				System.out.println(ar[i]);
			}
		}
	}

	private void even_element() {
		int[] ar= {10,20,13,35,65,30};
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
	}

	private void odd_element() {
		int[] a= {10,20,24,27,30,15};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)//odd 1 3 5 7
			{
				System.out.println(a[i]);
			}
		}
	}

	private void add_index_no() {
		int[] ar= {10,20,30,40,50,60};
		int total=0;
		for(int i=1;i<ar.length;i+=2)
			//odd 1 3 5 7 9
		{	
			//eve 2 4 6 8
			System.out.println(i);
			total=total+ar[i];
		
	}
	System.out.println(total);
	}


	private void find_count_of_no() {
		int[] ar= {5,4,5,4,5,4,5,4};
		int no=4;
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(no==ar[i])
			{
				System.out.println(ar[i]);
				count++;
			}
		}
		System.out.println("given element is present"+count);
		
	}

	private void findstoreanotherarray() {

int[] a = {10,20,30, 15, 25, 35};

int count = 0; 
for(int i =0; i<a.length; i++)
    {
    if(a[i]%2!=0)
        count++; 
    }
int[] b = new int[count]; 

int j = 0; 

for(int i =0; i<a.length; i++)
    {
    if(a[i]%2!=0)
        {
        b[j] = a[i]; 
        System.out.println(b[j]); 
        j++; 
        }
    }
	}

	private void find_number() {
		int[] ar = {5, 8, 3,4}; 
	    //      0  1  2 3
//	int no = 8; 
	int no=30;
	boolean present=false;
	for(int i = 0; i<ar.length; i++)
	{
	    if(no == ar[i])
	        {   
	        System.out.println("Yes, We got the number in index " + i); 
	        present= true;                 
	        break;
	        }
	}
	if(present==false)
	{
		System.out.println("No is not present");
	}
	}

}
