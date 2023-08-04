//For a given string convert each the first letter of the each word to UpperCase. 
//came in Trilogy Innovation Lab(Code Nation)
package Strings;

public class eachFirstLetterToUppercase {
    public static void main(String args[]){
        String userGivenStr = "my name is abhinandan mukherjee";
        System.out.println(flOfEachWrdUpperCase(userGivenStr));
    }
    //time complexity O(n);
    public static String flOfEachWrdUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        
        //logic for the first letter
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        //logic for rest of the part inlcuding last char
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        // String newStr = sb.toString();
        // return newStr;
        return sb.toString();  //directly retunring the string


    }
}
