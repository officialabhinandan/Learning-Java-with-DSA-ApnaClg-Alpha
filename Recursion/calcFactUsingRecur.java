package Recursion;

public class calcFactUsingRecur {
    public static void main(String args[]){
        System.out.println("Calling using iterative method: " + IterationFactorial.ifact(5));   //as static method of the diff class : className.methodName(input);
        System.out.println("Calling using recursive method: " + RecursiveFactorial.rfact(5));   //as static method of the diff class : className.methodName(input);
    }
}

class IterationFactorial{    // Static method in different class
    static int ifact(int n){
        int fact = 1;
        for(int i=n; i>=1; i--){
            fact = fact * i;
        }
        return fact;
    }
}

class RecursiveFactorial{   // static method in defferent class 
    static int rfact(int m){
        if(m==0){
            return 1;
        }
        return m * rfact(m-1);
    }
}
