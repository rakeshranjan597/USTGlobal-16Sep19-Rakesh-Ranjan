
public class Overloading 
{
	public static void add(int a, int b)
	{
		System.out.println("add(int a,int b) method");
	}
	public static void add(int a, byte b)
	{
		System.out.println("add(int a,byte b) method");
	}
	
	public int multiply(int a,int b)
	{
		System.out.println("multiply(int a,int b) method");
		return a+b;
	}
	public int multiply(byte a,int b)
	{
		System.out.println("multiply(byte a,int b) method");
		return a+b;
	}
	public static void main(String[] args) 
	{
		System.out.println("main(string[] args) method");
		main(10);
		add(10,20);
		add(12,34);
		add(98,56);
		
		Overloading o=new Overloading();
		o.multiply(12, 34);
		o.multiply(12, 12);
	}
	
	public static void main(int a) 
	{
		System.out.println("main(int a) method");
	}

}
