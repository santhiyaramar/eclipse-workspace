package may26;

public class Shorting {

	public static void main(String[] args) {
		
		int ar[]= {50,40,30,20};
		for(int j=1;j<ar.length;j++)
			
		{
			for(int i=0;i<ar.length-j;i++)
			{
				if(ar[i]>ar[i+1])
				{
					int temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
				}
				}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
			System.out.println("big is "+ar[ar.length-1]);
		
	}
}
		
			
			
		
			
	

