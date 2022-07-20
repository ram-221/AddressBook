package com.addressbooksystem;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookAdd {

	private String first;
	private String last;
	private String add;
	private String city;
	private String state;
	private int zip;
	private long phoneNo;
	private String email;
	static ArrayList<AddressBookCreate> contactBook = new ArrayList<>();
	public void read() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first name :");
		first = s.next();
		System.out.println("enter the last name :");
		last = s.next();
		System.out.println("enter the address :");
		add = s.next();
		System.out.println("enter the city :");
		city = s.next();
		System.out.println("enter the state :");
		state = s.next();
		System.out.println("enter the zip code :");
		zip = s.nextInt();
		System.out.println("enter the phone number :");
		phoneNo = s.nextLong();
		System.out.println("enter the email id :");
		email = s.next();

		AddressBookCreate contact = new AddressBookCreate(first, last, add,
				city, state, zip, phoneNo, email);
		contactBook.add(contact);
		System.out.println("Contact Added Successfully");
	}

		public void display() {
			int i;
			System.out.println ("\n Contacts Present in Address book");

			for ( i=0; i < contactBook.size(); i++) {
				System.out.println(contactBook.get(i));
			}
		}
		public static void main(String[] args) {
			AddressBookAdd book1 = new AddressBookAdd();
			book1.read();
			book1.display();
		}
	}




