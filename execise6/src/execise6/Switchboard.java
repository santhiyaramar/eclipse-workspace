package execise6;

public class Switchboard extends Wire {
	public static void main (String args[])
	{
		Switchboard sw=new Switchboard(); {
			sw.passing();
			sw.power();
			sw.current();
			sw.motor();
		}
	}
		
			private void motor() {
		// TODO Auto-generated method stub
		
	}

			@Override
			public void current() {
			System.out.println("current passing");
				
			}
			public void power()
			{
				System.out.println("switchboardpower");
			}
		
	}

	


