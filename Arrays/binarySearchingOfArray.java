package Arrays;

public class binarySearchingOfArray {
    public static void main(String args[]) {
        int numbers[] = { 2, 5, 9, 14, 19, 24, 26, 28 };
        int key = 26;

        System.out.println("The key is found at index: " + binarySearch(numbers, key)); // will print -1 if the number
                                                                                        // is not found in the array

        System.out.println("The key is found at index (using recursion): " + recursiveBinarySearch(numbers, key, 0, numbers.length-1)); // will print -1 if the number
                                                                                        // is not found in the array
    }

    public static int binarySearch(int arr[], int num) {
        int start = 0;
        int end = arr.length - 1; // defining start and end index of the array

        // comparisons
        while (start <= end) {
            int mid = (start + end) / 2; // middle index
            if (arr[mid] == num) { // one time this condition will be true and id will be returned unless the
                                   // number is not found in the array
                return mid;
            }
            if (arr[mid] < num) { // search in right side(2nd half)
                start = mid + 1;
            } else { // search in the left side(1st half) for the condition (arr[mid] > num)
                end = mid - 1;
            }
        }
        return -1; // only if the number is not found in the array

    }

    public static int recursiveBinarySearch(int arr[], int num, int start, int end) {
        // int start = 0;
        // int end = arr.length-1;
        
        // base case
        if (end >= start && start <= arr.length - 1) {
            int mid = start + (end-start) /2; // same as (start + end) / 2;
            if (arr[mid] == num) {
                return mid;
            }
            if (arr[mid] < num) {
                return recursiveBinarySearch(arr, num, mid + 1, end);
            } else {
                return recursiveBinarySearch(arr, num, start, mid - 1);
            }
        }
        return -1;
    }

}
