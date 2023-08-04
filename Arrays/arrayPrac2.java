package Arrays;

public class arrayPrac2 {
    public static void main(String args[]){
        int num[] = {1, 2, 3, 4, 5};
        arrOp(num);
        System.out.println();
        int newArr[] = arrOp2(num);
         for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
         int newArr2[] = arrOp3();
         for(int i=0; i<newArr2.length; i++){
            System.out.print(newArr2[i] + " ");
        }
        
    }
    public static void arrOp(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = 2 * arr[i];
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] arrOp2(int a[]){
        for(int i=0; i<a.length; i++){
            a[i] += 2;
        }
        return a;
    }
    public static int[] arrOp3(){
      return new int[]{1, 2, 3};
    }
}
