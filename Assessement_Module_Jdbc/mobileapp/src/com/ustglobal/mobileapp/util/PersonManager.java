package com.ustglobal.mobileapp.util;

import com.ustglobal.mobileapp.dao.MobileAppDAO;
import com.ustglobal.mobileapp.dao.MobileAppDAO_JDBC;

public class PersonManager {
	
	private PersonManager() {  }
	
	public static MobileAppDAO getPersonManager() {
		
		return new MobileAppDAO_JDBC();
	}
}
