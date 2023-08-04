package Loops;

import java.util.Scanner;

public class reverseOfNum {
    public static void main(String args[]) {

        // print the reverse of a previously given number
        int n = 659741;
        int revNum;

        while (n > 0) {
            revNum = n % 10;
            System.out.print(revNum);
            n /= 10; // n = n / 10

        }
        System.out.println();

        // print the reverse of a user given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its reverse: ");
        int ugn = sc.nextInt(); // ugn = user giver no.
        int revNumUG; // reverse number user given

        while (ugn > 0) {
            revNumUG = ugn % 10;
            System.out.print(revNumUG);
            ugn /= 10; // ugn = n / 10

        }
        System.out.println();

        // reverse the original number in the memory
        int n2 = 2023;
        int lastDigit;
        int rev = 0;

        while (n2 > 0) {
            lastDigit = n2 % 10;
            rev = (rev * 10) + lastDigit;
            n2 /= 10;
        }
        System.out.println(rev);

        sc.close();

    }
}
