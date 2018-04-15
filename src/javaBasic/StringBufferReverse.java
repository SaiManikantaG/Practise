package javaBasic;

import java.util.*;
import java.io.*;

public class StringBufferReverse {
 
		public static void main(String args[]){  
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a String");
			String sbs = input.nextLine();
		StringBuffer sb=new StringBuffer(sbs);  
		sb.reverse();  
		System.out.println(sb);//prints olleH  
		}   

}
