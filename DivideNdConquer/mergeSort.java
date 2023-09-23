package DivideNdConquer;

public class mergeSort {
    public static void printArr(int arr[]){
        System.out.println("The sorted array using Merge Sort technique is:");
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    }

    public static void mergeSortMethod(int arr[], int si, int ei){
       // base case
       if(si>=ei){
        return;
       }
       // logic
       int mid = si + (ei - si)/2 ; // (si + ei)/2
        // recursive  call
       mergeSortMethod(arr, si, mid); // for left part of the array
       mergeSortMethod(arr, mid+1, ei); // for right part of the array
       merge(arr, si, mid, ei);   // to merge the left and right part of the array.
    }

    public static void merge(int arr[], int si, int mid, int ei){
       // making the temporary array to store the elemets of the sorted parts of the array
       // left(0, 2) = 3; right(3, 5) = 3 ; Total elements (5-0+1) = 6 
       int tempArr[] = new int[ei-si+1]; // since array starts from 0 index
       int i = si; // iterator for left part of the array
       int j = mid+1; // iterator for the right of the array
       int k = 0;  // iterator for the tempArr
       
       // comparing the smallest element between the left and right part of the array and storing it into the tempArr
       while(i<=mid && j<=ei){
          if(arr[i] < arr[j]){
            tempArr[k] = arr[i];
              i++; //k++;
          } else {
            tempArr[k] = arr[j];
            j++; //k++;
          }
          k++; // as in both case k's value will be increased by 1, so writing later
       }

       // logic for if any element is left out after the comparison between right and left part of the array
       // left side extra element
       while(i<=mid){
        tempArr[k++] = arr[i++];
       }
       // right side extra element
       while(j<=ei){
        tempArr[k++] = arr[j++];
       }

       // now coping the elemnts the tempArr to the original arr
       for(k=0, i=si; k<tempArr.length; k++, i++){
         arr[i] = tempArr[k];
       }

    }
    public static void main(String args[]){
       int arr[] = {6, 3, 9, 5, 2, 8, 7, -1};
       mergeSortMethod(arr, 0, arr.length-1);
       printArr(arr);
    }
}
