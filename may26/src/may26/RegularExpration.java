package may26;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularExpration rg=new RegularExpration();
//		rg.regular1();
//		rg.regular2();
//		rg.regular3();
//		rg.regular4();
//		rg.regular5();
//		rg.regular6();
//		rg.regular7();
//		rg.regular8();
//		rg.expration1();
//		rg.expration2();
//		rg.expration3();
//		rg.expration4();
		rg.expration5();


	}

	private void expration5() {
		String mobile="9884012810";
//		Pattern patternObj= Pattern.compile("(0)?[0-9]{10}");
		
		Pattern patternObj= Pattern.compile("(0|91)?[0-9]{10}");
		Matcher matcherObj= patternObj.matcher(mobile);
		while(matcherObj.find())
		{
			System.out.print(matcherObj.group());
		}
	}

	private void expration4() {
		String password="Chennai is the capital of tamil nadu";
		Pattern patternObj= Pattern.compile("\\s");
		Matcher matcherObj= patternObj.matcher(password);
		int count=0;
		while(matcherObj.find())
		{
			count++;
			//System.out.print(matcherObj.group());
	}
		System.out.println(count);
	}

	private void expration3() {
		String password="Chennai :-600001";
	//	Pattern patternObj= Pattern.compile("\\d");
		//			print only number
//		Pattern patternObj= Pattern.compile("\\D");
//					only output Chennai:-
//		Pattern patternObj= Pattern.compile("\\S");
//					output non space Chennai:-600001
//		Pattern patternObj= Pattern.compile("\\w");
// 					remove specal char	output Chennai600001	
		Pattern patternObj= Pattern.compile("\\W");
//		only specal char output :-
		Matcher matcherObj= patternObj.matcher(password);
		while(matcherObj.find())
		{
			System.out.print(matcherObj.group());
	}	
	
	}

	private void expration2() {
		String password="Chennai:-600001";
		Pattern patternObj= Pattern.compile("[^a-zA-Z0-9]");
		//print only specal charecter
		Matcher matcherObj= patternObj.matcher(password);
		while(matcherObj.find())
		{
			System.out.print(matcherObj.group());
	}	
	}

	private void expration1() {
		String password="Chennai:-600001";
		Pattern patternObj= Pattern.compile("[a-zA-Z0-9]");//("[a-zA-Z0-9]")
		//Chennaiisthecapitaloftamilnadu space eduthudum
		Matcher matcherObj= patternObj.matcher(password);
		while(matcherObj.find())
		{
			System.out.print(matcherObj.group());
	}
	
	}

	private void regular8() {
		String password="Chennai is the capital of tamil nadu";
		Pattern patternObj= Pattern.compile("[a-zA-Z]");
		//Chennaiisthecapitaloftamilnadu space eduthudum
		Matcher matcherObj= patternObj.matcher(password);
		while(matcherObj.find())
		{
			System.out.print(matcherObj.group());
	}
	}

	private void regular7() {
		String input="Chennai is the capital of TamilNadu";
	//	Pattern patternObj= Pattern.compile("^Chennai");
		//fiest letter ha paakum
		Pattern patternObj= Pattern.compile("[^Chennai]");
		//chennaila iruka letter ethuvum prit aagathu mathathu print aagum
		
		Matcher matcherObj= patternObj.matcher( input);
		while(matcherObj.find())
		{
			System.out.print(matcherObj.group());
	}
	}
		

	private void regular6() {
		String input="Chennai is the capital of TamilNadu";
		Pattern patternObj= Pattern.compile("TamilNadu$");
		//$ symble meaning ending la tamilnadunu mela iruka statemet mudijirunth yes sollidum
		Matcher matcherObj= patternObj.matcher( input);
		while(matcherObj.find())
		{
			System.out.print(matcherObj.group());
//			System.out.println(matcherObj.start());
//			System.out.println(matcherObj.end());
		}	
	}

	private void regular5() {
		String input="My Mobile Number Is 9884010000";
//		Pattern patternObj= Pattern.compile("[A-Z][a-z");
		////first upper second letter small output MyMoNuIs
		Pattern patternObj= Pattern.compile("[A-Z]*");
		//upper case mattum print aagum output MMNI
		Matcher matcherObj= patternObj.matcher( input);
		while(matcherObj.find())
		{
			System.out.print(matcherObj.group());
//			System.out.println(matcherObj.start());
//			System.out.println(matcherObj.end());
		}

	}

	private void regular4() {
		String input="My mobile number is 9884010000";
		Pattern patternObj= Pattern.compile("[3-7]");//4 output
		Matcher matcherObj= patternObj.matcher( input);
		while(matcherObj.find())
		{
			System.out.print(matcherObj.group());
//			System.out.println(matcherObj.start());
//			System.out.println(matcherObj.end());
		}
	}

	private void regular3() {
		String input="My mobile number is 9884010000";
//		Pattern patternObj= Pattern.compile("[0123456789]");
		Pattern patternObj= Pattern.compile("[0-9]");
		Matcher matcherObj= patternObj.matcher( input);
		while(matcherObj.find())
		{
			System.out.print(matcherObj.group());
//			System.out.println(matcherObj.start());
//			System.out.println(matcherObj.end());
		}
	}	
	

	private void regular2() {
		String input="My mobile number is 9884010000";
		Pattern patternObj= Pattern.compile("[6-9][0-9]{9}");
		Matcher matcherObj= patternObj.matcher( input);
		while(matcherObj.find())
		{
			System.out.println(matcherObj.group());
			System.out.println(matcherObj.start());
			System.out.println(matcherObj.end());
		}
	}	
	

	private void regular1() {
		String input="My mobile number is 9884010000";
		Pattern patternObj= Pattern.compile("\\d{10}");
		Matcher matcherObj= patternObj.matcher( input);
		while(matcherObj.find())
		{
			System.out.println(matcherObj.group());
			System.out.println(matcherObj.start());
			System.out.println(matcherObj.end());
		}
	}

}
