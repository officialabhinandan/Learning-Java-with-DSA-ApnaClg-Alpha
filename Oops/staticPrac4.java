package Oops;

class ByDebanjanSir10 {  //This is an outer class

    //static member of the outer class
    static int a = 10;  
    //non staic member of the outer class
    int b = 20;
    //private static  variable of the outer class
    private static int pvt = 50;

    //inner class - static nested class
    static class StaticNested{
        void display(){

            //can access outer class static variable
            System.out.println("Outer class static variable is " + a);

            //can't access outer class instance variable -- gives error
            //System.out.println("Outer class instance variable is" + b);

            //can also access outer class private static variable
            System.out.println("Outer class private static variable is " + pvt);

        }
    }
}

class Demo4{
     public static void main(String agrs[]){
        
    // creating the object of the static nested class using outer class
    ByDebanjanSir10.StaticNested obj_staticNested = new ByDebanjanSir10.StaticNested();

    //creating the object of the outer class
    ByDebanjanSir10 obj_outer = new ByDebanjanSir10();

    //accessing the method inside static nested class using the object of static nested class
    obj_staticNested.display();

    //accessing the non-static instance method using the object of outer class
    System.out.println(obj_outer.b);
    }
    
}
