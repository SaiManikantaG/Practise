package javaBasic;
import java.io.*;
import java.math.*;
import java.util.*;

public class QuickSort {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		 
		//Decide the number of friends
		System.out.print("Enter size of array: ");
		int arrLength = Integer.parseInt(scan.nextLine());
 
		//Create a string array to store the names of your friends
		int x[] = new int[arrLength];
		for (int i = 0; i < x.length; i++) {
			System.out.println("Enter the value of index "+i);
		        x[i] = scan.nextInt();
		}
		    
		//int [] x = {1, 12, 5, 26, 7, 14, 3, 7, 2};
		System.out.println("Input values are:"+Arrays.toString(x));
		
		int low = 0;
		int high = x.length -1;
		quickSort(x, low, high);
		 System.out.println("sorted values are:"+Arrays.toString(x));
		
	}
	
	public static void quickSort( int [] arr, int low, int high){
		if(arr == null || arr.length == 0)
			return;
		if( low >= high)
			return;
		int mid = low + (high - low)/2;
		int pivot = arr[mid];
		int i = low, j = high;
		while (i <= j)
		{
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			if (i <= j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if(low < j)
			quickSort(arr, low, j);
		if(high > j)
			quickSort(arr, i, high);
	}

}
