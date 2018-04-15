package javaBasic;
import java.util.*;
import java.io.*;

	public class MinumNumber {
		   
		   public static void main(String[] args) {
			   Scanner ipt = new Scanner(System.in);
			   System.out.println("Enter a value");
		      float a = ipt.nextFloat();
		      System.out.println("Enter a value to compare with previous value");
		      float b = ipt.nextFloat();
		      float c = minFunction(a, b);
		      System.out.println("Minimum Value = " + c);
		   }

		   /** returns the minimum of two numbers */
		   public static float minFunction(float a, float b) {
		      float min;
		      if (a > b)
		         min = b;
		      else
		         min = a;

		      return min; 
		   }
		}
