package com.bridgelabz;
import java.util.ArrayList;
public class BookList {
  
	static ArrayList<AddressBook> books=new ArrayList<AddressBook>();

	void addBook(String name, AddressBook book) {
	    book.bookName=name;
		this.books.add(book);
	
		
	}
	void checkBook(String name,AddressBook book) {
		if( this.books.size()==0) {
			System.out.println("Booklist is empty.Creating a book with name "+ name);
			this.addBook(name,book);
			
		}
		else {
			for (int i = books.size() - 1; i >= 0; --i) {
				if (books.get(i).bookName.contains(name)) {
					
					System.out.println("Book exist please go ahead");
				
				}
			}
		}
	}
}	