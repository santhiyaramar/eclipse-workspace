package execise6;

public class StringDemo1 {
	String s2="";

	public static void main(String[] args) {
		StringDemo1 sd= new StringDemo1();
	//	sd.First();
	//	sd.check_starting("kalaiarasan","kalai");
	//	sd.check_end("balaji", "ji");
	//	sd.given_space("MonTuesWednesThursFri");
	//	sd.given_space2("Harish Thangavel");
	//	sd.first_Upper();
	//	sd.strip_trailing();
	//	sd.strip_leading();
		sd.reverse_whole_input();
	}

	private void reverse_whole_input() {
		String name = "Santhiya Ramar";
	    
	    String s1 = ""; 
	    
	//    System.out.println("s1 --> " + s1);
	    for(int i=name.length()-1;i>=0;i--)
	    {
	      if(name.charAt(i)!= ' ') {
	        name = name + s1.charAt(i); //YNNAD
	      }
	      else
	      {
	        reverse(s1);//reverse("YNNAD");
	        s1 = ""; 
	        continue; 
	      }
	    }
	    reverse(s1);
//	   System.out.println("s2 --> " + s2);
	    
	  }

	  private void reverse(String s2) { //YNNAD
		//  String s3="";
		  for(int i=s2.length()-1; i>=0; i--)
		    {
		      s2 = s2 +s2.charAt(i);//BENI DANNY
		    }
	    s2 = s2+" ";
		    System.out.println("s3 --> "+ s2);
	//	    
		  }
		
	


	private void strip_leading() {
		String name="   h ello";
		String s1="";
		boolean result=false;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=' ')
			{
				s1=s1+name.charAt(i);
				result=true;
			}
			else if (result==true)
			{
				s1=s1+name.charAt(i);
			}
		}
		System.out.println(name);
		System.out.println(s1);
		
		
	}

	private void strip_trailing() {
		String name= "hel lo  ";
		String output="";
		boolean result=false;
		for(int i=name.length()-1;i>=0;i--)
		{
			if(name.charAt(i)!=' ')
			{
				output=output+name.charAt(i);
				result=true;
			}
			else if (result==true)
			{
				output=output+name.charAt(i);
			}
		}
		System.out.println(name);
		System.out.println(output);
		String s2="";
		for(int i=output.length()-1;i>=0;i--)
		{
			s2=s2+output.charAt(i);
		}
		System.out.println(s2);
	}

	private void first_Upper() {
		String s="harish thangavel";
		for(int i=0; i<s.length();i++)
		{
			if(i==0)
			System.out.print(s.toUpperCase().toString().charAt(i));
			   else if(s.charAt(i)==' ')
				      
			        System.out.print(" "+s.toUpperCase().toString().charAt(++i));
		}
	}

	private void given_space2(String s1 ) {
		   for(int i=0 ; i<s1.length();i++)
		   {
			      if(i==0) 
			        System.out.print(s1.toUpperCase().toString().charAt(i));
			      
			      else if(s1.charAt(i)==' ')
			      
			        System.out.print(" "+s1.toUpperCase().toString().charAt(++i));
			      else
			        System.out.print(s1.charAt(i));
			    }
			  }
	
	

	private void given_space(String s1) {
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
		//		System.out.print();
				{
				if(i!=0)
				
					System.out.print("day "+s1.charAt(i));
				
				else
				
					System.out.print(s1.charAt(i));
				
				}
			else
			{
				System.out.print(s1.charAt(i));
			}

		}
		System.out.print("day");
	}

	private void check_end(String s1,String s2) {
	//	int count=0;
		int len1=s1.length();
		int len2=s2.length();
		int count=0;
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(len2-i-1)==s1.charAt(len1-i-1))
		{
			count++;
			continue;
		}
		else
		{
			System.out.println("not ends with");
			break;
		}
		
	}
		System.out.println(count);
		
		if(count==s2.length())
		{
			System.out.println("yes ends with");
		}
		
	}

	private void check_starting(String s1, String s2) {
		int count=0;
	//	int len1=s1.length();
	//	int len2=s2.length();
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)==s1.charAt(i))
			{
			count++;
			continue;
		}
		else
		{
			System.out.println("no not start with");
			
		}
	}
	if(count==s2.length())
	{
		System.out.println("yes start with");
		
	}
	}

	private void First() {
		String name="balaji";
		System.out.println(name);//name balaji print name.length() 6
		
		char ch=name.charAt(0);
		System.out.println(ch);
		 ch=name.charAt(1);
		System.out.println(ch);
		 ch=name.charAt(2);
			System.out.println(ch);
			ch=name.charAt(3);
			System.out.println(ch);
			ch=name.charAt(4);
			System.out.println(ch);
			ch=name.charAt(5);
			System.out.println(ch);
			
			
			System.out.println(name.contains("ki"));//true or false
			
			System.out.println(name.endsWith("ji"));
			
			System.out.println(name.startsWith("bala"));
		
		
	}

}
