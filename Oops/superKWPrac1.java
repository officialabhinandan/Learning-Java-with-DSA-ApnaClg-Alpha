package Oops;

class OOPLang{    // Parent class
    int demoVal = 10;
    int a;
    OOPLang(int a){
        this.a = a;
        System.out.println("Construtor of the OOPLang(Super) class");
    }
    void characteristics(){
        System.out.println("A OOP has 4 charactertistics. Abstraction, Encapsulation, Inheritance and Polymorphism");
    }
}

class Javalang extends OOPLang{      // Child class
    int demoVal = 18;
    int a = 30;
    Javalang(){
        super(20);
        System.out.println("Constructor of the JavaLang(Sub) class");
    }
    void characteristics(){
        System.out.println("Java also has these 4 charactertistics.");
        // a = 30, // also possible
    }

    //only super works if we call inside the child class
    void display(){

        System.out.println("Calls the demo value of the sub-class: " + demoVal); // sub class's demoVal
        System.out.println("Calls the demo value of the super-class: " + super.demoVal);  // super class's demoVal
        characteristics();  // calls the method of the sub class
        super.characteristics(); // calls the method of the super class

        System.out.println("Calls the vaue of a mentioned in the super class: " + super.a);
        System.out.println("Calls the value of the a mentioned in the sub class: " + a);


    } 
}
 
class Demo6{     // Another class where we creating the object of child class
    public static void main(String args[]){
        Javalang ob = new Javalang();
         ob.display();
        
    }
}  
