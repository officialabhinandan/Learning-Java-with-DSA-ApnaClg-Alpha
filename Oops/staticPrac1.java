package Oops;

class ByDebanjanSir7 {

    //static variable
    static int a = 10;

    //static block - invokes before main
    static {
        System.out.println("This is a static block. It is automatically executed before the main method. No need to call it separately.");
        int b = 50;
        System.out.println("The value b declared inside static block is " + b);
    }

    //static method
    static int calculateLargest(int a, int b){
        return Math.max(a, b);
    }

    //main nethod -- always public and static and void
    public static void main(String args[]){

    //within same class(ByDebanjanSir7)
       System.out.println("a = " + a);
       System.out.println("The largest number is: " + calculateLargest(19, 23));

    // within different class(DiffClass1) -- that's why className before static membr is required but object creation is still not required
      System.out.println("a = " + DiffClass1.a);
      System.out.println("The largest number is: " + DiffClass1.calculateSmallest(19, 23)); 
    }


}

class DiffClass1{
    //static variable
    static int a = 15;

    //static block - invokes before main
    static {
        System.out.println("This is a static block inside Diffclass1 class. It is automatically executed before the main method. No need to call it separately.");
        int b = 55;
        System.out.println("The value b declared inside static block of DiffClass1 class is " + b);
    }

    //static method
    static int calculateSmallest(int a, int b){
        return Math.min(a, b);
    }

}
