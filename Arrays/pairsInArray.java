package Arrays;

public class pairsInArray {
    public static void main(String args[]){
         int num[] = {2, 4, 6, 8, 10};

        printPairs(num);
    }
    
    //worst case time complexity is O(n^2) due to nested for loop
    public static void printPairs(int arr[]){
        int totalPairs = 0; //to print total number of pairs
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print(" (" + arr[i] + "," + arr[j] + ") ");
                totalPairs++;  //formula to calculate total pairs is: (n(n-1))/2 where n is length of the array
            }
            System.out.println();
        }
        System.out.println("The total number of pairs are: " + totalPairs);
    }

}
