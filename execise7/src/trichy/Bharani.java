package trichy;

public class Bharani implements Govt, FranceGovernment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bharani bb = new Bharani(); 
		bb.follow_traffic_rules();
		System.out.println(Bharani.no_helmet_fine);
		bb.play();
		//dynomic  binding
		Govt trafficPolice = new Bharani(); 
		trafficPolice.follow_traffic_rules();
		
		Central_Govt crpf = new Bharani();
		crpf.go_by_flight();
	}
	public void play()
	{
		System.out.println("Playing Badminton");
	}

	@Override
	public void follow_traffic_rules() {
		// TODO Auto-generated method stub
		System.out.println("Two wheeler rooles");
		
	}
	@Override
	public void go_by_flight() {
		// TODO Auto-generated method stub
		
	}

}
