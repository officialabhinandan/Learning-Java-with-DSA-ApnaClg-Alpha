// Online IDE - Code Editor, Compiler, Interpreter
/* 
type 1: aabbbccccdee
type 2: a2b3c4d1e2
You can also access the code here: https://www.online-ide.com/xNLBws6T5p
*/

package Strings;
class MoyeMoye
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        String str1 = "aabbbccccdee"; // type 1
        String str2 = "a2b3c4d1e2";  // type 2
        System.out.println("From type 1 to type 2: " + str1TOstr2(str1));
        System.out.println("From type 2 to type 1: " + str2TOstr1(str2));
    }
    
    public static String str1TOstr2(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            int count = 1; // per character freq counter
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>0){
                sb.append(count);
            }
        }
        return sb.toString();  // converting StringBuilder to String
    }
    
     public static String str2TOstr1(String str){
         StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length()-1; i=i+2){
            //char ch = ' ';
            //int n = 0;
             char ch = str.charAt(i);
             int n = Character.getNumericValue(str.charAt(i+1));
             //sb.append(ch);
             while(n>0){
                 sb.append(ch);
                 n--;
             }
           }
           return sb.toString();
     }
}
