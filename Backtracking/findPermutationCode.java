package Backtracking;

public class findPermutationCode {
    public static void main(String args[]){
        String str = "abc";
        findPermutations(str, "");
    }
    static void findPermutations(String str, String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i=0; i<str.length(); i++){
            // removing the previous eleemnt to block access for the next step
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(NewStr, ans+str.charAt(i));
            
        }
    }
}
