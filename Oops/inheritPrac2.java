// Example of multi level inheritance.
package Oops;

public class inheritPrac2 {
    public static void main(String args[]){
        EVs Nexon = new EVs();
        Nexon.registration();
        Nexon.insurance();
        Nexon.speed = 120;
        System.out.println("The speed is " + Nexon.speed);
        Nexon.charging();

    }
    
}
class Vehicles{
    int speed;
    void registration(){
        System.out.println("It requires registration at the nearest RTO.");
    }
    void maintenance(){
        System.out.println("It requires maintenance.");
    }
}

class Cars extends Vehicles{
    int speed;
    void insurance(){
        System.out.println("It requires car insurance for protection");
    }
}
class EVs extends Cars{
    void charging(){
        System.out.println("Need to charge at the nearest charging point");
    }
}
