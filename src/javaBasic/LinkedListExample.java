package javaBasic;

import java.util.*;
import java.util.LinkedList;

class Book{
		int id, quantity;
		String bookName, author;
		
		public Book(int id, int quantity, String bookName, String author){
			this.id = id;
			this.quantity = quantity;
			this.author = author;
			this.bookName = bookName;
		}
	}
		public class LinkedListExample{
			public static void main(String[] args){
				List<Book> list_values = new LinkedList<Book>();
				Book bk1 = new Book(1,10,"nimi is bad","sai");
				Book bk2 = new Book(2,20,"sai is bad","nimi");
				Book bk3 = new Book(3,10,"Everyone is mad","sai and nimi");
				list_values.add(bk1);
				list_values.add(bk2);
				list_values.add(bk3);
				
				for(Book b:list_values){
					
					 System.out.println(b.id+" "+b.bookName+", author is: "+b.author+" and qunatity is: "+b.quantity);
					
					
				}
				
				
				
			}
		
	}
