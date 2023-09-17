// print the x to the power n. 
package Recursion;

public class printXtothepowerN {
    public static void main(String args[]){
      System.out.println(powerFunc(2, 10));
      System.out.println(optimizedPowerFunc(2, 5));
    }

    // recursive function
    // In this process the time complexity is O(n). For example, If we have to calculate 2^100000 it'll create worst time and space complexity.
    public static int powerFunc(int x, int n){
        //base case 
        if(n == 0){
            return 1;
        }
        return x * powerFunc(x, n-1);
    }

    // To overcome the worst Time and Space complexity we use optimized process where the time complexity is O(log n)
    /* Optimized method: if n is even, 
                          x^n = (x)^n/2 * (x)^n/2;
                         if n is odd,
                          x^n = x * (x)^n/2 * (x)^n/2;
                          */
    public static int optimizedPowerFunc(int x, int n){
        // base case
        if(n == 0){
            return 1;
        }
        //int halfPowerSq = optimizedPowerFunc(x, n/2) * optimizedPowerFunc(x, n/2); // still here the time complexity is O(n). To solve this,
        int halfPower = optimizedPowerFunc(x, n/2);  // here calling the recursion function 1 time.
        int halfPowerSq = halfPower * halfPower;     // But making square of the variable. So less no of call stack and less time and space complexity.  

        
        //In case n is odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
}
