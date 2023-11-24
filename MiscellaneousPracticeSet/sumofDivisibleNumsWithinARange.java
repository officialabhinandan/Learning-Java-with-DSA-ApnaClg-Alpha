// Online IDE - Code Editor, Compiler, Interpreter
//AON Cocubes coding questions
/* Given two positive m and n are given. You are required to calculate the sum of numbers divisible by both 3 and 5 between the 
inclusive range of m and n. */ 
// You can also access the code in Online-IDE here: https://www.online-ide.com/lqZufhwUYr

import java.util.Scanner;
public class sumofDivisibleNumsWithinARange

{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=m; i<n; i++){
            if(i%3==0 && i%5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
