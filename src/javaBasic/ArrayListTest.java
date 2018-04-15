package javaBasic;

import java.util.*;

public class ArrayListTest {
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sai");
		list.add(" Testing");
		list.add(" Array List");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		for(String obj:list){
			System.out.println(obj);
		}
	}

}
