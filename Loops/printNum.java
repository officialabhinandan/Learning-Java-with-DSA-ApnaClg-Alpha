package Loops;
import java.util.Scanner;

public class printNum {
    public static void main(String args[]){
        int count1 = 1;

        //print 1 to 10
        while(count1<=10){
            System.out.println(count1);
            count1++;

        }

        //print 1 to n(User given)
        int count2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        while(count2<=n){
            System.out.println(count2);
            count2++;
        }

        sc.close();
    }
}
