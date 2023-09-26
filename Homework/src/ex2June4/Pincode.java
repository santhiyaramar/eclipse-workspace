package ex2June4;

public class Pincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int pin=644202;
		//pincode_check(pin);
		long no=9654150391l;
		//System.out.println(no/100000000);
		
		int i =(int)( no/100000000);
		//System.out.println(i);
		no_check(i);
		
	}

	private static void no_check(int i) {
		// TODO Auto-generated method stub
		//System.out.println(i);
		switch(i)
		{
		case 63:
			System.out.println("jio");
			break;
		case 94:
			System.out.println("bsnl");
			break;
		case 96:
			System.out.println("airsel");
			break;
		default:
			System.out.println("no network");
			
			
		}
	}

	private static void pincode_check(int pin) {
		int id = pin/1000;
		System.out.println(id);
		if(id==606)
			System.out.println("kallakurichi");
		else if(id==625)
			System.out.println("madurai");
		else if(id==637)
			System.out.println(" namakal");
		else if(id==600)
			System.out.println(" chennai");
		else if(id==627)
			System.out.println("thirunelveli");
		else if(id==623)
			System.out.println("ramnad");
		else
			System.out.println("invalid pin code");
	}
	

}
