package Arrays;

public class maxSubArrSum {
    public static void main(String args[]) {
        int num[] = { 1, -2, 6, -1, 3 };
        //int numbers[] = {1, -2, -3, 4, 5, -6, -7, 8};

        // calling function
        printMaxSubArrSum1(num);
        //printMaxSubArrSum2(num);
        //printMaxSubArrSum3(num);

    }

    // here time complexity is O(n^3). It is not optimized. It is Brute force approach.
    public static void printMaxSubArrSum1(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum = currentSum + arr[k];
                    System.out.print(currentSum + " ");

                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                }
                System.out.println();
            }
        }

        System.out.println("The maximum sum using brute force approach is: " + maxSum);

    }

    // here time complexity is O(n^2). It is comparatively optimized. It is Prefix sum approach.
    public static void printMaxSubArrSum2(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calculating the array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;      //or,  maxSum = Math.max(maxSum, currentSum); 
                }
            }
        }

        System.out.println("The maximum sum using prefix sum approach is: " + maxSum);

    }

    // here time complexity is O(n). It is extremely optimized. It is Kadane's algorithm approach.
    public static void printMaxSubArrSum3(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum < 0) {
                currentSum = 0;
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("The maximum sum using Kadane's algorithm approach is: " + maxSum);
    }

}
