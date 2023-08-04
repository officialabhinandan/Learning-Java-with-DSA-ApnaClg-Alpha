package Strings;

public class strBuilder {
    public static void main(String args[]){
        StringBuilder sbl = new StringBuilder("");
        System.out.println("Deafult capacity of a StringBuilder is: " + sbl.capacity());
        for(char ch='a'; ch<='z'; ch++){
            sbl.append(ch);  //prints a to z
        }
        System.out.println(sbl);
        //total number of iterations = 26. Time complexity O(26) orO(n) where n = 26
        System.out.println("After append now capacity is: " + sbl.capacity());  // Updated capacity = (2*n + 2) where n = 16/default capacity
    }
}
