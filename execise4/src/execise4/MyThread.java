package execise4;

public class MyThread extends Thread {

		public void run()
		  {
			  
		try {
		//	Thread.yield();
			      Thread.sleep(5000);
			      for(int no=1; no<=5; no++)
			      {
			        System.out.println(no + " MyThread"); 
			      }
			    } catch (InterruptedException e) {
			      // TODO Auto-generated catch block
//			      e.printStackTrace();
			    	System.out.println("Got Interrupted");
			    }
		  
		  }
	}


