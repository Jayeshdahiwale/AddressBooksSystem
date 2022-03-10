package com.bridgelabz;

public class AddressBookSystem {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    long zip;
    String phoneNumber;
    String email;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program ");
        AddressBookSystem contact=new AddressBookSystem();
        contact.firstName="Jayesh";
        contact.lastName="Dahiwale";
        contact.address="Ashok Nagar Layout, Near Petrol Pump,Adyal";
        contact.city="Bhandara";
        contact.state="Maharashtra";
        contact.zip=441903;
        contact.phoneNumber="7066944829";
        contact.email="jayjdahivale@gmail.com";
        
        
	}

}
