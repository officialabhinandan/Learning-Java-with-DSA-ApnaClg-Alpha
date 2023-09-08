package Oops;

abstract class Dept{
    int number = 23;

    Dept(){
        System.out.println("Construtor of the Dept class called......");
    }

    void floor(){   // non abstract method
        System.out.println("Each dept has a dedicated floor in the building");
    }
    abstract void faculty(); // abstract method
} 

class Electronics extends Dept{
    // int number = 24;
    int number = super.number;
    
    Electronics(){
        System.out.println("Constructor of the Electronics class called....");
    }

    void faculty(){   // must be overridden by the inherited class
       System.out.println("No of faculty 25");
    }
} 

class ComputerSC extends Dept{
    int number = 25;

    ComputerSC(){
        System.out.println("Constructor of the ComputerSC class called.......");
    }

    void faculty(){    //  must be overridden by the inherited class
        System.out.println("No of faculty 28");
    }
}
class Demo8{
    public static void main(String args[]){
        // no need to override floor() methpod by sub classes as it is a non-abstract class. 
        // creating the object of Electronics class
        Electronics ec = new Electronics();
        ec.faculty();
        ec.floor(); // accessing the non-abstrct method of the super class using the object of the sub class.
        System.out.println(ec.number);

        // creating the object of ComputerSC class
        ComputerSC cs = new ComputerSC();
        cs.faculty();
        cs.floor();  // accessing the non-abstract method of the super class using the object of the sub class.
        System.out.println(cs.number);
    }
   
}