package VariablesndDT;
/*Java is a typed language. That means we need to declare the type before making the variable.
 C++ and Python are also typed. But JavaScript isn't a typed language. Java is a very strict language.
 Types of data types are there 1) Premitive/Primary : byte[1 byte; -128 to 127], short[2 bytes], char[2 bytes], boolean[1 byte], int[4 byte], float[4 bytes], long[8 bytes], double[8 bytes].
 2) Non-premitive/Secondary: Array, String, Class, Object, Interface.
 */

public class dataTypes {
    public static void main(String args[]) {

        // premitive data types:-
        byte b = 8; // upto 256 bytes
        System.out.println(b);
        char ch1 = 'A';
        char ch2 = 'm';
        System.out.println(ch1);
        System.out.println(ch2);
        boolean var1 = false;
        boolean var2 = true;
        float price = (float) 1.2;
        int num = 60;
        short n = 540;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(price);
        System.out.println(num);
        System.out.println(n);
        // long : for very large value integer
        // double : for very large value of float

        /*
         * Spaces in a computer memory is represented by bytes, 1 bytes = 8bits, Single
         * information either 0 or 1.
         */

    }

}
