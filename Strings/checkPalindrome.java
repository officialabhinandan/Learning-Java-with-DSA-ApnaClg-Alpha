//came in Intuit coding round
package Strings;

public class checkPalindrome {
    public static void main(String args[]){
        String demoStr = "noon";
        System.out.println(isPalindrome(demoStr));
    }
    public static boolean isPalindrome(String str){
       for(int i=0; i<=str.length()/2; i++){  //for(int i=0; i<j; i++,j--) where j = str.length()-1
        if(str.charAt(i) != str.charAt(str.length()-1-i)){
            //not a palindrome condition
            return false;
        }
       }
       //palindrome condition
       return true;
    //using while loop
      // int i = 0;
      // int j = str.length()-1;

      // while(i<=j){
      //    if(str.charAt(i) != str.charAt(str.length()-1-i)){
      //       //not a palindrome condition
      //       return false;
      //   }
      //   i++;
      //   j--;
      // }
      //palindrome condition
      //return true;
      

    }
}
