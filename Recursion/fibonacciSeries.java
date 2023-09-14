// Fibonacci numbers 
package Recursion;

public class fibonacciSeries {
    public static void main(String args[]) {
        System.out.println("Fibonacci number using recursive function: " + nthFibNumRecursive(7));
        System.out.println("Fibonacci number using iterative function: " + nthFibNumIterative(7));
    }

    public static int nthFibNumRecursive(int n) {
        // if (n == 0) {
        // return 0;
        // }
        // if (n == 1) {
        // return 1;
        // }
        if (n == 0 || n == 1) {
            return n;
        }
        return nthFibNumRecursive(n - 1) + nthFibNumRecursive(n - 2);
    }

    public static int nthFibNumIterative(int n) {
        int n1 = 0, n2 = 1, n3 = 0;
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
        // return -1;

    }
}
