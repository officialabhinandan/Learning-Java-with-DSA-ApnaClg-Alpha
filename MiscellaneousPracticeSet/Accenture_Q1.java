/* Given an integer array print the largest number in the array and the index on which this number is present. 
Input 
10 
23 45 82 27 66 12 78 13 71 86 
Output 
86 
9 

*/

import java.util.Scanner;

public class Accenture_Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = 0;

        int arr[] = new int[n];
        int maxNum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
          arr[i] = sc.nextInt();
          //maxNum = Math.max(arr[i], maxNum);
          if(arr[i] > maxNum){
            maxNum = arr[i];
            idx = i;
          }
        }
        System.out.println(maxNum);
        System.out.println(idx);
        sc.close();
    }
}
