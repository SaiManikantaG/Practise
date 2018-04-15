package javaBasic;
import java.util.*;
public class printOdds {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the number to print odd numbers to that number:");
		int n = input.nextInt();
		printOdds(n);
	}
	public static void printOdds(int n) {
        for (int i = 1; i < n; i += 2) {
            System.out.println ( i );
        }
    }
}

