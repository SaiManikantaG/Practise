package stringTest;

import java.util.Scanner;

/**
 * Created by sai on 7/15/17.
 */
public class StringReverseBuilder {

    public static void main(String args[]){

        String input="";
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        input=sc.nextLine();

        StringBuilder inp = new StringBuilder(input);
        System.out.println(inp.reverse());

    }
}
