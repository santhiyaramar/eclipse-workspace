package execise5;

public class Homework{
	public static void main(String[] args) {
		Homework plan = new Homework();
		// plan.ex1();
		 //plan.ex2();
		//plan.ex3();
		//plan.ex4();
		//plan.ex5();
		//plan.ex6();
		//plan.ex7();
		plan.ex8();
		
		
	}
		
	private void ex8() {
		// TODO Auto-generated method stub
		int number = 18;
		while(number>3)
		{
			number -= 3;
			System.out.println(number);
		}
	}

	private void ex7() {
		// TODO Auto-generated method stub
		int number =12;
		while(number>2)
		{
			number -= 2;
			System.out.println(number);
		}
	}

	private void ex6() {
		// TODO Auto-generated method stub
		int number = 6;
		while(number>1)
		{
			number -= 1;
			System.out.println(number);
		}
	}

	private void ex5() {
		// TODO Auto-generated method stub
		int i =10;
		while(i>=1)
		{
			//1x3=3;
			System.out.println(i+ " x 3 = "+(3*i) );
			i-=1;
		}
	}

	private void ex4() {
		// TODO Auto-generated method stub
		int number =  1;
		while(number<=9)
		{
			System.out.println(number);
			number = number+2;
		}
	}

	private void ex3() {
		// TODO Auto-generated method stub
		int number = 0;
		while(number<15)
		{
			number = number+3;
			System.out.println(number);
		}
	}

	private void ex2() {
		// TODO Auto-generated method stub
		int number = 0;
		while(number<10)
		{
			number = number+2;
			System.out.println(number);
		}
	}

	private void ex1() {
		// TODO Auto-generated method stub
		int number = 0 ;
		 while(number<5)
		 {
			 number =number+1;
			System.out.println(number +" ");	
		 }
	}
	}
	

