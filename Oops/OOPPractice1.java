package Oops;

public class OOPPractice1 {
    public static void main(String args[]){
        Pen p1 = new Pen(); //making objects of Pen class where all the proparties of the Pen class will be stored and accessed.
        // Pen classname, p1 reference variable, new is a keyword to store new space in the memory and Pen() is a constructor.
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("red"); //updating the color to red by calling the function
        System.out.println(p1.color);
        p1.color = "black"; // we can also update the color by just calling the class variable/attribute
        System.out.println(p1.color);
        //System.out.println(p1.color = "black"); // or we can also write line 13 and 14 in a single line like line 15
    }
    
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int rollNo;
    float percentage;

    void calculatePercentage(int math, int phy, int chem){
        percentage = (phy + chem + math)/3;
    }
}