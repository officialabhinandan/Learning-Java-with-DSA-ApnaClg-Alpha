package Funcsndmethods;
import java.util.Scanner;

//import java.lang.Math;

public class methodsPrac {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        //calling functions
        int sum = calculateSum(n1, n2); // here n1 and n2 are called arguments or actual parameters, uses in function call.
        System.out.println("The sum is: " + sum);
        int product = calculateProduct(n1, n2);
        System.out.println("The product is: " + product);
        System.out.println("Calling the calculateProduct method directly: " +  calculateProduct(5, 25)); //giving another inputs
        int factorial = calculateFactorial(sum);
        System.out.println("The factorial is : " + factorial);
        System.out.println("Calling the calculateFactorial method directly: " +  calculateFactorial(6));
        System.out.println("Enter the value of n and r for calulating binomial coeffcient: ");
         int n = sc.nextInt();
         int r = sc.nextInt();
        int binomialCoeff = calculateBinomial(n, r);
        System.out.println("The binomial coeffient is : " + binomialCoeff);
        System.out.println("Calling the calculateBinomial() method directly: " + calculateBinomial(5, 2));
        System.out.println("Checking prime no or not: " + isPrime(23));
        boolean checkPrime = isPrime(24);
        if (checkPrime == true){
            System.out.println("A Prime Number");
        } else {
            System.out.println("Not a prime a number(Composite number)");
        }
        System.out.println("Checking prime no or not using optimized function: " + isPrimeOptimized(10));
        printPrimeNumInRange(20);
    
        printHW();

        sc.close();

    }

    public static int calculateSum(int a, int b){ //here we can also use (int n1, int n2) but that is optional. //retun type changed from void to int
         // here int a and int b are called formal parameters, uses in function definition.
        int c = a + b;
        return c;
        
    }

    public static int calculateProduct(int a, int b){
        int c = a * b;
        return c;
    }

    public static int calculateFactorial(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
           fact = fact * i;
        }
        return fact;
    }

    public static int calculateBinomial(int n, int r){
        int bcoff = calculateFactorial(n)/(calculateFactorial(r)*(calculateFactorial(n-r)));  //ncr = binomial coefficent = n!/r!*(n-r)!
         // here calculateFactorial is a helper function, it is helping to solve this indirectly.
         return bcoff;

    }
    
    //only n >= 2 ; 1 is neither prime nor composite
    public static boolean isPrime(int n){
        //boolean isPrime = true;

        //corner case for n = 2
        if (n == 2){
            return true;
        }
        for(int i=2; i<=n-1; i++){
            if(n%i == 0){
               // isPrime = false;
               return false;
              //  break;
            }
        }
        // return isPrime;
        return true;
    }

    public static boolean isPrimeOptimized(int n){
        //corner case for n = 2
        if (n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){ //loop is running from 2 to root over of n; it is the most optimized method as far as compilation time is concerened for large numbers.
            if(n%i == 0){
               return false;
            }
        }
        return true;

    }

    public static void printPrimeNumInRange(int n){
        for(int i=0; i<=n; i++){
            if(isPrimeOptimized(i) == true){ //here we are using isPrimeOptimized() method as a helper method
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void printHW(){ //method without parameters
        System.out.println("Hello World");

    }
    
}
