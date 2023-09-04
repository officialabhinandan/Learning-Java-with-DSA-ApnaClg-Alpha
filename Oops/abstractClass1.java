package Oops;

abstract class Dept{
    void floor(){   // non abstract method
        System.out.println("Each dept has a dedicated floor in the building");
    }
    abstract void faculty(); // abstract method
} 

class Electronics extends Dept{
    void faculty(){   // must be overridden by the inherited class
       System.out.println("No of faculty 25");
    }
} 

class ComputerSC extends Dept{
    void faculty(){    //  must be overridden by the inherited class
        System.out.println("No of faculty 28");
    }
}