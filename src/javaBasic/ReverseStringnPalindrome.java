package javaBasic;


import java.io.*;
import java.util.*;

public class ReverseStringnPalindrome {
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
  String input_String=input.next();
  String output_string = reverseString(input_String);
System.out.println("Reversed String is: "+output_string);
boolean Palindrome = isPalindrome(output_string);
System.out.println("Result checking Palindrome is: "+Palindrome);
 
	}

	public static String reverseString(String s) {
        char[] a = s.toCharArray();
        int n = a.length - 1;

        for (int i = (n - 1) / 2; i >= 0; i--) {
            char temp = a[i];
            a[i] = a[n - i];
            a[n - i] = temp;
        }
        return String.valueOf(a);
        
    }
	
	public static boolean isPalindrome(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}

}

