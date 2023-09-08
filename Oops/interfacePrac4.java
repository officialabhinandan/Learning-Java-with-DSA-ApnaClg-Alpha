// Example : Why interface does not support 100% abstraction after Java version 8 and 9.
package Oops;

interface Pro{
    public void m1();
    default void m2(){   // After Java version 8 we can make a method default and implement inside an interface.
        System.out.println("This is a demo msg of Pro interface");
    }
    static void m3(){    // After Java version 8 we can make a method static and implement inside an interface.
        System.out.println("This is a static message");
    }
    private void m4(){    // After Java version 9 we can make a mathod private and implement inside an interface
        System.out.println("This is a private method");
    }
}

class Max implements Pro{
    public void m1(){
        System.out.println("This is a method m1");
    }
    public void m2(){
        System.out.println("This is a demo msg of Max class");
    }
    void m5(){
        System.out.println("This is apna method");
    }
}

class Demo9{
    public static void main(String args[]){
       Max ob = new Max();
       ob.m1();
       ob.m2();
       Pro.m3();  // static method
       //ob.m4();  // private method, so can't access 
       ob.m5();
    }
}