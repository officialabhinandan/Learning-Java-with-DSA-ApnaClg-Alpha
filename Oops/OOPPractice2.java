package Oops;

class byDebanjanSir1{
    int a = 10;
    String s = "King";

    byDebanjanSir1(){
        System.out.println("This is a non argumented constructor");
    }

    void testMethod1(){
        System.out.println("Testing statement 1");
    }

    static void testMethod2(){
        System.out.println("Testing statement 2");
    }

    void add(int a, int b){
        int result = a + b;
        System.out.println(result);
    }

    int anotherAdd(int a, int b){
        return a + b;
    }
    public static void main(String args[]){
        System.out.println("Hello");
        //testMethod1(); //can't access directly
        testMethod2(); //static method
        //creating object of the class
        byDebanjanSir1 obj = new byDebanjanSir1();
        obj.testMethod1();
        obj.add(5, 10);
        System.out.println(obj.anotherAdd(10, 40));
        System.out.println("Before Update: " + obj.a);
        System.out.println("Before Update: " + obj.s);
        obj.a = 11;
        obj.s = "Queen";
        System.out.println("After Update: " + obj.a);
        System.out.println("After Update: " + obj.s);

    }
}
