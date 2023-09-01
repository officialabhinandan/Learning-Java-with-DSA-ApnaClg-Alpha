// Hierrarchial inheritance
package Oops;

public class inheritPrac3 {

    public static void main(String args[]){

    // For BMW Cars,
    BMW b = new BMW();
    System.out.println("The Country of origin of BMW is " + b.country);
    System.out.println("The speed of a BMW car is " + b.quality);
    System.out.println("The speed of a BMW car is " + b.speed);
    b.model();

    // For Audi Cars, 
    Audi a = new Audi();
    System.out.println("The Country of origin of Audi is " + a.country);  
    System.out.println("The speed of a Audi car is " + a.quality);
    System.out.println("The speed of a Audi car is " + a.speed);
    a.model();

    // For Mercedes-Benz class,
    MercedesBez m = new MercedesBez();
    System.out.println("The Country of origin of Mercedes-Benz is " + m.country);
    System.out.println("The speed of a Mercedes-Benz car is " + m.quality);
    System.out.println("The speed of a Mercedes-Benz car is " + m.speed);
    m.model();

    }
}

// parent class or base class
class GermanCars{
    String country = "Germany";
    String quality = "premium";
    int speed = 200;
}

//independent child class 1 inherits parent class (can only redefine parent class)
class BMW extends GermanCars{
    String owner = "BMW Group";
    void model(){
        System.out.println("BMW X7");
    }
}

//independent child class 2 inherits parent class (can only redefine parent class)
class Audi extends GermanCars{
     String owner = "Volkswagen Group";
     void model(){
        System.out.println("Audi Q8");
     }
}

//independent child class 3 inherits parent class (can only redefine parent class)
class MercedesBez extends GermanCars{
     String owner = "Mercedes-Benz Group";
     void model(){
        System.out.println("GLS Maybach");
     }
}
