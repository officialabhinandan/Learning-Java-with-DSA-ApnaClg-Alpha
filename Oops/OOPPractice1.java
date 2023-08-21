package Oops;

public class OOPPractice1 {
    public static void main(String args[]){
        Pen p1 = new Pen(); //making objects of Pen class where all the proparties of the Pen class will be stored and accessed.
        // Pen classname, p1 reference variable, new is a keyword to store new space in the memory and Pen() is a constructor.
        p1.setColor("blue");
        System.out.println("The colour of the ink we set " + p1.getColor());
        //System.out.println(p1.color); //can't access directly as they are private
        p1.setTip(5);
        //System.out.println(p1.tip);  //can't access directly as they are private
        System.out.println("The tip size we set is " + p1.getTip()); // so we have to access in this way

        p1.setColor("red"); //updating the color to red by calling the function
        //System.out.println(p1.color);  //can't access directly as they are private
        System.out.println("The colour of the ink we set " + p1.getColor()); // so we have to access in this way
       // p1.color = "black"; // we can also update the color by just calling the class variable/attribute unless they are private
       // System.out.println(p1.color);
        p1.setColor("black");
        //System.out.println(p1.color = "black"); // or we can also write line 13 and 14 in a single line like line 15
        p1.setTip(1);
        System.out.println("The tip size we set is " + p1.getTip());

        Student s1 = new Student(); // object created for Student class and default constructor is invoked.
        //System.out.println(s1.calculatePercentage(82, 81, 83));
        s1.calculatePercentage(90, 91, 92);
        
        //trying to access the attributes and behaviors of the BankAccount class by creating its object names myAcc
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Abhinandan2023";
       // myAcc.passWord = "ab1234560" ; // not possible as passWord is intentionally made private due to security purposes
       // rather we can do it in this way
       myAcc.setPassword("abhd458@4");
       System.out.println("The password we set is " + myAcc.getPassword());


    }
    
}
class BankAccount{
    public String userName;
    private String passWord;

    public void setPassword(String pwd){
        passWord = pwd; // this.passWord isn't required as passWord(instance variable) and pwd(local variable) are differnet
    }
    String getPassword(){
        return passWord;
    }
}
class Pen{
    private String color;  // can't be accessed directly by creating the object of Pen class
    private int tip;       // ,,    ,,         ,,         ,,         ,,        ,,

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}
class Student{
    String name;
    int rollNo;
    float percentage;

    void calculatePercentage(int math, int phy, int chem){
       percentage = (phy + chem + math)/3;
      //return percentage;
      System.out.println("The avg is " + percentage);
    }
}