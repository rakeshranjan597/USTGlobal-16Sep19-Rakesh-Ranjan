
public class Student2 {
//	String fname;
//	String lname;
//	int age;
//	String gender;
//	long mob;
	
	Student2(String fname, String lname,int age, String gender, long mob) {
		System.out.println("Details of Students ");
		System.out.println("The Student name is "+fname+" "+lname+ " and his age,gender,mob is "+age+" "+gender+" "+mob);
		
	}
	
	public static void main(String[] args) {
		Student2 s1 = new Student2("rakesh", "ranjan", 21, "M", 7488320112l);
		Student2 s2 = new Student2("ashu", "kumar", 22, "M", 7488320114l);
		Student2 s3 = new Student2("vikash", "kumar", 23, "M", 7478320112l);
		Student2 s4 = new Student2("manu", "singh", 22, "M", 7488320112l);
		Student2 s5 = new Student2("arijit", "kumar", 22, "M", 7488330112l);
		Student2 s6 = new Student2("akash", "kumar", 22, "M", 7488620112l);
		Student2 s7 = new Student2("ajit", "kumar", 22, "M", 7488920112l);
		Student2 s8 = new Student2("aman", "kumar", 23, "M", 7488420112l);
		Student2 s9 = new Student2("ravi", "ranjan", 23, "M", 7488620112l);
		Student2 s10 = new Student2("ritesh", "ranjan", 22, "M", 7481320112l);
	}
}
