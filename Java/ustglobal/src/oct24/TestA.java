package oct24;

public class TestA {
	static int a;
	int b;
	static {
		a = 10;
		final int d = 25;
		System.out.println("Staic Block 1 "+ d);
	}
	
	TestA() {
		System.out.println("TestA() constructor");
	}
	
	public static void main(String[] args) {
		TestA t1 = new TestA();
		TestA t2 = new TestA();
		System.out.println("Value of a: " + a);
	}
	
	static {
		a = 20;
		System.out.println("Staic Block 2");
	}
}
