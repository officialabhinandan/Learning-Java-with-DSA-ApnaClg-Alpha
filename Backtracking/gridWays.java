// Find number of ways to reach from (0,0) to (N-1,M-1) in a N*M grid where only right and downward movement is allowed.
// see grid ways photo for the diagram and more details.
package Backtracking;

public class gridWays {
    public static void main(String args[]){
        int n = 3; int m= 3;
        System.out.println(countWays(0, 1, n, m));
    }
    public static int countWays(int i, int j, int n, int m){
      // base case
       if(i == n-1 && j == m-1){  // condition for last cell
        return 1;
       } 
       if (i == n || j == m){   // consdition for boundary cross
        return 0;
       }
      // logic (recursion)
      int w1 = countWays(i+1, j, n, m);
      int w2 = countWays(i, j+1, n, m);
      return w1 + w2;
    }
}
