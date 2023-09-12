// printing the decresing number after n until 1.
package Recursion;
import java.util.Scanner;

public class recursionPrac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a  = sc.nextInt();
        printDecNum(a);
        sc.close();
    }

    // recursive function
    public static void printDecNum(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDecNum(n-1);
    }
}
