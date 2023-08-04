package Operators;

public class aithmaticOP {
    public static void main(String args[]){

        //binary
        int a = 14;
        int b = 4;
        System.out.println("Addition = " + (a+b));
        System.out.println("Substraction = " + (a-b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("Division = " + (a/b));
        System.out.println("Remainder in division= " + (a%b));

        //Unary
        a++; //a = a + 1 ; value of a increments by 1 ; first use change later (post increment)
        b--; //b = b - 1 ; value of a decrements by 1 ; first use change later (post increment)
        System.out.println("The value of a after post increment: " + a);
        System.out.println("The value of b after post decrement: " + b);
        ++a; //a = a + 1 ; value of a increments by 1 ; first change use later (pre increment)
        --b; //b = b - 1 ; value of a decrements by 1 ; first change use later(pre increment)
        System.out.println("The value of a after pre increment: " + a);
        System.out.println("The value of b after pre decrement: " + b);

        
    }
    
}
