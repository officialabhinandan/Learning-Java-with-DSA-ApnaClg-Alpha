/* Using recursion and backtracking inserting elements into an array and then reducing the value of the elements by 2(val) at the time returing 
from the call stack. */

package Backtracking;

public class bktrkInArr {
    public static void main(String args[]){
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        System.out.println();
        printArr(arr);

    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void changeArr(int arr[], int i, int val){
        // here i = index of arr elements for traversal
        // here val = values to be inserted insode the array
       // base case
       if(i == arr.length){
         printArr(arr); 
        return;
       }
       // logic
       arr[i] = val;
       changeArr(arr, i+1, val+1);
       arr[i] = arr[i] - 2;
    }
}
