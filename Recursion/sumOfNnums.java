// print sum of N natural numbers using recursion.
package Recursion;
import java.util.Scanner;

public class sumOfNnums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The sum of "+ n +" numbers will be: " + sumOfN(n));
        sc.close();
    }

    static int sumOfN(int num){
        if(num == 1){
            return 1;
        }
        return sumOfN(num-1) + num;
    }
}
