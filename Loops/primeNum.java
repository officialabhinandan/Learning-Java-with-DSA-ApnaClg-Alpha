package Loops;
import java.util.Scanner;

public class primeNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //By using counter variable
        System.out.println("Method 1: Counter Variable");
        System.out.println("Enter a number to check a number prime or not");
        int n1 = sc.nextInt();
        int count = 0; 
        for(int i=2; i<=n1-1; i++){
            if(n1%i == 0){
              count++;  
            }
        }
        if(count == 0){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number.");
        }

        //By using boolean 
        System.out.println("Method 2: Boolean Variable");
        System.out.println("Enter another number to check a number prime or not");
        int n2 = sc.nextInt();
        boolean isPrime = true;
         for(int i=2; i<n2; i++){
            if(n2%i == 0){
              isPrime = false; 
            }
        }
        if(isPrime == true){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number.");
        }

        //Optimized for large numbers especially 1 lakh etc.
        //  if(n == 2){
        //     System.out.println("Prime Numberrr");
        // } else {
        // boolean isPrime = true;
        // for(int i=2; i<=Math.sqrt(n); i++){
        //     if(n%i == 0){
        //         isPrime = false;
        //     }
        // }
        
        // if(isPrime == true){
        //     System.out.println("Prime number");
        // } else {
        //     System.out.println("Not a Prime Number");
        // }
        // }
       
        sc.close();

    }
}
