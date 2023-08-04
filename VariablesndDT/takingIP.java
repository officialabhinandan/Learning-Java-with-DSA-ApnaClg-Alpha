package VariablesndDT;
/*  To take user input we use next/nextLne/nextInt/nextFloat/nextDouble/nextBoolean/nextShort/nextLong */

import java.util.Scanner;

public class takingIP {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       // Scanner sc2 = new Scanner(System.in);
       // Scanner sc3 = new Scanner(System.in);
       // Scanner sc4 = new Scanner(System.in);
        String name = sc.next(); //next can only take one single word as i/p, bcz it ignore everything after reaching to space
       System.out.println("The name entered by the user is: " + name);
       sc.nextLine(); //If nextLine() comes after any other next....() method it ignores it and control jumps over the next line. This is a limitation of scanner class. To overcome this either we add an addition nextLine() like this line of we use Buffer reader class(readLine() instead of nextLine()). For more info Debanjan's Sir Java playlist bufferreader video.
       String fullName = sc.nextLine(); //if we would use sc.next(), it will only take name but won't take the surname. That's why we use sc.nextLine()
       System.out.println("The fullname is: " + fullName);
       int num = sc.nextInt();
       System.out.println("The input number is: " + num);
       float price = sc.nextFloat();
       System.out.println("The float price is: " + price);


      
      sc.close();
    //   sc2.close();
    //   sc3.close();
    //   sc4.close();
    }
    
}
