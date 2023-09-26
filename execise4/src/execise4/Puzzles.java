package execise4;

public class Puzzles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puzzles PuzzlesObj = new Puzzles();
	//PuzzlesObj.dplan();
	//	PuzzlesObj.fplan();
		PuzzlesObj.minister();
	}

	private void minister() 
	{
		// TODO Auto-generated method stub
		int day = 1;
		double amount = 1;
		double total = 0 ;
		while(day<=10)
		{
			System.out.println("In day"+ day + ": "+day);
			total = total + amount;
			amount = amount *2;
			day = day + 1;
		}
		System.out.println(" total value is"+total);
	}

	private void fplan() 
	{
		// TODO Auto-generated method stub
		int day = 1 ;
		int saving = 0;
		while(day<=10)
		{
			saving = saving + day;
			
			System.out.println("daily"+saving);
			day = day +1;
		}
		System.out.println("saving"+saving);
	}

	private void dplan()
	{
		// TODO Auto-generated method stub
		int day = 1;
		int packet_mony = 5;
		int saving = 0;
		while(day<=10)
		{
			saving = saving + packet_mony;
			System.out.println("daily"+saving);
			day = day + 1;
		}
		System.out.println("savings is"+saving);
	}

}
