package Arrays1_10;

public class A1 {

	public static void main(String[] args) {
		A1 a=new A1();
//		a. Printing_Array();
//		a. Printing_reverse_order();
		a. Linear_Search();
	}

	private void Linear_Search() {
		int ar[]= {10,20,30,40,50};
		for (int i= 0; i < ar.length; i++) {
			if (ar[i]==30) {
				System.out.println("no is present"+ar[i]);

			}
			else if (i<ar.length+1) {
				System.out.println("no is not present");
				
			}
	}
	}

	private void Printing_reverse_order() {
		int ar[]= { 10,20,30,40,50};
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
	}
	}
		

	private void Printing_Array() {
		int ar[]= {10,20,30,40,50};
		for (int i= 0; i < ar.length; i++) {
			System.out.println(ar[i]);
			
		}
	}

}
