package com.ust_global.objectclass;

public class USBport {

	public static void connect(Object obj)
	{
		if(obj instanceof PenDrive)
		{
			PenDrive p = (PenDrive)obj; 
			p.read();
			p.write();
			System.out.println("Pen Drive Connected");
		}else {
			Mouse m =(Mouse)obj;
			m.click();
			m.scroll();
			System.out.println("Mouse Connected");
		}
	}
}
