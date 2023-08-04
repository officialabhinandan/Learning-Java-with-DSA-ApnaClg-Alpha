package ConditionalSTs;

import java.util.Scanner;

public class largestbw3nums {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 no: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // conditon
        if ((A > B) && (A > C)) {
            System.out.println("Largest no : A");
        } else if ((B > A) && (B > C)) {
            System.out.println("Largest no : B");
        } else {
            System.out.println("Largest no : C");
        }

    }

}
