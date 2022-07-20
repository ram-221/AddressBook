package com.addressbooksystem;
import java.util.Scanner;

public class AddressBookDelete extends AddressBookAdd {
	
	static Scanner s = new Scanner (System.in);
	public void delete () {
		int i;
		
		System.out.println("\n Enter first name to delete :");
		String name = s.next();
		
		for(i = 0; i < contactBook.size(); i++) {
			if(contactBook.get(i).getFirstName().equals(name)){
				contactBook.removeAll(contactBook);
				System.out.println("deleted");
			}
			else
				System.out.println("not deleted");
		}
	}
	public static void main(String[] name) {
		AddressBookEdit book1 = new AddressBookEdit();
		AddressBookDelete book2 = new AddressBookDelete();
		book1.read();
		book1.display();
		book1.edit();
		book2.delete();
		book2.display();
	}

}
