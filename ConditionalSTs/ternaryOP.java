package ConditionalSTs;

import java.util.Scanner;;

public class ternaryOP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // finding even or odd using ternary operator
        System.out.println("Enter a number to check, wheater is it even or odd: "); 
        int num = sc.nextInt();
        String numType = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(numType);

        // finding pass or fail using ternary operator
        System.out.println("Enter marks to check, wheater is pass or fail: "); 
        int marks = sc.nextInt();
        String reportCard = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(reportCard);

        sc.close();

    }
}
