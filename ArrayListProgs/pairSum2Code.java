/* Find if any pair of a sorted and rotated array has the target sum
 list = [11, 15, 6, 8, 9, 10]   {original array was [6, 8, 9, 10, 11, 15] and here pivot is 10}
 */

package ArrayListProgs;
import java.util.ArrayList;

public class pairSum2Code {
    public static void main(String args[]){
       ArrayList<Integer> list = new ArrayList<>();
       list.add(11);
       list.add(15);
       list.add(6);
       list.add(8);
       list.add(9);
       list.add(10);

       System.out.println(pairSum2(list, 16) ? "Pair exists" : "Pair doesn't exists");
    }

    /* we can also do this using the brute force method with O(n²) time complexity. But here we'll directly implement 2 pointer approach method.
     To do that, we need to find the breaking point first. In a sorted arraylist or array, (list.get(i) < list.get(i+1)) or (arr[i] < arr[i+1])
       */

    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1; // bp = breaking point; (-1) because not a valid index
        int n = list.size();

        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp + 1; // left pointer
        int rp = bp;  // right pointer

        while(lp != rp){
            // case 1
            if((list.get(lp) + list.get(rp)) == target){
                return true;
            }
            // case 2
            if((list.get(lp) + list.get(rp)) < target){
                lp = (lp+1)%n;
            }
            // case 3
            if((list.get(lp) + list.get(rp)) > target){
                rp = (n+rp-1)%n;
            }

        }
        return false;
    }
}