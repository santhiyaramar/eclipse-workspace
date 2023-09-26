package assignment0;

public class Theatre {

	public static void main(String[] args) {
		Theatre raja= new Theatre();
		raja.bookTiket(200);
	//	System.out.println(raja.bookTiket(200));
	//	int balence=raja.bookTiket(200);
	//	System.out.println("after booking tiket" +balence);
	}

	private void bookTiket(int tiket) {
		int tiket_price=120;
		int balence=tiket-120;
		System.out.println(balence);

		
	//	return balence;
		
	}

}
