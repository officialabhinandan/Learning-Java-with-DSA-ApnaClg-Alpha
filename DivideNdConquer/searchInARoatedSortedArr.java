// Input is a sorted and rotated array with distinct/unique numbers (in ascending order). It is rotated at a pivot point. Find the index of the given elemnt.

package DivideNdConquer;

public class searchInARoatedSortedArr {
    public static int search(int arr[], int target, int si, int ei) {
        // base case
        if (si > ei) {
            return -1; // invalid idx
        }
        // logic
        int mid = si + (ei - si) / 2; // also (si + ei)/2

        // found mid at the first step
        if (arr[mid] == target) {
            return mid;
        }

        // CASE 1: Mid on Line 1 of the graph
        if (arr[si] <= arr[mid]) {
            // CASE 1A : left of L1
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                // CASE 1B : right of L1
                return search(arr, target, mid + 1, ei);
            }
        }

        // CASE 2: Mid on Line 2 of the graph
        else {
            if (arr[mid] <= arr[ei]) {
                // CASE 2A : left of L2
                if (arr[mid] <= target && target <= arr[ei]) {
                    return search(arr, target, mid + 1, ei);
                } else {
                    // CASE 2B : right of L2
                    return search(arr, target, si, mid - 1);
                }
            }
        } 
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // output is expected to be 4 (index of 0)
        int targetIdx = search(arr, 0, 0, arr.length - 1);
        System.out.println(targetIdx);
    }
}
