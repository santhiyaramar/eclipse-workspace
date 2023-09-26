package doubt;

public class rev_spiral {
	
	/*
	 * 4  3  2  1 
	 * 5 14 13 12 
	 * 6 15 16 11
	 * 7  8  9 10
	 */

	public static void main(String[] args) {
		int mincol=0,maxcol=3,minrow=0,maxrow=3, no=1;
		
		int a[][]=new int[4][4];
		
		//4 3 2 1 top
		for(int col=maxcol;col>=mincol;col--)
		{
			a[minrow][col]=no;
			no++;
		}
		minrow++;
		
		//5 6 7 left 
		for(int row=minrow;row<=maxrow;row++)
		{
			a[row][mincol]=no;
			no++;
		}
		mincol++;
		// 8 9 10
		for(int col=mincol;col<=maxcol;col++)
		{
			a[maxrow][col]=no;
			no++;
		}
		maxcol--;
		
		
		
		for (int row = 0; row < a.length; row++) {
			
			for (int col = 0; col < a.length; col++) {
				
				System.out.print(a[row][col]+"\t");
				
			}
			System.out.println();
	}

	}
}
