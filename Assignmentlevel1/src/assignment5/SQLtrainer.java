package assignment5;

public class SQLtrainer extends Trainer{

	public SQLtrainer(String dep, String institute) {
		super(dep, institute);
		
	}

	public SQLtrainer() {
		// TODO Auto-generated constructor stub
		super();
	}

	public static void main(String[] args) {
		SQLtrainer ram= new SQLtrainer();
		ram.dept="java";
		ram.institute="payilagam";
		ram.training();
		System.out.println(ram.dept);
		System.out.println(ram.institute);
		System.out.println(ram.getSalary());
	}

	
	}


