package may26;

public class Searching {

	public static void main(String[] args) {
		Searching sr=new Searching();
	//	sr.linear_searching();
		sr.adjacent_element();
	}
private void adjacent_element() {
		int ar[]= {4,8,12,16};
		int i=0;
		while(i<ar.length-1)
		{
			int start=ar[i];
			int end=ar[i+1];
			for(int no=start;no<end;no++)
			{
			//	if(start<end)
				System.out.print(no+" ");
			}
			System.out.println();
			i++;	
		}
	}
//int position=sr.bineary_search();
//if(position>0)
//{
//	System.out.println("present in position");
//}
//else
//{
	//System.out.println("not present in the position");
//}
	//}

	private void bineary_search() {
		int ar[]= {1,2,3,4,5,6,7,8,9};
		int min=0;int max=ar.length-1;
		int key=8;
		while(min<=max)
		{
			int mid=(min+max)/2;
			if(key==ar[mid])
			{
				System.out.println("yes present at the mid"+mid);
				break;
			}
			else if(key<ar[mid])
			{
				max=mid-1;
			//	return mid+1;
			}
			else
			{
				min=mid+1;
			}
		}
	//	return-1;
	}

	private void linear_searching() {
		int ar[]= {5,8,9,10,12};
		int no=2;
		boolean present=false;
		for(int i=0;i<ar.length;i++) 
		 {
			if(no==ar[i])
			{
				System.out.println("yes the number is present in index "+i+":"+ar[i]);
			}
		 }
		if(present==false)
		{
			System.out.println("the number is not present");
		}
			
	}

}
