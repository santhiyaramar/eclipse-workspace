package namakal;

public class LoopingDemo1 {

	public static void main(String[] args) {
		LoopingDemo1 lp= new LoopingDemo1();
	//	 lp.patern_A();
	//	lp.pattren_B();
	//	lp.pattren_c();
	//	lp.pattren_D();
	//	lp.pattren_E();
	//	lp.pattren_F();
		lp.patern_G();
	//	lp.pattren_H();
	//	lp.pattren_I();
	//	lp.patern_J();
	//	lp.patern_M1();
		
		
	//	lp.pattren_L();
	//	lp.patern_M();
	//	lp.paatern_N();
	//	lp.patern_O();
	//	lp.paatern_P();
		
	//	lp.paatern_R();
	//	lp.patren_S();
	//	lp.pattren_t();
		
	//	lp.patern_U();
	//	lp.paatern_V();
	//  lp.paatern_W();
	//	lp.patern_X();
	//	lp.patern_Y();
	//	lp.paatern_Z();
	//	lp.paatern_MM();


	}
	private void paatern_MM() {
		for(int row=1;row<=7; row++)
		{
		for(int col=1;col<=7; col++)
		{
			if( col==1||col==7||row==1&&col<=7/2||row==col&&row<=7/2+1||col==7-row+1&&row<=7/2)
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
	
	private void patern_M1() {
		for(int row=1;row<=5; row++)
		{
		for(int col=1;col<=5; col++)
		{
			if( col==1||col==5||row==col&&row<=5/2+1||col==5-row+1&& row<=5/2)
			{
				System.out.print("* ");
			}
			else
			{System.out.print("  ");
			
			}
		//	System.out.println();
		}
		System.out.println();
		}
	}
	
	
		private void paatern_R() {
			for(int row=1;row<=7; row++)
			{
			for(int col=1;col<=7; col++)
			{
				if(row==1||col==1||row==7/2+1||col==7&&row<=7/2 )
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


		private void paatern_Z() {
			for(int row=1;row<=7;row++)
			{
				for(int col=1;col<=7; col++)
				{
					if(row==1||row==7||col==7-row+1)
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

		private void paatern_W() {
			for(int row=1;row<=7;row++)
			{
				for(int col=1;col<=7; col++)
				{
					if(col==1||col==7||row==col&&col>=7/2+1||col==7-row+1&&row>7/2)
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

		private void paatern_V() {
			for(int row=1;row<=7;row++)
			{
				for(int col=1;col<=7; col++)
				{
					if(row==col&& row<7/2+1||col==7-row+1&&row<=7/2+1)
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

		private void paatern_P() {
				for(int row=1;row<=7;row++)
			{
				for(int col=1;col<=7; col++)
				{
					if(row==1||col==1||row==7/2+1||col==7&&row<=7/2)
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

		private void paatern_N()
		{
			for(int row=1;row<=7;row++)
			{
				for(int col=1;col<=7; col++)
				{
					if(col==1||col==7||row==col)
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
	
		private void patern_M() {
			for(int row=1;row<=7;row++)
			{
				for(int col=1;col<=7; col++)
				{
					if(col==1||col==7||row==col&&row<7/2+1||col==7-row+1&&row<=7/2+1)
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

		private void patern_J() {
			for(int row=1;row<=7;row++)
			{
				for(int col=1;col<=7; col++)
				{
					if(row==1||col==7/2+1||row==7&&col<=7/2)
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

		private void patern_Y() {
			for(int row=1;row<=7;row++)
			{
				for(int col=1;col<=7; col++)
				{
					if(row==col&&row<=7/2||col==7-row+1)
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

		private void patern_X() {
			for(int row=1;row<=7;row++)
			{
				for(int col=1;col<=7; col++)
				{
					if(row==col||col==7-row+1)
					{
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}System.out.println();
				
		
	}
		}

		private void patern_G() {
			for(int row=1;row<=7;row++)
			{
				for(int col=1;col<=7; col++)
				{
			if(row==1 || row==7 || row==7/2+1 && col>7/2|| col==1 ||col==7 && row>7/2)
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


	

		private void patren_S() {
			
			for(int row=1;row<=7;row++)
			{
				for(int col=1;col<=7; col++)
				{
			if(row==1 || row==7 || row==7/2+1 || col==1 && row<7/2+1||col==7 && row>7/2)
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

		private void patern_A() {
			for(int row=1;row<=7;row++)
			{
				for(int col=1; col<=7;col++)
				{
					if(col==1||col==7||row==1||row==7/2+1)
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
		
	

		private void patern_O() {
			for(int row=1;row<=7;row++)
			{
				for(int col=1; col<=7;col++)
				{
					if(row==1&&col<7-1||row==7-1||col==1&&row<7||col==7-1)
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
		
	

		private void patern_U() {
			for(int row=1;row<=7;row++)
			{
				for(int col=1; col<=7;col++)
				{
					if(col==1||col==7||row==7)
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
		
	

		private void pattren_t()
		{
			for(int row=1;row<=7;row++)
			{
				for(int col=1; col<=7;col++)
				{
					if(row==1||col==7/2+1)
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

	private void pattren_L() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1||row==7)
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

	private void pattren_I() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1||row==7||col==7/2+1)
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

	private void pattren_H() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1||col==7||row==7/2+1)
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

	private void pattren_F() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1||col==1||row==7/2+1)
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

	private void pattren_E() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1||row==7||col==1||row==7/2+1)
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

	private void pattren_D() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1||row==7||col==2||col==7)
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

	private void pattren_c() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1||row==7||col==1)
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

	private void pattren_B() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1; col<=7;col++)
			{
				if(row==1||row==7||col==1||col==7||row==7/2+1)
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
}


