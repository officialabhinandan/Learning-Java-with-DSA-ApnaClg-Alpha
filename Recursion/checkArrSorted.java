package Recursion;

public class checkArrSorted {
    public static void main(String args[]){
       int demoArr[] = {1, 2, 3, 4, 5};
       System.out.println("Using iteration: " + isSortedbyIteration(demoArr));
       System.out.println("Using recursion: " + isSortedbyRecursion(demoArr, 0));
    }

    static boolean isSortedbyIteration(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    static boolean isSortedbyRecursion(int arr[], int i){

        //base case 
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSortedbyRecursion(arr, i+1);
    }
    
}
