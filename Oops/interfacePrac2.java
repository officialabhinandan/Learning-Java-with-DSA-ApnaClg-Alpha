// Example of multiple inhertance using interface.
package Oops;

public class interfacePrac2 {
    public static void main(String args[]){
        Kolkata city = new Kolkata();
        city.airPollution();  // method of interface Delhi
        city.trafficJam();    // method of interface Mumbai
        city.culture();       // method of class Kolkata
    }
}

// interface 1
interface Delhi{
    void airPollution(); // public and abstract by default
}

// interface 2
interface Mumbai{
    void trafficJam(); // public and abstract by default
}

// sub class
class Kolkata implements Delhi, Mumbai{
    public void airPollution(){
        System.out.println("Kolkata also has air pollution");
    }
    public void trafficJam(){
        System.out.println("kolkata also has traffic jam");
    }
    void culture(){
        System.out.println("Cultural capital of India");
    }
}
