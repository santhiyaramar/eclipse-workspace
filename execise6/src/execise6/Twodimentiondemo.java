package execise6;

public class Twodimentiondemo {

	public static void main(String[] args) {
		Twodimentiondemo td=new Twodimentiondemo();
	//	td.jagged_Array();
	//	td.cross_matrix();
	//	td.length();
	//	td.exam_result();
	//	td.exam_result1();
	//	td.exam_result_big();
	//	td.exam_result_small();
	//	td.exam_result2();
	//	td.matrix_addition();
		td.spiral_matrix();
	}
		private void spiral_matrix() {
			int[][] c = new int[5][5];
			  int minRow =0, maxRow = 4; 
			  int minCol = 0, maxCol = 4; 
			  
			  
			  int no = 1; 
			while(no<=25) {
			  for(int col = minCol; col<=maxCol; col++)
			    {c[minRow][col] = no; no++;}  
			  minRow++;//minRow = 1  maxRow = 3

			  for(int row=minRow;row<=maxRow;row++)
			    {c[row][maxCol] = no; no++;}
			  maxCol--;  //minCol = 0, maxCol = 2

			  for(int col=maxCol; col>=minCol;col--)
			    {c[maxRow][col] = no; no++;}
			  maxRow--; // minRow = 1 maxRow = 2
			  
			  for(int row = maxRow; row>=minRow;row--)
			    {c[row][minCol] = no; no++;}
			  minCol++;

			}
			  
			  for(int i=0; i<5; i++)
			  {
			    for(int j=0; j<5; j++)
			    {
			      System.out.print(c[i][j]+"   ");
			    }
			    System.out.println();
			  }
	}
		private void matrix_addition() {
			int[][] a = {
			          {10,20,30},
			          {40,50,60}, 
			          {70,80, 90}
			          };
			    int[][] b = {
			          {90,80,70},
			          {60,50,40}, 
			          {30,20,10}
			          };
			    
			    int[][] c = new int[3][3];
			    for(int row = 0;row<c.length; row++) 
			    {
			    for(int col=0; col<3; col++)
			    {
			      c[row][col] = a[row][col]+b[row][col];
			      System.out.print(c[row][col]+" ");
			    }
			    System.out.println();
			    }
	}
		private void exam_result2() {
			int[][] marks = {
		            {50,56, 58, 52, 40}, 
		            {60,36, 50},
		            {51,58, 68, 45}
		            };
		    System.out.println(marks.length);
		    for(int exam = 0; exam<marks.length; exam++)
		    {
		      int total = 0; int big = 0; 
		    for(int sub =0;sub<marks[exam].length;sub++)
		    {
		      //System.out.print(marks[exam][sub]+" ");
		      if(sub==2)
		      {
		    	  
		        System.out.println(marks[exam][sub]);
		      }
		    }
		    
		    }
	}
		private void exam_result_small() {
			int[][] marks= { {40,50,60},
							{45,56,67,89},
								{98,80,90,55,77}
							};
			int total=0;
			int small=100;
			
			System.out.println(marks.length);
			for(int exam=0;exam<marks.length;exam++)
			{
				for(int sub=0;sub<marks[exam].length;sub++)
				{
					if(small>marks[exam][sub])
					
					{
						small=marks[exam][sub];
					}
						total+=marks[exam][sub];
			}
				System.out.println("total "+ ": "+total);
				System.out.println("small "+": "+small);
			}
			
	}
		private void exam_result_big() {
		int[][] marks= { {40,50,60},
						{45,56,67,89},
							{98,80,90,55,77}
						};
		int total=0;
		int big=0;
		
		System.out.println(marks.length);
		for(int exam=0;exam<marks.length;exam++)
		{
			for(int sub=0;sub<marks[exam].length;sub++)
			{
				if(marks[exam][sub]>big)
				
				{
					big=marks[exam][sub];
				}
					total+=marks[exam][sub];
		}
			System.out.println("total "+ ": "+total);
			System.out.println("big "+": "+big);
		}
		}
		private void exam_result1() {
		int[][]marks= { {40,50,60,70},
					{45,56,67,},
					{98,80,90,55,77}
		};
		System.out.println(marks.length);
		for(int exam=0;exam<marks.length;exam++)
		{
			for(int sub=0;sub<marks[exam].length;sub++)
			{
				System.out.print(marks[exam][sub]+" ");
			}
				System.out.println();
		}
		}

	
		private void exam_result() {
			int[] quartealy= {45,56,78,54,70};
			int[] half = {40,50,60,77,80};
			int[]annual= {55,65,75,85,95};
			int [][]marks = {quartealy,half,annual};
	//		int exam=0;
			System.out.println(marks.length);
			for(int exam=0;exam<marks.length;exam++)
			{
				
				for(int sub=0;sub<marks[exam].length;sub++)
				System.out.print(marks[exam][sub]+" ");
				System.out.println();
			}
		}					
		
		
	
		private void length() {
		int[][] values= { {10,20,30,30,40},
					{50,60,70,80},
					{90,55,36,87,77,85,}
						};
		System.out.println(values.length);
	//	System.out.println(values[0].length);
	//	System.out.println(values[1].length);
		System.out.println(values[2].length);
		
	}
		private void cross_matrix() {
			int[][] a = {  {10, 20, 30},
			          {40, 50, 60},
			          {70, 80, 90}
			        };
			  for(int row = 0; row<a.length;row++)
			  {
			    for(int col=a[row].length-1;col>=0;col--)
			    {
			      if(row + col ==2)
			      System.out.print(a[row][col]+" ");
			    }
			    System.out.println();
			  }
	}
		private void jagged_Array() { 
		int[][] marks = {
	            {50,56, 60, 35, 42}, 
	            {60,36, 50},
	            {51,58, 68, 45}
	            };
	    System.out.println(marks.length);
	    for(int exam = 0; exam<marks.length; exam++)
	    {
	    for(int sub =0;sub<marks[exam].length;sub++)
	      System.out.print(marks[exam][sub]+" ");
	    System.out.println();
//	    exam++;
	    }
	}


	}


