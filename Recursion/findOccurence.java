// Program to find the first and last occurence of an element in an array. (Finding the index)
package Recursion;

public class findOccurence {
    public static void main(String args[]){
        int num[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int idx = firstOcc(num, 0, 5);
        if(idx == -1){
            System.out.println("The key is not present in the array");
        } else {
            System.out.println("The key is presnt at index no " + idx);
        }
    }

    // first occurence 
    public static int firstOcc(int arr[], int i, int key){
        // base case
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr, i+1, key);
    }
}
