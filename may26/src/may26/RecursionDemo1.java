package may26;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecursionDemo1 {

	public static void main(String[] args) {
		 RecursionDemo1 rd =new  RecursionDemo1();
//		rd.A1();
		rd.A2();
	    }
	

	private void A2() {
		String password = "Chennai:-600001";
	    Pattern patternObj = Pattern.compile("[a-zA-Z0-9]");
	    Matcher matcherObj = patternObj.matcher(password);
	      while(matcherObj.find())
	      {
	        System.out.print(matcherObj.group());
	      }
	}


	private void A1() {
		// TODO Auto-generated method stub
		String input = "My mobile number is 9884010000";
//		Pattern patternObj = Pattern.compile("[a_z]");
		Pattern patternObj = Pattern.compile("TamilNadu");
//	    Pattern patternObj = Pattern.compile("\\d{10}");
	    Matcher matcherObj = patternObj.matcher(input);
	    while(matcherObj.find())
	    {
	      System.out.println(matcherObj.group());
//	      System.out.println(matcherObj.start());
//	      System.out.println(matcherObj.end());

		
	}
	}
}
	
