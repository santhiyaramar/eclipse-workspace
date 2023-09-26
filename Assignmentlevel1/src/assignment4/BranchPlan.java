package assignment4;

public abstract class BranchPlan extends HeadOffice {

	public static void main(String[] args) {
	
		Branch branch= new Branch();
		branch.checkAccounts(2000);
		branch.doInterview();
	int amount=	branch.payTax(1000);
		System.out.println(amount);
	
		}
		public void doInterview()
		{
			System.out.println("Welcome do interview");
		}
	}
		
		 class Branch extends BranchPlan{

			@Override
			public void reciveCustomers() {
				System.out.println("pay tax 2000");
				
			}
	

	}


