package javaBasic;


import java.util.*;

public class ifStatement {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
	float n;
	System.out.println("Enter the number");
	n = s.nextFloat();
	System.out.println("Enter the number");
	String ny = s.next();
	System.out.println("name is: "+ny);
	System.out.println("Your number is"+n);
	
	if( n>10)
	{
		System.out.println("False");
	}
	else if (n<10)
	{
		System.out.println("False");
	}
	else
	{
		System.out.println("true");
	}

}
}
