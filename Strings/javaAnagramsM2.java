/*An anagram of a string is another string that contains the same characters, only the order of characters can be different.
 For example, “abcd” and “dabc” are an anagram of each other. Another example can be "silent" and "listen". --From Hackerrank (Youtube's method without importing Arrays package)
*/

package Strings;

public class javaAnagramsM2 {
    public static void main(String args[]){
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagrams(s1, s2) ? "Anagrams" : "Not anagrams");
    }
    public static boolean isAnagrams(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() != str2.length()){
           return false;
        }
        int arr[] = new int[26]; // created an array of 26 elements that consists 26 english alphabets 
        //traversing through the 1st string and increasing the freq of the individual character of string inside the array 
        for(int i=0; i<str1.length(); i++){
            int index = str1.charAt(i)-'a';
            arr[index]++;
        }
        // traversing through the 2nd string and decreasing that freq again to make it 0 if they are same(anagrams)
        for(int i=0; i<str2.length(); i++){
            int index = str2.charAt(i)-'a';
            arr[index]--;
        }
        for(int i=0; i<arr.length; i++){ 
            if (arr[i] != 0){
                return false;
            }   
        }
        return true;  // to avoid dead code warning at i++ and avoid early terminating of the loop we write true in this way.
        /*  if we write return true and false inside the if else condition as soon as it encounters one of the return statement(true/false) it'll
        move out of the loop and terminate the loop and make the i++ logic a dead code because the loop won't be able to gotothe next iteration. */


    }
    
    
}
