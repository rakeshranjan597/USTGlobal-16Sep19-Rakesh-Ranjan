package oct24;

public class TestB {
	static int b;
	int a;
	{
		int c = 5;
		a = 10;
		b = 20;
		System.out.println("Non static block 1 " + c);
	}
	public static void main(String[] args) {
		System.out.println("Main Started");
		TestB t1 = new TestB();
		TestB t2 = new TestB();
		System.out.println("Main Ended");
	}
	{
		System.out.println("Non static block 2");
	}
}
