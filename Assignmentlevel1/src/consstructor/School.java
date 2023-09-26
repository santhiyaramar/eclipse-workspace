package consstructor;

public class School {
	String name;
	int rollNo;

	public School(String name, int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
		
	}

	public School(String fname, String lname,int rollNo) {
		System.out.println("HI");
	
		this.name=fname+lname;
		this.rollNo=rollNo;
	}
	public School()
	{
		System.out.println("latest");
	}

	public static void main(String[] args) {
		School student1=new School("santhiya",100);
		School student2=new School("ram",101);
		School student3=new School("subu",102);
		School student4=new School("kabhil","dev",103);
		School student5=new School();
		School student6=new School();
		
		student1.participate();
		student2.write_exam();
		student4.participate();
		student4.write_exam();
		
		
	}
	 private void write_exam() {
		// TODO Auto-generated method stub
		 System.out.println(rollNo);
	}

	private void participate()
	{
		System.out.println(name);
	//	System.out.println(rollNo);
	}
}
