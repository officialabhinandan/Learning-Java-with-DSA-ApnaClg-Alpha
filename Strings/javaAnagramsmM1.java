/*An anagram of a string is another string that contains the same characters, only the order of characters can be different.
 For example, “abcd” and “dabc” are an anagram of each other. Another example can be "silent" and "listen". --From Hackerrank (My own method)
*/
package Strings;
import java.util.Arrays;

public class javaAnagramsmM1 {
    public static void main(String args[]){
       String str1 = "listen";
       String str2 = "silent";
    //    String str1 = "fire";
    //    String str2 = "firee";
       System.out.println(isAnagrams(str1, str2)? "Anagrams" : "Not anagrams"); //print statement using ternary operator

    }
    public static boolean isAnagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
       char arr1[] = (s1.toLowerCase()).toCharArray();
       char arr2[] = (s2.toLowerCase()).toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       return Arrays.equals(arr1, arr2);
    }
}
