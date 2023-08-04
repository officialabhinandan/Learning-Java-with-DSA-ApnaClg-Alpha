package Operators;

public class logicalOP {
    public static void main(String args[]){

        //logical AND
        System.out.println((3>2) && (5>2)); //true
         System.out.println((3>2) && (5<2)); //false

        //logical OR
        System.out.println((3>2) || (5>2)); //true
        System.out.println((3>2) || (5<2)); //false

        //logical NOT(NOT Operator)
        System.out.println((5>2)); //without NOT operator; returns true
        System.out.println(!(5>2)); //with NOT Operator; returns false



    }
    
}
