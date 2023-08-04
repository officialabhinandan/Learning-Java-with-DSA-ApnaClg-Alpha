package Arrays;

public class subArrays {
    public static void main(String args[]){
       int num[] = {2, 4, 6, 8, 10};
       //int numbers[] = {1, -2, -3, 4, 5, -6, -7, 8};

       //caling function
       printSubArrays(num);
       //printSubArrays(numbers);
    }

    public static void printSubArrays(int arr[]){
        int totalSubArrays = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                totalSubArrays++;  //total number of subarrays formula: (n(n+1))/2;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of sub arrays will be: " + totalSubArrays);
    }


}
