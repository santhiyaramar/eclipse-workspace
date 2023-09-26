package doubt;

public class spiral_4_4 {
	/*
	 * 1  2  3  4 
	 * 12 13 14 5
	 * 11 16 15 6
	 * 10 9  8  7
	 */

	public static void main(String[] args) {
		int[][] a=new int[4][4];
		int mincol=0,maxcol=3,minrow=0,maxrow=3,no=1;
		while (no<=16) {
			
		
		// 1 2 3 4
		for (int col=mincol;col<=maxcol;col++)
		{
			a[mincol][col]=no;
			no++;
		}
		minrow++;
		
		
		//5 6 7 
		for(int row=minrow;row<=maxrow;row++)
		{
			a[row][maxcol]=no;
			no++;
		}
		maxcol--;
		
		//8 9 10
		for(int col=maxcol;col>=mincol;col--)
		{
			a[maxrow][col]=no;
			no++;
		}
		maxrow--;
		
		//11 12
		
		for(int row=maxrow;row>=minrow;row--)
		{
			a[row][mincol]=no;
			no++;
		}
		mincol++;
		
		}
		for (int row = 0; row < a.length; row++) {
			
		for (int col = 0; col < a.length; col++) {
			
			System.out.print(a[row][col]+"\t");
			
		}
		System.out.println();
		
			
		}
			
		

	}

}
