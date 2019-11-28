
public class SubClass extends SuperClass{
	String s = "SubClass Var";
	SubClass() {
		super();
		System.out.println("Sub class constructor");
	}
	
	void getSData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		super.superClassMethod();
		superClassMethod();
	}
}
