package execise7;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Math.abs(-256));
		MathExample meobj = new MathExample();
		//meobj.find_abs(1);
		
		//ceil and floor
		System.out.println(Math.ceil(29.01));
		System.out.println(Math.floor(29.01));
		
	}

	private void find_abs(int i) {
		// TODO Auto-generated method stub
		if(i>=0)
			System.out.println(i);
		else
		{
			i=i*-1;
			System.out.println(i);
		}
		
	}

}
