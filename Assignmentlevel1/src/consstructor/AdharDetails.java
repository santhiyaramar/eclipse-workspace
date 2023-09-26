package consstructor;

public class AdharDetails {
	String name;
	int age;
	String address;

	public AdharDetails(String name,int age, String address) {
		this.name=name;		
		this.age=age;
		this.address=address;
	}

	public static void main(String[] args) {
		AdharDetails person= new AdharDetails("ram",23,"chennai");
		person.details();
	}

	private void details() {
	System.out.println(name);
	System.out.println(age);
	System.out.println(address);
		
	}

}
