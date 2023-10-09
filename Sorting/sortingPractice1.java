package Sorting;

public class sortingPractice1 {
    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        //int arr2[] = {1, 2, 3, 4, 5};
        int arr3[] = {1, 4, 1, 3, 2, 4, 3, 7};
        //bubbleSort(arr);
        // System.out.print("Bubble Sort: ");
        // printArray(arr);
        // System.out.println();
        // selectionSort(arr);
        // System.out.print("Selection Sort: ");
        // printArray(arr);
        // System.out.println();
        // System.out.print("Insertion Sort: ");
        // insertionSort(arr);
        // printArray(arr);
         System.out.print("Counting Sort: ");
        countingSort(arr3);
        printArray(arr3);
        



    }
 
    //time complexity O(n^2). Not optimized.
    public static void bubbleSort(int a[]){
        for(int i=0; i<a.length-1; i++){ //here i is no of turns
            int swap = 0;  //in case the array is already sorted from starting. We can also use a boolean var(boolean isswap == false)
            for(int j=0; j<a.length-1-i; j++){
                if(a[j] > a[j+1]){
                    //swap - with or without using 3rd variable is possible
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swap++;   //to know wheather the array is sorted or not. In case of boolean var swap = true;                }

                if(swap==0){  //to keep the time complexity O(n) in case of a already sorted array. Optimized bubble sort code for already sorted array.
                    break;    // in case of boolean if(isswap == false){ break; }
                }
            }

        }
    }

    

    //tine complexity - O(n^2)
    public static void selectionSort(int a[]){
        for(int i=0; i<a.length-1; i++){  //here i is no of turns
            int smallest = i;
            for(int j = i+1; j<a.length; j++){
                if(a[j] < a[smallest]){  // if we do if(a[j] > a[smallest]) it will just reverse the array into decresing order.
                  smallest = j;
                }
            }

            //swap
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;

        }
    }

    //time complexity O(n^2)
    public static void insertionSort(int a[]){
        for(int i=1; i<a.length; i++){  //i=1 bcz 0th element is reserved for sorted part of the array.
            int curr = a[i]; //current element is  in unsorted array.
            int j = i-1; //sorted part

            //finding the suitable position
            while(j>=0 && a[j] > curr){  //to make ascending to descending while(j>=0 && a[j] < curr) should be applied
                a[j+1] = a[j];
                j--;
            }

            //placement of the element
            a[j+1] = curr;


        }
    }

    //time complexity: O(n+range). It is only applicable where range is low.
    public static void countingSort(int a[]){
        int largest = Integer.MIN_VALUE;

        //traversing through the original array and calculating the largest value present there.
        for(int i=0; i<a.length; i++){
            largest = Math.max(largest, a[i]);
        }

        //making the count array
        int count[] = new int[largest+1];
        //filling up the count array by the frequency of the elements present in the original array
        for(int i=0; i<a.length; i++){
            count[a[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                a[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
