package Strings;

import java.util.Scanner;

public class strIntro {
    public static void main(String args[]){
         char ch[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";   //method 1 : see theory.txt
        String s = new String("pqrs");  //method 2 : see theory.txt

        //taking a string input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name:- ");
        String name = sc.next();  //it can only take a single word as n input. It doesn't consider after space. That's why we use nextLine() method
        System.out.println(name);
        sc.nextLine();  // to avoid the skipping of nextLine method by the console. We can also overcome this problem by taking i/p using bufferReader class(sc.readLine() in that case) 
        System.out.println("Enter your full name:- ");
        String fullName = sc.nextLine(); 
        System.out.println(fullName);
        System.out.println(fullName.length()); //here length is a method, not a keyword like array
        
        //string contatenation
        String firstName = "Abhinandan";
        String lastName = "Mukherjee";
        String totalName = firstName + " " + lastName; //contatenation performed using + operator
        System.out.println(totalName);

        //string charAt method:-
        System.out.println("0th index of string totalName is: " + totalName.charAt(0));
        System.out.println("1st index of string fulName is: " + fullName.charAt(1));
        sc.close();
        printChars(fullName);

        //substring method
        System.out.println("printing substring: " + firstName.substring(0, 4));
    }
    //method to traverse through the string and print individual characters 
    public static void printChars(String str){
        System.out.println("Printing the " + str + " string:- ");
        for(int i=0; i<str.length(); i++){
          System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    
}
