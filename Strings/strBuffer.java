package Strings;

public class strBuffer {
 public static void main(String args[]){
    StringBuffer sbf = new StringBuffer("");
    System.out.println("Default capacity of StringBuffer class is:  " + sbf.capacity()); //16 unless we set default capacity manually
    StringBuffer s = new StringBuffer(20); // setting default capacity 20 instead of 16 manually
    sbf.append("My name is Abhinandan Mukherjee");
    System.out.println("Length of the appended line is: " + sbf.length());  // length of My name is Abhinandan Mukherjee
    System.out.println("After append capacity will be default capacity + appended line's length = " + sbf.capacity()); // Updated capacity = (2*n + 2) where n = 16/default capacity
    System.out.println("Replacing Abhinandan with Kobinandan: " + sbf.replace(11, 21, "Abhi"));
    System.out.println("Again appned: " + sbf.append(" the Great"));
    System.out.println("Final Updated capacity: " + sbf.capacity());  // // Updated capacity = (2*n + 2) where n = 34/current capacity
    System.out.println("Reversed StringBuffer: " + sbf.reverse());
    
}
}
