// Program to find the first and last occurence of an element in an array. (Finding the index)
package Recursion;

public class findOccurence {
    public static void main(String args[]){
        int num[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        //int num2[] = {5, 5, 5, 5};
        int foidx = firstOcc(num, 0, 5);

        // first occurence
        System.out.println("....First Occurence....");
        if(foidx == -1){
            System.out.println("The key is not present in the array");
        } else {
            System.out.println("The key is presnt at index no " + foidx);
        }
        int loidx1 = lastOccM1(num, num.length-1, 5);
        
        System.out.println("....Last Occurence....");
        //last occurence - Method 1 (My method)
        if(loidx1 == -1){
            System.out.println("Method 1: The key is not present in the array");
        } else {
            System.out.println("Method 1: The key is presnt at index no " + loidx1);
        }

        // last occurence - Method 2 (Apna College)
        int loidx2 = lastOccM1(num, num.length-1, 5);
        if(loidx2 == -1){
            System.out.println("Method 2: The key is not present in the array");
        } else {
            System.out.println("Method 2: The key is presnt at index no " + loidx2);
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

    // last occurence : method 1 (My method)
    public static int lastOccM1(int arr[], int i, int key){
        // base case
        if(i == 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr, i-1, key);
    }

    // last occurence : method 2 (Apna college's method)
    public static int lastOccM2(int arr[], int key, int i){
        // base case
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccM2(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return isFound;
        }
        return isFound;
    }
}
