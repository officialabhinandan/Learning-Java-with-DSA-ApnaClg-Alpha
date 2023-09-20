/*  Friends Pairing Problem:- 
Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once.
Find out the total number of ways in which friends can remain single or can be paired up. */
// Came in Goldman Sachs

package Recursion;

public class friendsPairingProb {
   public static int friendsPairingWays(int n){
      // base case
      if(n == 1 || n == 2){
        return n;
      }
      /* 
      // choice 
      // staying single
      int single = friendsPairingWays(n-1);
      // pairing with friends
      int pair = (n-1) * friendsPairingWays(n-2);
      // totalways = single + pair
      return single + pair;
      */

     return friendsPairingWays(n-1) + (n-1) * friendsPairingWays(n-2);   // simplification
   }
   public static void main(String args[]){
       System.out.println(friendsPairingWays(3));
   }
}
