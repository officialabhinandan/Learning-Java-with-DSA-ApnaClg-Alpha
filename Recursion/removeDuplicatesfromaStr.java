// To remove the duplicate characters from a string. Given the string contains only a-z(small case only).
// By chance in future if we get small case, capital case, symbols, numbers everything in a string, then we neeed to use Hashset data str using Java Collection Framework(JCF)
// Came in Google, Microsoft
package Recursion;

public class removeDuplicatesfromaStr {
    public static void main(String args[]){
      //System.out.println(removeDupliChar("appnnacollege", 0, new StringBuilder(" "), new boolean[26]));
      removeDupliChar("appnnacollege", 0, new StringBuilder(" "), new boolean[26]);
    }
    public static void removeDupliChar(String str, int idx, StringBuilder sb, boolean track[]){   // public static String removeDupliChar(...){}
        // base case
        if(idx == str.length()){
            System.out.println(sb);
            //return sb.toString();
            return;
        }
        // logic
        int n = str.charAt(idx) - 'a' ;   // char currChar = str.charAt(idx);
        if(track[n] != true){             // if(track[currChar-'a'] != true)
            track[n] = true;
            removeDupliChar(str, idx+1, sb.append(str.charAt(idx)), track);
        } else {
        removeDupliChar(str, idx+1, sb, track);
        }
        //return sb.toString();
    }
}
