package ConditionalSTs;

public class ConditionalSTPrac {
    public static void main(String args[]){
        int age1 = 23;

        //if-else only
        if (age1>=18){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }
        
        int age2 = 14;
        //multiple if
         if (age2>=18){
            System.out.println("You are an adult.");
        }
        if (age2>=13 && age2<=18){
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are not an adult.");
        }

        //switch case statement
        int number = 3;
        switch(number){
            case 1: System.out.println("Samosa"); break;
            case 2: System.out.println("Jalebi"); break;
            case 3: System.out.println("Mango Shake"); break;
            default: System.out.println("Tea");


        }


    }
    
}
