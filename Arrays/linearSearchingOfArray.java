package Arrays;

public class linearSearchingOfArray {
    public static void main(String args[]){
        int numbers[] = {2, 4, 7, 9, 10, 16, 18, 23, 25, 30};
        int key = 23;

        //System.out.println(linearSearch(numbers, key));
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Key not found in the given array");
        } else {
            System.out.println("The key " + key + " is present at index " + index);
        }

    }

    public static int linearSearch(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
