package Oops;

class Parent{  // super class or base class or parent class
    int n = 4;
    void msg(){
        System.out.println("Method of super class");
    }
}

class Child extends Parent{  // sub class or inherited class or child class
    int n = 8;
    void msg(){
        System.out.println("Method of sub class");
    }
}

class Demo{
    public static void main(String args[]){
      Parent p = new Child(); // creating the object of child class using the reference variable of the parent class.
      p.msg();  // refers to the method of the sub class (overridden method)
      System.out.println("Calling the super's version: " + p.n); //  refers to the version of super class.
    }
}
