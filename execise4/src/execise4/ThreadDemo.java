package execise4;

public class ThreadDemo {

	public static void main(String[] args) {
	    MyThread mt1 = new MyThread(); 
	    System.out.println(1+ " " + mt1.getState());
	    mt1.start();
	    System.out.println(mt1.getId());
	    System.out.println(mt1.getName());
	    System.out.println(mt1.getPriority());
	    System.out.println(2+ " " + mt1.getState());
//	    mt1.join();
//	    mt1.start();
	    mt1.interrupt();
	//    mt1.setPriority(100);
//	    Thread.yield();
	    
//	    try {
//			mt1.join();
//		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    
	    ThreadDemo td = new ThreadDemo();
	    for(int no=1; no<=5; no++)
	    {
	      System.out.println(no + " ThreadDemo");
	    }
	    System.out.println(3+ " " + mt1.getState());
	    

	  }
	}


