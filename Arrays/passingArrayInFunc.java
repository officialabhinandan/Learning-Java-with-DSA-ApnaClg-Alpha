package Arrays;

import java.util.Scanner;

public class passingArrayInFunc {
    public static void main(String arg[]) {
        // for array 1 where I use pre defined value in the array
        int marks[] = { 96, 97, 98, 99 };
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // for array 2 where I use user defined value and length in the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n]; // here n is user given size of the array
        inputArr(arr);
        updateArr(arr);
        outputArr(arr);

        sc.close();

    }

    //for marks[] array
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2; // traversing through the array elements and updating them by incresing their value by 1.
        }
    }


    //for arr[] array
    public static void inputArr(int ar[]) {  //PS: here arr and ar is different. Bcz its not necessary to pass the same name with the main method.
        System.out.println("Enter the elements of the arr for update: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void updateArr(int ar[]) {  //PS: here arr and ar is different. Bcz its not necessary to pass the same name with the main method.
        for (int i = 0; i < ar.length; i++) {
            ar[i] = ar[i] + 5;   //incresing value of each elements by 5.
        }
    }

    public static void outputArr(int ar[]) {   //PS: here arr and ar is different. Bcz its not necessary to pass the same name with the main method.
        System.out.print("After update the new arr will be: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    //arr used in main method is actual argument and ar used in these methods is formal argument.

}
