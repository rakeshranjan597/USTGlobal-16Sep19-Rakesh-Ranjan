class T{
	void fun() {
		System.out.println("A");
	}
}
class B extends T{
	void fun() {
//		super.fun();
		System.out.println("B");
	}
}
class TestH{
	public static void main(String[] args) {
		T b = new B();
		b.fun();
	}
}