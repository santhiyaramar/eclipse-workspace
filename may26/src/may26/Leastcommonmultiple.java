package may26;

public class Leastcommonmultiple {

	public static void main(String[] args) {
		Leastcommonmultiple lcm=new Leastcommonmultiple();
		lcm.least();
	}

	private void least() {
		int no1=5;
		int no2=3;
		int big=no1>no2?no1:no2;
		while(true)
		{
			if(big%no1==0 && big%no2==0)
			{
				System.out.println(big);
				break;
			}
			big++;
		}
	}

}
