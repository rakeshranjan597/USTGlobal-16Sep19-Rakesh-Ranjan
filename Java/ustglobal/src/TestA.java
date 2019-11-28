
public class TestA {
	public static void main(String[] args) {
		BTM b =new BTM();
		b.swipe();
		int count=b.getCount();
		System.out.println("count is "+count);
		int totalcount=b.getTotalCount();
		System.out.println("Total count is "+totalcount);
	}
}
