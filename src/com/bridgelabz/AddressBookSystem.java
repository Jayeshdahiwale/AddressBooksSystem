package com.bridgelabz;
import java.util.Scanner;
public class AddressBookSystem {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
   
    String phoneNumber;
    String email;
    long zip;
    Scanner scan=new Scanner(System.in);
    void addPerson() {
    	
    	System.out.println("First Name :");
    	this.firstName=scan.nextLine();
    	System.out.println("Last Name :");
    	this.lastName=scan.nextLine();
    	System.out.println("Enter the address :");
    	this.address=scan.nextLine();
    	System.out.println("Enter city : ");
    	this.city=scan.nextLine();
    	System.out.println("Enter state : ");
    	this.state=scan.nextLine();
    	System.out.println("Enter Phone Number : ");
    	this.phoneNumber=scan.nextLine();
    	System.out.println("Enter Email : ");
    	this.email=scan.nextLine();
    	System.out.println("Enter zip : ");
    	this.zip=scan.nextLong();
    	
    }
    void deletePerson(String name,AddressBookSystem contact) {
        if(contact.firstName==null) {
        	System.out.println("Adressbook is empty.Please first add the contact");
        }
    	else if(name.equals(contact.firstName)) {
    		contact.firstName=null;
    		System.out.println("Contact deleted successfully");
    	}
    	else {
    		System.out.println("There is no person with the given name");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Address Book Program ");
        AddressBookSystem contact=new AddressBookSystem();
       
        while(true) {
        	System.out.println("Do you want to add/edit/delete the contact (0/1/2) :Press 3 to quit");
        	int input=scan.nextInt();
        	if(input==0) {
        		contact.addPerson();
        		
        	}
        	else if(input==2) {
        		Scanner nameScan=new Scanner(System.in);
        		System.out.println("Enter the first name of the person you want to delete : ");
        		String name=nameScan.nextLine();
        		contact.deletePerson(name, contact);
        	}
        	else if(input==1 && contact.firstName==null) {
        		System.out.println("Adressbook is empty .Please add");}
        		
        	else if(input==1) {
        		Scanner nameScan=new Scanner(System.in);
        		System.out.println("Enter the first name of the person you want to edit : ");
        		String name=nameScan.nextLine();
        		if(name.equals(contact.firstName)) {
        			contact.addPerson();
        		
        		}
        	   else {
        			System.out.println("No such person exist in the database");
        		}
        		
        	}		
        		
        	
        	else if(input==3) {
        		System.out.println("Program successfully closed");
        		break;
        		
        	}
        	else {
        		System.out.println("Enter the valid command");
        	}
        }
        
        
        
	}

}
