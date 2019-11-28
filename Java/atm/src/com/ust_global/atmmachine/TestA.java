package com.ust_global.atmmachine;

public class TestA {
	public static void main(String[] args) {
		Machine m = new Machine();
		ATM a=new HDFC();
		
		m.slot(a);
	    ICICI i = new ICICI();
	    m.slot(i);
	    
	    ATM s=new SBI();
	    m.slot(s);
	}

}
