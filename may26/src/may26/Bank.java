package may26;

public class Bank {

	public static void main(String[] args) {
		   Bank customer = new Bank(); 
		    customer.deposit(-100);
		    
		  }

		  private void deposit(int amt) {
		    // TODO Auto-generated method stub
		    if(amt>0)
		    {
		      System.out.println("Go Ahead");
		    }
		    else
		    {
		  //    AmountException ame = new AmountException(); 
		    	throw new AmountException();//anonyms obj
		  //    throw ame; 
		    }
		    
		  }
	}


