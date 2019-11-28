package com.ustglobal.mobileapp.dao;

import java.util.List;

import com.ustglobal.mobileapp.dto.Person;

public interface MobileAppDAO {
	
	List<Person> showAllContact();
	
	int addContact(Person p);
	
	int deleteContact(String name);
	
	int editContact(Person p);
	
	Person searchContact(String name);
	
}
