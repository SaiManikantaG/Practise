package javaBasic;

import java.util.*;

public class ArrayListDemo {
	public static void main(String args[]){
		ArrayList array_list = new ArrayList();
		System.out.printf("Enter the size of array list: ");
		array_list.add("sai");
		array_list.add("Radha");
		array_list.add("Siri");
		array_list.add("nimi");
		
		System.out.println("Size now is: "+array_list.size());
		System.out.println("Carray list elements are: "+array_list);
		array_list.add("Avanthika");
		array_list.add("Kiran");
		System.out.println("Added new element, array list now is: "+array_list);
		array_list.remove(5);
		System.out.println("removed new element, array list now is: "+array_list);
		Iterator itr= array_list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

	
}
