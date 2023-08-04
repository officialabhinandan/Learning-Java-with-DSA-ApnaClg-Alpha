package ConditionalSTs;

import java.util.Scanner;

public class findOddEven {
    public static void main(String args[]){

        //With predefined value
        int n1 = 6;
        if (n1 % 2 == 0){
            System.out.println("n1 is even");
        } else {
            System.out.println("n1 is odd");
        }

        //With user given value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n2: ");
        int n2 = sc.nextInt();
        if (n2 % 2 == 0){
            System.out.println("n2 is even");
        } else {
             System.out.println("n2 is odd");
        }

    }
    
}
