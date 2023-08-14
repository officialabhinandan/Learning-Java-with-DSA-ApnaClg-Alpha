package Oops;
//example of method overloading which is itself an example of compile time polymorohism or static polymorohism

class ByDebanjanSir2 {
    int add(int a, int b){
      return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    float add(int a, float b){
        return a + b;
    }

    double add(double a, int b){
        return a + b;
    }

    long add(long a, long b){
        return a + b;
    } 

    String add(String name, int age){
      return name + age;
    }

    ByDebanjanSir2(){
        System.out.println("Constructor used and called just for testing purpose."); 
        //Although wrote in the last line but will be called at first at the time making the object. As JRE automatically invokes the constructor at the time of obj creation.
    }
    public static void main(String args[]){
        ByDebanjanSir2 ob = new ByDebanjanSir2(); //constructor will be called here.
        System.out.println("Printing Outputs:- ");
        System.out.println(ob.add(7, 2));
        System.out.println(ob.add(6, 3, 1));
        System.out.println(ob.add(10, 12.5f));
        System.out.println(ob.add(130.25, 7));
        System.out.println(ob.add(20000, 70000));
        System.out.println(ob.add("Abhinandan", 22));
    }
}
