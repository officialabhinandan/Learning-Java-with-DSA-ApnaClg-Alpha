package Strings;
import java.util.StringTokenizer;

public class splitStr {
    public static void main(String[] args){
    int i=1;
    String str = "My name is Abhinandan Mukherjee";
    String str2 = "My name is Abhinandan Mukherjee";

    //1st method using StringTokenizer class
    StringTokenizer tr = new StringTokenizer(str, " ");
        while(tr.hasMoreTokens()){ //hasMoreTokens is a method under StringTokenizer which rotates the loop again again untill we move to the last token
        System.out.println("Token " + i + ": " + tr.nextToken()); //nextToken is a method under StringTokenizer which prints the nextToken
        i++;
        }

    //2nd method split method
    String arr[] = str.split(" "); //spliting the string and putting every part inside an array of String type named arr[] 
    for(String token : arr){  //for each loop 
        System.out.println(token);
    }
    String arr2[] = str2.split("a", 3); // it will split from the a in 3 substrings. 
     for(String token : arr2){  //for each loop 
        System.out.println(token);
    }

    
}
}
