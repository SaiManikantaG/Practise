package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Apex2dCall
{
   public static void main(String args[])
   {
	   String  [] bookedList = ticking();
	   
	   
	   // initialize here.
       int row, col, i, j;
       String arr[][] = new String[10][9];
       Scanner scan = new Scanner(System.in);
       // enter row and column for array.
       System.out.print("\n Enter row for the array (max 10) : \n");
       row = scan.nextInt();
       col = 5;
       ArrayList<String> objList  = markBooked(arr, row, col, bookedList );
       System.out.println(objList+"; length:"+objList.size());
   }

private static String[] ticking() {
	   String ticket = "A1 C4 G3";
	   String ticketList[] = ticket.split(" ");
	   int k = 0;
	   System.out.print("booked List: ");
	   for(String tckt: ticketList){
		   ticketList[k++] = tckt;
		  System.out.print(tckt+";");
		  //System.out.print(" ");
	   }
	return ticketList;
}
   
   private static ArrayList<String> markBooked(String arr[][],int row,int col, String[] bookedList ){
       ArrayList<String> finalList = new ArrayList<>(); 
	   // enter array elements.
	     for(int lr = 0; lr< col; lr ++){
	               arr[lr][0] = "A";
	               arr[lr][1] = "B";
	               arr[lr][2] = "C";
	               arr[lr][3] = "E";
	               arr[lr][4] = "F";
	               arr[lr][5] = "G";
	     } 
	       // the 2D array is here.
	       System.out.print("The Array is :\n");
	       for(int i=0; i<row; i++)
	       {
	           for(int j=0; j<6; j++)
	           {
	        	   arr[i][j] = arr[i][j]+ ""+i;
	               for(int x=0;x<bookedList.length;x++){
	            	   if(arr[i][j].equals(bookedList[x])){
	            		  // System.out.print(bookedList[x]+":::");
	                       // System.out.println("ls:"+arr[i][j]);
	            		   arr[i][j] = "=>"+arr[i][j]+"=XXX<=";
	            	   }
	               }
	             //  System.out.print(""+arr[i][j]+" ");

	               finalList.add(arr[i][j]);
	               System.out.print("\t" );
	           }
	           System.out.println(" \t");
	       }
	       return finalList;
   }
}
