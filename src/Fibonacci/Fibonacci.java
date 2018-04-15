package Fibonacci;

/**
 * Created by sai on 7/12/17.
 */

public class Fibonacci {
    public static int fibonacci(int i) {
        if (i == 0)
            return 0;

        if (i == 1)
            return 1;

        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static int max = 100;
    public static int[] fib = new int[max];

    public static int fibonacciDP(int i) {
        if (i == 0)
            return 0;

        if (i == 1)
            return 1;

        if (fib[i] != 0)
            return fib[i];

        fib[i] = fibonacciDP(i - 1) + fibonacciDP(i - 2);
        return fib[i];
    }

    public static int tailRecursive(int n) {
        if (n <= 2)
            return 1;

        return tailRecursive(0, 1, n);
    }

    private static int tailRecursive(int a, int b, int count) {
        if (count <= 0)
            return a;

        return tailRecursive(b, a + b, count - 1);
    }

    public static void printFibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(f0 + " ");
                continue;
            }

            if (i == 1) {
                System.out.print(f1 + " ");
                continue;
            }

            fn = f1 + f0;

            System.out.print(fn + " ");

            f0 = f1;
            f1 = fn;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        printFibonacci(15);
    }
}