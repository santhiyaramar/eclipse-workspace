package namakal;

public  class Harish_parents {
	
	int doorNo=100;
	private int age=20;
	private int amount=100000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harish_parents hp=new Harish_parents();
		System.out.println(hp.doorNo);
		hp.hobby();
		hp.personal_details();
		hp.give_invitation();
	    System.out.println(hp.age);
	    hp.chooseBride();

	}
	void hobby()
	{
		System.out.println("Going to ARRS Theatre");
	}
	private void personal_details()
	  {
	    System.out.println("Personal Details");
	  }
	protected void chooseBride()
	  {
	    System.out.println("Status Education ");
	  }
    protected void give_invitation()
{
			System.out.println("harish marrige");
}
	

}
