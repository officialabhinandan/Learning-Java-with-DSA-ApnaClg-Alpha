/*  Q> Find if any pair in a sorted arraylist has the target sum
  list = [1, 2, 3, 4, 5. 6]
  target = 5
*/

package ArrayListProgs;
import java.util.ArrayList;

public class pairSumCode {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println("Using brute force method[O(n²)]: ");  // (P.S. To arite sqaure : alt + 0178)
        System.out.println(pairSumBFA(list, 50) ? "Pair exists" : "Pairs doesn't exists");
        System.out.println("Using most optimized 2 pointer approach[O(n)]: ");
        System.out.println(pairSumOptimized(list, 5) ? "Pair exists" : "Pairs doesn't exists");

    }

    // time complexity O(n^2)
    public static boolean pairSumBFA(ArrayList<Integer> al, int target){   // BFA = Brute Force Approach
        for(int i=0; i<al.size(); i++){
            for(int j=i+1; j<al.size(); j++){
               if(i+j == target){
                System.out.println("(" + i + " , " + j + ")");
                return true;
            }
            }
        }
        return false;
    }

    // time complexity O(n) [Most optimized method]
    public static boolean pairSumOptimized(ArrayList<Integer> alist, int target){   // 2 pointer approach 
       int lp = 0; // left pointer
       int rp = alist.size()-1;
       while(lp != rp){
        // target check
        //case 1
        if((alist.get(lp)+alist.get(rp)) == target){
            return true;
        }
        // case 2
        if((alist.get(lp)+alist.get(rp)) < target){
           lp++;
        }
        // case 3
        if((alist.get(lp)+alist.get(rp)) > target){
            rp--;
        }
       }

       return false;
    }
}