package Oops;

import javax.swing.plaf.synth.SynthScrollBarUI;

final class X{
    void msg1(){
        System.out.println("This class can't be inherited");
    }
}
/* 
class Y extends X{  // Can't be inherited by other classes
    
} */
class Hello{
    final int a = 10; // thew value of this variable turns into a constant. That means can't be changes or overridden later
    final void msg2(){
        System.out.println("This method is a final method so can't be overridden");
    }
    // a = 5; Can't be changes now.
}
class Demo7{
    public static void main(String args[]){
    X x = new X();
    x.msg1(); // normal object calling is possible but can't inherit
    }
    Hello h = new Hello();
    //h.msg2(); // Can't override a final method
    //h.a = 15;
    

}
