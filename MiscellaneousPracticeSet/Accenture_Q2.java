/* 

Problem statement
-
Implement the following function:
int SumOfPro(int arrll], int arr2[]), int n);

The function takes two integer arrays ‘arrl’ and ‘arr2’
of size ‘n' as its argument. Implement the function to
find the product of elements of arrl and arr2 by
Multiplying the first element of arrl with the last
element of arr2. second element of arrl with the
second last element of arr2 and so on, let (arr1[0] *
arr2[n-1)), (arr1[1] * arr2[n-2]) and return the sum of oll. 
the products obtained
Note:
Array Indexing starts from 0
If both the arrays are empty (None in case of python) return -1.
Output lies within integral range.

Example:
n = 6
arr1 = [22, 7, 1, -5, 5, -2];
arr2 = [4, -1, 21, 12, 10, -3];
Output : 
102

*/
import java.util.*;

public class Accenture_Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for(int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(sumOfPro(arr1, arr2, 6));
    
        sc.close();
    }

    public static int sumOfPro(int arr1[], int arr2[], int n){
        int i = 0;
        int j = n - 1;  // arr2.length-1
        int sum = 0;

        if(n == 0){
            return -1;
        }
       while(i<=n-1 && j>=0){
        sum = sum + (arr1[i] * arr2[j]); 

        i++;
        j--;
       }
       return sum;
    }
}
