//keep entering numbers until user enters multiple of 10.

package Loops;

import java.util.Scanner;

public class breakProg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a number to print: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("The number you entered is: " + n);
        } while (true);
        System.out.println("Sorry you're not allowed to enter multiple of 10.");

    }

}
