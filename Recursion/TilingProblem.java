/*  Tilling Problem: Given a "2*n" board and tiles of size "2*1", count the number of ways to tile the given board using the 2*1 tiles. (A tile can 
either be placed horizontally or vertically). Came in Amazon */
package Recursion;

public class TilingProblem {
    public static void main(String args[]){
        System.out.println(tilingProb(3));
    }
    public static int tilingProb(int n){   // bcz, floor size = 2 * n [n = length of the floor]
        // base case 
        if(n==0 || n==1){
            return 1;
        }
        //  choice: vertical alignment of the tiles
        int verticalWays = tilingProb(n-1); 

        //  choice: horizontal alugnment of the tiles  
        int horizontalWays = tilingProb(n-2); 

        // total ways = verticalWays + horizontalWays;
        return verticalWays + horizontalWays;
    }  
        
}
