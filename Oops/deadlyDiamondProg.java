package Oops;

public class deadlyDiamondProg {
    public static void main(String args[]){
    Demo10 d = new Demo10();
    d.m1();
    d.m2();
    d.m3();
    }
}

interface A{   // super interface
    void m1();
}

interface B extends A {   // sub interface
    void m2();
}

interface C extends A {   // sub interface
    void m3();
}

class Demo10 implements B, C{  // sub class : multiple inheritance
   
    public void m1(){
    System.out.println("Method 1");
   }

   public void m2(){
    System.out.println("Method 2");
   }

   public void m3(){
    System.out.println("Method 3");
   }
}
