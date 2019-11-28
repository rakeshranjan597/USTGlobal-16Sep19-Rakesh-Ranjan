package com.ustglobal.mobileapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.mobileapp.dao.MobileAppDAO;
import com.ustglobal.mobileapp.dto.Person;
import com.ustglobal.mobileapp.util.PersonManager;

public class MobileApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Press 1 to Show All Contacts: ");
			System.out.println("Press 2 to Search for Contact (using name): ");
			System.out.println("Press 3 to Operate on contact: ");

			int n = sc.nextInt();

			switch(n) {

			case 1:
				MobileAppDAO mdao1 = PersonManager.getPersonManager();
				List<Person> per1 = mdao1.showAllContact();
				if(per1 == null) {
					System.out.println("~~~~ No Contacts ~~~~ ");
				} else {
					System.out.println("~~~~ Details of Contacts List ~~~~");
					for(Person p: per1) {
						System.out.println("Name is: "+ p.getName());
					}
				}
				break;

			case 2:
				sc.nextLine();
				System.out.println("Enter the name to search :");
				String searchName = sc.nextLine();
				MobileAppDAO mdao2 = PersonManager.getPersonManager();

				Person p2 = mdao2.searchContact(searchName);
				if(p2 == null) {
					System.out.println("~~~~ Deatils Not Available ~~~~ ");
				} else {
					System.out.println("Name is: "+ p2.getName());
					System.out.println("Phone Number is: "+ p2.getPnumber());
					System.out.println("Group is: "+ p2.getGroups());

					System.out.println("\n~~~~ Some Operations ~~~~");
					do {
						System.out.println("Press 1 to Call: ");
						System.out.println("Press 2 to Message: ");

						int newselect = sc.nextInt();
						switch(newselect) {
						case 1:
							System.out.println("Calling to Contact.....");							
							System.out.println("	....");							
							System.out.println("	....");							
							System.out.println("	....");							
							System.out.println("	....");							
							System.out.println("End Call.....");							
							break;

						case 2:
							System.out.println("Message of user and sending......");
							break;

						default:
							System.out.println("~~~~ Wrong Input ~~~~");
						}
						
						System.out.println("Enter y for continue.... Else other key to Go in the Main Menu ");
						ch=sc.next().charAt(0);
						
					}while(ch=='y');

				}
				break;

			case 3:
				do {
					
					System.out.println("Press 1 to add Contact");
					System.out.println("Press 2 to delete Contact");
					System.out.println("Press 3 to edit Contact");
					int select = sc.nextInt();

					switch( select) {
					case 1:
						sc.nextLine();
						System.out.println("Enter the name: ");
						String name1 = sc.nextLine();
						System.out.println("Enter the mobile no: ");
						long  mob1 = sc.nextLong();
						sc.nextLine();
						System.out.println("Enter the group name: ");
						String group1 = sc.nextLine();

						Person p1 = new Person();
						p1.setName(name1);
						p1.setPnumber(mob1);
						p1.setGroups(group1);

						MobileAppDAO mdao31 = PersonManager.getPersonManager();
						int addCont = mdao31.addContact(p1);
						if (addCont != 0) {
							System.out.println("~~~ Details Added Successfully ~~~~");
						} else {
							System.out.println("~~~~ Failed to Add ~~~~");
						}

						break;
					case 2:

						sc.nextLine();
						System.out.print("Enter the name to delete the contact: ");
						String name2 = sc.nextLine();
						MobileAppDAO mdao32 = PersonManager.getPersonManager();
						int deleteCont = mdao32.deleteContact(name2);

						if (deleteCont != 0) {
							System.out.println("~~~ Details Deleted Successfully ~~~~");

						} else {
							System.out.println("~~~~ Failed to Delete ~~~~");
						}
						break;

					case 3:

						sc.nextLine();
						System.out.print("Press the name to edit the Details: ");
						String editName = sc.nextLine();

						//						sc.nextLine();
						//						System.out.println("Enter the name: ");
						//						String name3 = sc.nextLine();
						System.out.println("Enter the new mobile no: ");
						long  mob3= sc.nextLong();
						sc.nextLine();
						System.out.println("Enter the new group name: ");
						String group3 = sc.nextLine();

						Person p3 = new Person();
						p3.setName(editName);

						p3.setPnumber(mob3);
						p3.setGroups(group3);

						MobileAppDAO mdao33 = PersonManager.getPersonManager();
						int editCont = mdao33.editContact(p3);
						if (editCont != 0) {
							System.out.println("~~~ Details Updated Successfully ~~~~");
						} else {
							System.out.println("~~~~ Failed to Update ~~~~");
						}
						break;

					default:
						System.out.println("~~~~ Wrong Input ~~~~");
					}
					System.out.println("Enter y for continue.... Else other key to Go to the Main Menu...");
					ch=sc.next().charAt(0);
					
				}while(ch=='y');

			default:
				System.out.println("~~~~ Wrong Input ~~~~");
			}
			System.out.println("Enter y for continue.... Else other key to Terminate the Program...");
			ch=sc.next().charAt(0);

		}while(ch=='y');
	}
}
