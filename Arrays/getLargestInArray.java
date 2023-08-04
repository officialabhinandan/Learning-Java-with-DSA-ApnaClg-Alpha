package Arrays;
//import java.util.*;

public class getLargestInArray {
    public static void main(String args[]){
        int numbers[] = {11, 21, 63, 36, 78, 104, 216, 551, 42, 74};
        int largestNumber = getLargest(numbers);
        System.out.println("Largest value in the numbers array is: " + largestNumber);
        int smallestNumber = getSmallest(numbers);
        System.out.println("Smallest value in the numbers array is: " + smallestNumber);
        
        //also can be printed in this way
        System.out.println(getLargest(numbers));  
        System.out.println(getSmallest(numbers));
    }
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE; //signifies - infinity in java(lowest possible interger value)
       // int smallest = Integer.MAX_VALUE; //signifies + infinity in java(highest possible interger value)
      // System.out.println(largest);  //just to check
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            //   if(arr[i] < smallest){
            //     smallest = arr[i];
            // }
        }
        //System.out.println("Smallest value in the numbers array is: " + smallest);
        return largest;
    }

    public static int getSmallest(int arr[]){
       // int largest = Integer.MIN_VALUE; //signifies - infinity in java(lowest possible interger value)
        int smallest = Integer.MAX_VALUE; //signifies + infinity in java(highest possible interger value)
       // System.out.println(smallest);  //just to check
        for(int i=0; i<arr.length; i++){
            // if(arr[i] > largest){
            //     largest = arr[i];
            // }
              if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
       // System.out.println("Smallest value in the numbers array is: " + smallest);
       // return largest;
       return smallest;
    }
}
