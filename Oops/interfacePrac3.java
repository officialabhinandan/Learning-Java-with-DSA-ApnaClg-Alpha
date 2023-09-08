// One interface inheritting another interface.
package Oops;

public class interfacePrac3 {
    public static void main(String args[]){
    Greet ob = new Greet();
    ob.msg1();
    ob.msg2();
    ob.msg3();
    }
}

interface HelloBhaii{  // suepr interface
    void msg1();
}
interface HiiBhaii extends HelloBhaii{   // sub interface
    void msg2();
}
class Greet implements HiiBhaii{
    public void msg1(){
        System.out.println("Say Hello everyone");
    }
    public void msg2(){
        System.out.println("Say Hii everyone");
    }
    void msg3(){
        System.out.println("Say Bye everyone");
    }
}

