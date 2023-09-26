package execise6;

public class Minister extends Government {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Government officials = new Minister();
		  officials.raid();
		  officials.collect_documents();
		  officials.pay_salary();
	}

	@Override
	public void raid() {
		// TODO Auto-generated method stub
		System.out.println("Cooperate Raid");
		
	}

	@Override
	public void collect_documents() {
		// TODO Auto-generated method stub
		System.out.println("Give necessary documents");
		
	}
	public void announce_schemes()
	{
		System.out.println("Announce Schemes");
	}
	public void loot()
	  {
	    System.out.println("Looting from schemes");
	  }
}
