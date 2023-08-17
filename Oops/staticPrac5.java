package Oops;

class ByDebanjanSir11 {  //This is an outer class

    //static member of the outer class
    static int a = 10;  
    //satic member of the inner class
    int b = 20;
    //private static  variable of the outer class
    private static int pvt = 50;

    //inner class - static nested class
    class InnerClass{
        void display(){

            //can access outer class static variable
            System.out.println("Outer class static variable is " + a);

            //can access outer class instance variable --doen't give error
            System.out.println("Outer class instance variable is " + b);

            //can also access outer class private static variable
            System.out.println("Outer class private static variable is " + pvt);

        }
    }
}

class Demo5{
     public static void main(String agrs[]){
     
        /* 
    // creating the object of the static nested class using outer class
    ByDebanjanSir11.StaticNested obj_staticNested = new ByDebanjanSir11.StaticNested();

    //creating the object of the outer class
    ByDebanjanSir11 obj_outer = new ByDebanjanSir11();

    //accessing the method inside static nested class using the object of static nested class
    obj_staticNested.display();

    //accessing the non-static instance method using the object of outer class
    System.out.println(obj_outer.b);
    */
    //creating the object of the non static inner class(First creating the ob of the outer class and then creating the ob of the inner class using the outer class)
    ByDebanjanSir11 obj_Outer = new ByDebanjanSir11();
    ByDebanjanSir11.InnerClass obj_Inner = obj_Outer.new InnerClass();

    //accessing the method inside the inner class using the object of the inner class
    obj_Inner.display();

    }
    
}

