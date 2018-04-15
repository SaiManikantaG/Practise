package javaBasic;

public class fib {
	public static void main ( String[] args ) {
        for ( int i = 0; i < 10; i++ ) {
            System.out.print ( fib(i) + ", " );
        }
        System.out.println ( fib(10) );
    }
	public static long fib(int n) {
        return n <= 1 ? n : fib(n-1) + fib(n-2);
    }

}
