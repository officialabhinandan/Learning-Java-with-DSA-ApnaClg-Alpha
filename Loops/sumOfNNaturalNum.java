package Loops;
import java.util.Scanner;

public class sumOfNNaturalNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int count = 1;
        int sum = 0;
        

        //print the sum of n natural numbers
        while(count<=n){
         sum = sum + count;
         count++;
         
        }
        System.out.println("The sum of " + n + "natural numbers are: " + sum);
        sc.close();
    }
    
    
}
