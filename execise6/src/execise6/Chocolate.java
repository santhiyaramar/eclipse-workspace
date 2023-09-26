package execise6;

import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Chocolate  ch = new Chocolate();
	        Scanner scr = new Scanner(System.in);
	        int n=scr.nextInt();
	        System.out.println("the number of chocolates are "+ch.shopOffer(n));
	        scr.close();
	    }
	 
	    private int shopOffer(int boy) {
	        int wrapper=0,chocolate=0;
	         
	        while(boy!=0)
	        {
	            wrapper+=boy%3; 
	            chocolate+=boy;
	 
	            if(wrapper>=3){   
	                chocolate++;
	               wrapper=(wrapper%3)+1;   
	            }
	 
	            boy/=3;
	        //  System.out.println("chocolate "+chocolate+" rappers "+wrapper);
	        }
	        return chocolate;
	    
		}

}
