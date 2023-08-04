package Arrays;
import java.util.Scanner;

public class arrayPrac {
    public static void main(String args[]){
        int[] arr = new int[20];
        int numbers[] = {1, 2, 3};
        int moreNumbers[] = {4, 5, 6};
        String fruits[] = {"Apple", "Orange", "Mango"};

        //taking input in an array
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math

        System.out.println("Phy: " + marks[0]);
        System.out.println("Chem: " + marks[1]);
        System.out.println("Math: " + marks[2]);

        marks[2] = 100; //update
        System.out.println("Math(Updated): " + marks[2]);
        marks[1] = marks[1] + 1;
        System.out.println("Chem(Updated): " + marks[1]);

        int percentage = (marks[0] +marks[1] + marks[2]) / 3;
        System.out.println("Percentage =  " + percentage + "%");
        System.out.println("The lenght of marks array is: " + marks.length); //.length is a dot operator
        sc.close();

    }
}
