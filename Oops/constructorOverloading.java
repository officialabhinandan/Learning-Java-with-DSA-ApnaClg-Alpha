//This is an example of constructor overloading. Constructor overloading is an example of Compile time/static polymorohism. 
package Oops;

class ByDebanjanSir5 {
    int num;
    String str;

    ByDebanjanSir5(){
        num = 5;
        System.out.println("Num = " + num);  
        System.out.println("Non argumented constructor");
    }
    ByDebanjanSir5(String str, int age){
        this.str = str;
        System.out.println("Argumented Constructor");
    }
    ByDebanjanSir5(String str, String a, String b){
       this.str = str;
       String aPlusb = a + b;
       System.out.println("a + b = " + aPlusb);
      //System.out.println(aPlusb);

    }
}
class Main{
    public static void main(String args[]){
        //creating an object of the ByDebanjanSir5 class and initializing with non argumented constructor
      ByDebanjanSir5 x = new ByDebanjanSir5();
      System.out.println("Calling x.num: " + x.num); //calling separately
        //creating an object of the ByDebanjanSir5 class and initializing with non argumented constructor
      ByDebanjanSir5 y = new ByDebanjanSir5("Abhinandan", 22);
      System.out.println("Calling y.str: " + y.str);

      System.out.println("Calling x.str: " + x.str); //didn't assigned any value the non arg constructor.

       //again creating an object of the ByDebanjanSir5 class and initializing with non argumented constructor
      ByDebanjanSir5 z = new ByDebanjanSir5("India", "Jai", "Hind");
      System.out.println("Calling z.str: " + z.str);
    }
}
