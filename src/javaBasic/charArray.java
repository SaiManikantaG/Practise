package javaBasic;
import java.util.*;

public class charArray {
	public static void main(String args[]){
		double[] listVals = {11, 11.5, 12.5, 13.5, 10, 30.5, 9, 1.5};
		Date date = new Date();
		System.out.println("Date is: "+date);
		System.out.println("List values are::");
		for (int i=0; i<listVals.length;i++){
			
			System.out.print(""+listVals[i]);
			System.out.print(" ");
		}
		double max=0;
		System.out.println("\n");
		for(int j=0; j<listVals.length;j++)
		{
			if(listVals[j]>max){
				max=listVals[j];
				
			}
			}
		System.out.println("Max value is:"+max);
		}
	}
