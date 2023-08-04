package ConditionalSTs;

import java.util.Scanner;

public class taxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        double income = sc.nextDouble();
        Double tax;

        //conditions
        if (income <= 500000){
            tax = (double) 0;
        } else if (income > 500000 && income < 1000000){
            tax = income*(0.2);
        } else {
            tax = income*(0.3);
        }

        System.out.println("Tax = " + tax);
        



    }
    
}
