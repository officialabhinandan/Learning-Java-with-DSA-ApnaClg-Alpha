package VariablesndDT;
import java.util.Scanner;

public class mathOp2 {
    public static void main(String args[]) {

        // creating objects of scanner classes
        Scanner sc = new Scanner(System.in);
        // Scanner sc2 = new Scanner(System.in);

        // taking user input
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt();

        // calculating and printing the sum
        int sum = a + b;
        System.out.println("The value of a + b will be: " + sum);

        // calculating and printing the sum
        int product = a * b;
        System.out.println("The value of a * b will be: " + product);

        // calculating and printing the area of a circle
        System.out.println("Enter the radius of the circle: ");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad; // or (float) 3.14 * rad * rad; or take area as double like next line. This is called type casting in java.
        //double area = 3.14 * rad * rad;
        System.out.println("The area of the circle will be: " + area);

        // closing sc to prevent resource leak
        sc.close();
        // sc2.close();

    }
}
