//Display all the numbers entered by user except multiple of 10;
//It doesn't stop the loop like break statement. It'll just skip printing of multiple of 10;
package Loops;

import java.util.Scanner;

public class continueProg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a number to print: ");
            int n = sc.nextInt();
            if(n%10 == 0){
                continue;
            }
            System.out.println("The number entered by user is: " + n);
        } while (true);
        //System.out.println("Any multiple of 10 entered by you is skipped");
        
    }
    
}
