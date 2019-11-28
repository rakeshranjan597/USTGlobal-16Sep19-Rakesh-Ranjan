public class TestConstructor {
	
	int TestConstructor() {
		System.out.println("TestC constructor");
		return 5;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		TestConstructor t = new TestConstructor();
		t.TestConstructor();
		System.out.println("Main ended");
	}
}
