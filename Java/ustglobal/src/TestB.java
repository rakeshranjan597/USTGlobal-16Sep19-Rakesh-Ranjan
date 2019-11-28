
public class TestB {

	public static void main(String[] args) {
		Student s=new Student();
		s.name="Priya";
		s.usn=101;
		Student.cname="Qspider";
		System.out.println("College name is "+Student.cname);
		System.out.println("Name is "+s.name);
		System.out.println("ID is "+s.usn);
	}

}
