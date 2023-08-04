package Arrays;

//import java.sql.Time;

public class mSASum
{
	public static void main(String[] args) {
	    int numbers[] = {1, -2, -3, 4, 5, -6, -7, 8};
	    
	    //calling functions
	    printSubArrays(numbers);
	    usingBruteForceMethod(numbers);
	    usingPrefixSumMethod(numbers);
	    usingKadenesAlgorithm(numbers);
	    
	    
	}
	public static void printSubArrays(int arr[]){
	    int tsa = 0; //tsa = total sub arrays
	    for(int i=0; i<arr.length; i++){
	        for(int j=i; j<arr.length; j++){
	            for(int k=i; k<=j; k++){
	                System.out.print(arr[k] + " ");
	            }
	            tsa++;
	            System.out.println();
	        }
	         System.out.println();
	    }
	    System.out.println("Total number of sub arrays will be: " + tsa);
	}
	
	//now calculating max sub array sum. Time complexity: O(n^3).
	public static void usingBruteForceMethod(int arr[]){
	    int maxSum = Integer.MIN_VALUE;
	    //int currSum = 0;
	    
	    for(int i=0; i<arr.length; i++){
	        for(int j=i; j<arr.length; j++){
	             int currSum = 0;
	            for(int k=i; k<=j; k++){
	               // System.out.print(arr[k] + " ");
	               currSum = currSum + arr[k];
	               System.out.println(currSum);
	               
	               if(currSum>maxSum){
	                   maxSum = currSum;
	               }
	            }
	        }
	    }
	        System.out.println("The maximum sum of subarrays using brute force method is: " + maxSum); 
}
    
    //Time complexity: O(n^2).
    public static void usingPrefixSumMethod(int arr[]){  //formula, prefix sum = prefix[end] - prefix[start-1] 
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    int prefix[] = new int[arr.length];
    
    //at first we need to add the numbers of the array as we traverse through it and make a prefix array
    //for example the prefix array of {1, -2, -3, 4, 5, -6, -7, 8} will be {1, -1, -4, 0, 5, -1, -8, 0}
    prefix[0] = arr[0];
    //making the prefix array from the original array
    for(int i=1; i<prefix.length; i++){
        prefix[i] = prefix[i-1] + arr[i];
    }
    
    for(int i=0; i<arr.length; i++){
        for(int j=i; j<arr.length; j++){
            //using if else:-
            if(i == 0){  //here start = i; condition: if(start == 0){.....}
                currSum = prefix[j];
            } else {
                currSum = prefix[j] - prefix[i-1];
            }
            
            //or using ternamry operator
            //currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];
            
            //using if 
            // if(currSum > maxSum){
            //     maxSum = currSum;
            // }
            
            //or using max function
            maxSum = Math.max(maxSum , currSum);
        }
    }
    System.out.println("The maximum sum of subarrays using prefix sum method is: " + maxSum);
    
    
}
    public static void usingKadenesAlgorithm(int arr[]){   //Time complexity: O(n).
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i=0; i<arr.length; i++){
            currSum = currSum + arr[i];
            
            if(currSum<0){
                currSum = 0;
            }
            
            maxSum = Math.max(currSum, maxSum);
        }
         System.out.println("The maximum sum of subarrays using Kadene's algorithm method is: " + maxSum);
        
        
    } 
}