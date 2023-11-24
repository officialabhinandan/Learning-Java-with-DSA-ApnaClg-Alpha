// Online IDE - Code Editor, Compiler, Interpreter
// AON Cocubes coding questions
/* Given an array, number to search (say x), and occurrence (say n), print the index of the nth occurrence of x in the array. 
If x does not occur n times, return (-1) as index */ 
// You can also the code in Online-IDE by using this link : https://www.online-ide.com/9IbMTKslW8

import java.util.Scanner;
public class findNthOccurrence
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int arr[] = new int[l];
        
        for(int i=0; i<l; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findNthOcc(arr, x, n));
        sc.close();
    }
    public static int findNthOcc(int a[], int x, int n){
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == x){
                count++;
                if(count == n){
                    return i;
                }
            }
        }
        return -1;
    }
    
}
