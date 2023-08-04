package Arrays;

public class reverseOfAnArray {
    public static void main(String args[]) {
        int num1[] = { 1, 2, 3, 4, 5 };
        int num2[] = { 10, 20, 30, 40, 50, 60 };

        arrayReverse(num1);
        System.out.println();
        arrayReverse(num2);
    }

    public static void arrayReverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (arr[start] == arr[end]) {  //optional
                break;
            }
            // swap - without using 3rd variable
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];

            //swap - using 3rd variable
            // int temp = arr[start];
            // arr[start] = arr[end]; 
            // arr[end] = temp;

            start++;
            end--;

        }
        

        // traditional for loop
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        //for each loop
        for(int i: arr){
            System.out.print(i + " ");
        }

    }

}
