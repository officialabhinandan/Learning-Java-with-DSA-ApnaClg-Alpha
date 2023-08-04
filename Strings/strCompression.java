/*  if input = aaabbbbccddddd, then output = a3b4c2d5(overall string size compressed without loosing data)
 but if input = abc, then output = abc otherwise string size will be increased */
// came in Amazon
package Strings;

public class strCompression {
    public static void main(String args[]){
        String userIPStr1 = "aaabbbbccddddd";
        String userIPStr2 = "abc"; 
        System.out.println(compressedStr(userIPStr1));
        System.out.println(compressedStr(userIPStr2));
    } 
    
    //time complexity O(n) not O(n^2) bcz i++ is occuring inside while loop
    public static String compressedStr(String str){
        StringBuilder sb = new StringBuilder("");
    
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            } 
        }
        return sb.toString();
    }
    
}
