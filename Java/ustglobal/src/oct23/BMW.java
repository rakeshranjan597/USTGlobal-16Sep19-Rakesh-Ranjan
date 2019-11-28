package oct23;

public class BMW implements AutoMobile, AutoMobileWithAbs{
	public int gear(){
		System.out.println("Gear of BMW");
		return 5;
	}
	public void gps() {
		System.out.println("Gps of BMW");
	}
	public void abs() {
		System.out.println("abs of BMW");
	}
	
}
