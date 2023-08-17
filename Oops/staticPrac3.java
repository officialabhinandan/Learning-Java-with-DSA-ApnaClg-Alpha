package Oops;


class ByDebanjanSir9 {
    static int a = 10;
    int b = 50;
    //a program can have mutiple static block and they are invoked asper their appearence or serial number
    static {
     System.out.println("First static block invoked");
    }
    static{
     System.out.println("Second static block invoked");
    }
    //This is invoked at the time of object creation but before constructor if present
    {
        System.out.println("Instance initialization block invoked");
    }
    //This is invoked at the time of object creation but after instance initialization block if present
    ByDebanjanSir9(){
        System.out.println("Non argumented constructor");
    }
    static void msg(){
        System.out.println("This is a static method without any formal args");
    }
    static void msg(int a, int b){
        System.out.println("This is a overloaded static method with two formal args");
        System.out.println("a = " + a + ", " + "b = " + b);
    }

    class Demo3{
        public static void main(String args[]){
        ByDebanjanSir9 obj1 = new ByDebanjanSir9(); //1st obj created
        ByDebanjanSir9 obj2 = new ByDebanjanSir9(); //2nd obj created
        System.out.println(obj1.a); // printing the declared value of the static variable
        System.out.println(obj1.b); // printing the declared value of the instance variable
        obj1.a = 15; //updating the static variable using obj1
        obj1.b = 55; //updating the instance variable using obj1
        System.out.println(obj2.a); // printing the updated value of the static variable. Although the value remains unchanged due to static variable(Single copy shared by all objects)
        System.out.println(obj2.b); // printing the updated value of the instance variable. The value is changed due to updation (In case of instance variable diff copy is created for each object created)
        ByDebanjanSir9.msg();
        ByDebanjanSir9.msg(12, 10); 
        }
    }


    
}
