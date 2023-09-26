package consstructor;

public class AadharDetails1 {
	String name;
	int age;
	String address;

	public AadharDetails1(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}

	public static void main(String[] args) {
		AadharDetails1 person= new AadharDetails1("santhiya",23,"melur");
		person.aadhar();
		AadharDetails1 person1= new AadharDetails1("sakthi",29,"kallai");
		person1.aadhar();
		AadharDetails1 person2= new AadharDetails1("subu",22,"salem");
		person2.aadhar();
		AadharDetails1 person4= new AadharDetails1("ram",24,"chennai");
		person4.aadhar();
	}

	private void aadhar() {
	System.out.println(name);
	System.out.println(age);
	System.out.println(address);
	}

}
