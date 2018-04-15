package stringTest;

import java.util.Scanner;

/**
 * Created by sai on 7/15/17.
 */
public class StringReverseArray {

    public static void main(String[] args) {
        String input = "";
        System.out.println("Enter the string to reverse");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        char[] rev = input.toCharArray();
        for (int i=rev.length-1;i>=0;i--){
          //  System.out.println(rev[i]);
            System.out.print(rev[i]);
        }
        System.out.println("<--in one line");



    }
}
