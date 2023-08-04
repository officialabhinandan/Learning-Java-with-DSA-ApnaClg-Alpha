package ConditionalSTs;

import java.util.Scanner;

public class largestbw2nums {
    public static void main(String args[]){\

        //With predefined values 
        int a = 5;
        int b = 9;

        //if-else condiotion check
        if(a>b){
            System.out.println("Largest is a and its value is " + a);
        } else {
            System.out.println("Largest is b and its value is  " + b);
        }

        //With user given values
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();
         System.out.println("Enter the value of d: ");
        int d = sc.nextInt();

        //if-else condiotion check
        if(c>d){
            System.out.println("Largest is c and its value is " + c);
        } else {
            System.out.println("Largest is d and its value is  " + d);
        }



    }
    
}
