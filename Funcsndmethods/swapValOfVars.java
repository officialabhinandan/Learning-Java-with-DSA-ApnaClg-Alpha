//Swapping the value of two variables by using a third varible.

package Funcsndmethods;

import java.util.Scanner;

public class swapValOfVars {
    public static void main(String args[]) {
        swapWithTempVar();
        swapWithOutTempVar();
    }

    // by using a third varible.
    public static void swapWithTempVar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping (with temp variable):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // sc.close();
    }

    // without using a third varible.
    public static void swapWithOutTempVar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        System.out.print("Enter value for d: ");
        int d = sc.nextInt();

        // c = c + d; //Method 1 using add, sub
        // d = c - d;
        // c = c - d;

        // c = c * d; //Method 2 using mul, div
        // d = c / d;
        // c = c / d;

        // XOR operators rules
        // 1 XOR 0 = 1
        // 0 XOR 1 = 1
        // 1 XOR 1 = 0
        // 0 XOR 0 = 0

        c = c ^ d; // Method 3 using XOR operator. ^ is XOR symbol
        d = c ^ d;
        c = c ^ d;

        // a = a + b;
        // b = a - b;
        // a = a - b;

        System.out.println("After swapping (without temp variable):");
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        sc.close();
    }
}
