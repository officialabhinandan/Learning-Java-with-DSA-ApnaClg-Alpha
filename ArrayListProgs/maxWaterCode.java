package ArrayListProgs;
import java.util.ArrayList;

public class maxWaterCode {   
  // time complexity = O(n^2)
    public static int storeWaterBFA(ArrayList<Integer> height){   // BFA = Brute Force Approach 
      int maxWater = 0;
      // brute force 
      for(int i=0; i<height.size(); i++){
        for(int j=i+1; j<height.size(); j++){
            int ht = Math.min(height.get(i), height.get(j));
            int width = j-i;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
        }
      }
      return maxWater;
    }
    
    // time complexity: O(n)
    public static int storeWaterOptimized(ArrayList<Integer> height){  // 2 pointer Approach
      int maxWater = 0;
      int lp = 0; // lp = left pointer , 
      int rp = height.size()-1; // rp = right pointer
      while(lp < rp){

         // calculate water area
         int ht = Math.min(height.get(lp), height.get(rp));
         int width = rp - lp;
         int currWater = ht * width;
         maxWater = Math.max(maxWater, currWater);

         // update the pointer
         if(height.get(lp) < height.get(rp)){
          lp++;
         } else {
          rp--;
         }
       }
      return maxWater;

    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        // height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Brute force method: " + storeWaterBFA(height)); // ans 49
        System.out.println("2 Pointer approach method: "+ storeWaterOptimized(height)); // ans same as above
    }
}
