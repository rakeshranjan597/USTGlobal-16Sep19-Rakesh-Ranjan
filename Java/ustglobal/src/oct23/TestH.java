package oct23;

public class TestH {
	public static void  main(String[]args) {
		BMW bmw = new BMW();
		bmw.gear();
		bmw.gps();
		bmw.abs();
		System.out.println("~~~~~~~~~~~~~");
		Toyota t = new Toyota();
		t.gear();
		t.gps();
		t.abs();
		System.out.println("~~~~~~~~~~~~~");
	}
}
