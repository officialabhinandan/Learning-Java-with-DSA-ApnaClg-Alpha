// Example of single level inheritance.
package Oops;

public class inheritPrac1 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();  // inheriting and access of the parent class by creating the object of the base class. (but it's opposote is not possible)
    }
}

// Base or Parent class
class Animal{
  String color;

  void eat(){
    System.out.println("it eats.");
  }
  void breathe(){
    System.out.println("It breathes.");
  }
}

// Derived or Child class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("It swims in the water.");
    }
}
