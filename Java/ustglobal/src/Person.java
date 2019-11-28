
public class Person {
	String name;
	int age;
	
	Person(String pname, int page) {
		name = pname;
		age = page;
	}
	
	static void add(int a) {
		System.out.println("dkgf");
	}
	public static void main(String[] args) {
		Person p = new Person("divya", 20);
		p.add(8);
//		Person p2 = new Person();
	}
}
