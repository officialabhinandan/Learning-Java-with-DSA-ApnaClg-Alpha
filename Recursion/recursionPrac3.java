
// Online IDE - Code Editor, Compiler, Interpreter
// Writing code in an online ide just for testing porpose
package Recursion;


public class recursionPrac3
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        System.out.println("Printing sum of the n natural numbers: " + m1(5));
        System.out.println("Printing 1 to n numbers using for loop: ");
        item2ForLoop(5);
        System.out.println();
        System.out.println("Printing 1 to n numbers using while loop: ");
        item2WhileLoop(5);
        System.out.println();
        System.out.println("Printing 1 to n using recursion: ");
        recm2(5);
        System.out.println();
        System.out.println("Printing n to 1 using recursion: ");
        recm2Reverse(5);
        System.out.println();
        System.out.println("Printing the value of a^n using normal method is: " + powerFunc1(5, 4));
        System.out.println("Printing the value of a^n using optimized method is: " + powerFunc2(5, 4));
    }
    // calculating the sum n natural numbers......
    public static int m1(int n){
        if(n == 1){
            return n;
        }
        return n + m1(n-1);
    }
    // printing 1 to n using iteration (for loop)
    public static void item2ForLoop(int n){
        for(int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
    }
    // printing 1 to n using iteration (while loop)
    public static void item2WhileLoop(int n){
        int i = 1;
        while(i<=n){
            System.out.print(i + " ");
            i++;
        }
    }
    // printing 1 to n using recursion
    public static void recm2(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        recm2(n-1);
        System.out.print(n + " ");
    }
    // printing n to 1 using recursion
    public static void recm2Reverse(int n){
        if(n == 1){
          System.out.print(n + " ");
          return;
        }
        System.out.print(n + " ");
        recm2Reverse(n-1);
    }
    // To find a^n using recursion - using normal method (TC is O(n), SC is O(n))
    // For very small no of datasets O(n) is better than O(log n)
    public static int powerFunc1(int num, int pow){
        if(pow == 0){
            return 1;
        }
        return num * powerFunc1(num, pow-1);
    }
    // To find a^n using recursion - using optimized method (TC is O(log n) and SC is O(log n))
    // For huge no of datasets, O(log n) time complexity is better than O(n).
    public static int powerFunc2(int num , int pow){
        if(pow == 0){
            return 1;
        }
        int halfPower = powerFunc2(num, pow/2);
        int halfPowerSq = halfPower * halfPower;
        
        if(pow%2 != 0){ // power is odd
            return num * halfPowerSq;
        } 
        return halfPowerSq;
    }
}
