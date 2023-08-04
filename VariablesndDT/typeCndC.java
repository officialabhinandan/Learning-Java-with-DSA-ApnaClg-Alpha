package VariablesndDT;

import java.util.Scanner;

public class typeCndC {
    public static void main(String args[]) {
        /*
         * Type conversion is also called widening conversion or implicit conversion.
         * Type conversion is possible, when
         * i) type conpatible (for e.g. int to long possible but int to boolean not
         * possible, it creates an lossy conversation and Java denies to convert it)
         * ii) desination type > source type (byte <short <int <float <long <double)
         */
        int a = 25;
        long b = a;
        System.out.println("b = " + b);

        // Type Conversion
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextFloat(); //not allowed
        float y = sc.nextInt();
        System.out.println(y);
        // System.out.println(x);

        // Type Casting, also called narrowing or explicit conversion.
        float marks = 9.74f; // or (float) 9.74
        int newMarks = (int) marks; // forcefully converting float to int by ignoring loss of data(lossy
                                    // conversation)
        System.out.println(newMarks); // only print number before decimal

        char ch1 = 'a';
        char ch2 = 'b';
        char ch3 = 'A';
        char ch4 = 'B';
        int val1 = ch1; // This type casting is possible but here it prints the ASCII value of a
        int val2 = ch2;
        int val3 = ch3; // This type casting is possible but here it prints the ASCII value of A
        int val4 = ch4;
        System.out.println("The ASCII value of 'a' is: "+ val1);
        System.out.println("The ASCII value of 'b' is: "+ val2);
        System.out.println("The ASCII value of 'A' is: "+ val3);
        System.out.println("The ASCII value of 'B' is: "+ val4);

        sc.close();

    }

}
