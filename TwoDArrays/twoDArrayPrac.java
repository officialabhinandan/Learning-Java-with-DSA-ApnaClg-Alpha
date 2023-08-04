package TwoDArrays;

import java.util.Scanner;

public class twoDArrayPrac {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        searchKeyVoid(matrix, 1);
        searchKeyBool(matrix, 10);
        // boolean isPresent = searchKeyBool(matrix, 4);
        // if(isPresent == false){
        // System.out.println("Key not found(boolean)");
        // }
        System.out.println("The largest key in the matrix is: " + searchLargestKey(matrix));
        System.out.println("The smallest key in the matrix is: " + searchSmallestKey(matrix));

        printRow(matrix);

        sc.close();
    }

    // searching an element -- return type void
    public static void searchKeyVoid(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Using Void func --> Key found at index: " + "(" + i + "," + j + ")");
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Key not found(void)");
            // System.out.println(count);
        }
    }

    // searching an element -- return type boolean
    public static boolean searchKeyBool(int matrixArr[][], int num) {
        for (int i = 0; i < matrixArr.length; i++) {
            for (int j = 0; j < matrixArr.length; j++) {
                if (matrixArr[i][j] == num) {
                    System.out.println("Using Boolean func -->Key found at index: " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found{boolean}");
        return false;

    }

    // searching largest element inside a matrix
    public static int searchLargestKey(int matrix[][]) {
        int largestKey = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                // if(matrix[i][j] >= largestKey){
                // largestKey = matrix[i][j];
                // }
                largestKey = Math.max(largestKey, matrix[i][j]);
            }
        }
        return largestKey;
    }

    // searching smallest element inside a matrix
    public static int searchSmallestKey(int matrix[][]) {
        int smallestKey = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] <= smallestKey) {
                    smallestKey = matrix[i][j];
                }
                // smallestKey = Math.min(smallestKey, matrix[i][j]);
            }
        }
        return smallestKey;
    }

    //print a particular row/col - for e.g. 1st row(w.r.t index 0)
    public static void printRow(int matrix[][]){
           for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
               if(i == 1){
                System.out.print(matrix[i][j] + " ");
               }
                
            }
        }

    }
}
