package Sorting;

// import java.util.Arrays;
// import java.util.Collections;
import java.util.*; //to import al at a time.

public class sortingPractice2 {
    public static void main(String args[]) {
        Integer arr[] = { 5, 2, 1, 3, 4 };

        // time complexity of Arrays.sort method is O(nlogn) which is far less than
        // O(n^2)
         Arrays.sort(arr); //this method is present in Arrays class of
        // java.util.Arrays package.
         Arrays.sort(arr, 0, 3); // to sort a particular portion if an array we often
        // use
        // Arrays.sort(arr, si, ei) where si=Starting index, ei=Ending index. Here Si is
        // inclusive and ei
        // is non inclusive so 0 to 3 means 0th index to 2nd index.
        // to sort in the reverse order we use Collections.reverseOrder() where reverse
         Arrays.sort(arr, Collections.reverseOrder()); // order is a method under
        // Collections class/framework. That's why we need to import java.util.Collections;
        Arrays.sort(arr, 0, 3, Collections.reverseOrder()); // Collections.reverseOrder() method doesn't work on int,
                                                            // that's why we need to convert
                                                            // int(a premitive data type) to Integer(an object of
                                                            // Integer class)

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // public static

}
