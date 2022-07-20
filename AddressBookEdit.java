package com.addressbooksystem;
import java.util.Scanner;

public class AddressBookEdit extends AddressBookAdd {

	static Scanner s = new Scanner(System.in);
	public void edit() {
		int i, value;
		System.out.println("\n enter the first name to edit :-");
		String name = s.next();
		for (i = 0; i < contactBook.size(); i++) {
			if (contactBook.get(i).getFirstName().equals(name)) {
				do {
					System.out.println("\n Slect option to edit----" +
							"\n1. First_name" +
							"\n2.Last_name" +
							"\n3.Address" +
							"\n4.City" +
							"\n5.State" +
							"\n6.Zip_code" +
							"\n7.Phone_number" +
							"\n8.Email :");
					int choice = s.nextInt();
					switch(choice){
					case 1: 
						System.out.println("enter new first name :-");
						contactBook.get(i).setFirstName(s.next());
						System.out.println("First name is updated");
						break;

					case 2:
						System.out.println("enter new last name :-");
						contactBook.get(i).setLastName(s.next());
						System.out.println("Last name is updated :-");
						break;

					case 3:
						System.out.println("enter new address :-");
						contactBook.get(i).setAddress(s.next());
						System.out.println("Address is updated");
						break;

					case 4:
						System.out.println("Enter new City :-");
						contactBook.get(i).setCity(s.next());
						System.out.println("City is updated");

					case 5:
						System.out.println("Enter new State :-");
						contactBook.get(i).setState(s.next());
						System.out.println("State is updated");
						break;

					case 6:
						System.out.println("Enter new Zip code :-");
						contactBook.get(i).setZip(s.nextInt());
						System.out.println("Zip code is updated");
						break;

					case 7:
						System.out.println("Enter new Phone Number :-");
						contactBook.get(i).setPhoneNo(s.nextLong());
						System.out.println("Phone Number is updated");
						break;

					case 8:
						System.out.println("Enter new Email Id :-");
						contactBook.get(i).setFirstName(s.next());
						System.out.println("Email Id is updated");
					}

					System.out.println("Enter 1 if you want to continue");
					value = s.nextInt();
				}
				while (value == 1) ;
			}
			else 
				System.out.println("Please enter the correct first name");
		}
	}
	public static void main(String[] args) {
		AddressBookEdit obj = new AddressBookEdit();
		obj.read();
		obj.display();
		obj.edit();
		obj.display();


	}



}
