package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Apex2dCall
{
   public static void main(String args[])
   {
	   // === Get Booked Ticket List
	   String  [] bookedList = ticking();
	   //  === initialize here.
       int row, col;
       String arr[][] = new String[10][9];
       Scanner scan = new Scanner(System.in);
       //  === enter row and column for array.
       System.out.print("Enter row for the array (max 10) : \n");
       row = scan.nextInt();
       col = 5;
       
       //  === Get All Seat details
       ArrayList<String> objList  = markBooked(arr, row, col, bookedList );
       //System.out.println(objList+"; length:"+objList.size());
       System.out.println("Available seats:");
       ArrayList<Integer> bookd = new ArrayList<>();
       for(int u=0;u<objList.size();u++){
    	   if(((u%6) ==0) && u>1)
    	   {
        	   System.out.print("\n");
    	   }
    	   System.out.print(objList.get(u)+" ");
   }
   }

   //  === Get Booked Tickets
private static String[] ticking() {
	System.out.println("Enter list of booked tickets seperated by spaces");
	Scanner sc = new Scanner(System.in);
	String ticketListGiven = sc.nextLine();
	   //String ticket = "A1 C4 G3";
	   String ticketList[] = ticketListGiven.split(" ");
	   int k = 0;
	   System.out.print("booked List: ");
	   for(String tckt: ticketList){
		   ticketList[k++] = tckt;
		  System.out.print(tckt+";");
		  //System.out.print(" ");
	   }
	 System.out.print("\n");
	return ticketList;
}
   
   private static ArrayList<String> markBooked(String arr[][],int row,int col, String[] bookedList ){
	   // === Array List to store the ticket elements after setting the booked tickets
       ArrayList<String> finalList = new ArrayList<>(); 
	   //  === enter array elements.
	     for(int lr = 0; lr< col; lr ++){
	               arr[lr][0] = "A";
	               arr[lr][1] = "B";
	               arr[lr][2] = "C";
	               arr[lr][3] = "E";
	               arr[lr][4] = "F";
	               arr[lr][5] = "G";
	     } 
	       //  === the 2D array is here.
	       //System.out.print("The Array is :\n");
	       for(int i=0; i<row; i++)
	       {
	           for(int j=0; j<6; j++)
	           {
	        	   arr[i][j] = arr[i][j]+ ""+i;
	               for(int x=0;x<bookedList.length;x++){
	            	   if(arr[i][j].equals(bookedList[x])){
	            		   arr[i][j] = "--";
	            	   }
	               }
	               finalList.add(arr[i][j]);
	           }
	       }
	       return finalList;
   }
}
