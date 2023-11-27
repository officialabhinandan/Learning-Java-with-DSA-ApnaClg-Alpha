/* 
 *Coding Question 2:

There is a group of people which also includes two monsters in this group and they split
these groups among the people to kill them. When Monsters come into the group of
people, then at that time people leave their group.
After that, the breaking of the group will continue due to the monster's entry. And at
last, the group with the minimum length will be killed by the monsters.

Two types of monsters are present there namely “@" and “$".
People are represented as a string “P".

Now you have to find out the minimum length of the group which will be killed by
monsters.

Input Format: First line with the string for input 
Output Format: Minimum length
Constraints: 2 <= Length of string <=10A9

Input string : PPPPPP@PPP@PP$PP
Output: 2
*/

import java.util.*;

public class IBM_Q2 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       String str = sc.next();

       System.out.println(minimumLength(str));
    }

    public static int minimumLength(String s){
        int currLen = 0;
        int minLen = Integer.MAX_VALUE;

        for(int i=0; i<s.length(); i++){
           if(s.charAt(i) == '@' || s.charAt(i) == '$'){
            minLen = Math.min(minLen, currLen);
            currLen = 0;
           } else {
            currLen++;
           }
        }
        minLen = Math.min(currLen, minLen);
        return minLen;
    }
    
}
