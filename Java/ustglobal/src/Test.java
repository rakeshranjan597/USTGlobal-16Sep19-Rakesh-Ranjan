public class Test 
{
	public static void main(String[] args) 
	{
		Pen p =new Pen();
		
		p.cost = 100;
		p.color = "Blue";
		p.brand = "cello";
		
		System.out.println("Cost is "+p.cost);
		System.out.println("Color is "+p.color);
		System.out.println("Brand is "+p.brand);
		
		p.write();
		
		System.out.println("*************************");
		
		Van v =new Van();
		v.color = "Black";
		v.price = 500000;
		
		System.out.println("Color of van is "+v.color);
		System.out.println("Price of van is "+v.price);
		
		v.move();
		
		Van v1 = new Van();
		v1.color = "White";
		v1.price = 200000;
		
		System.out.println("Color of v1 van is "+v1.color);
		System.out.println("Price of v1 van is "+v1.price);
		
		v1.move();
		
		System.out.println("*************************");
		
		Cow c=new Cow();
		c.name = "Nandi";
		c.color = "white";
		
		System.out.println("Cow name is "+c.name);
		System.out.println("Cow color is "+c.color);
		
		c.eat();
		c.sleep();
	}
}
