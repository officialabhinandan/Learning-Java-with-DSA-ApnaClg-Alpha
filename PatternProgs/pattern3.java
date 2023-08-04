//Print half pyramid pattern

package PatternProgs;

import java.util.Scanner;

public class pattern3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("1st pattern: prints row wise(i)");
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        int n2 = sc.nextInt();
        System.out.println("2nd pattern: prints column wise(j)");
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }

}
