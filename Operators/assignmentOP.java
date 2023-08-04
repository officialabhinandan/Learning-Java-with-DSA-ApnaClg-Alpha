package Operators;

public class assignmentOP {
    public static void main(String args[]){
        int a = 5 ;
        int b = 10;
        a = b; // b's value is stored in a ; left to right assignment happens
        System.out.println(a);

         a += 5; // a = a + 5
         b -= 5;// b = b - 5
        System.out.println(a);
        System.out.println(b);

        a /= 5; // a = a / 5
        b *= 5; // b = b * 5
        System.out.println(a);
        System.out.println(b);

        b %= 5;// b = b % 5
        System.out.println(b);



    }
}
