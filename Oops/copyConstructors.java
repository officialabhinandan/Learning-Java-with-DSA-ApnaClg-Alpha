package Oops;

class ByDebanjanSir6 {
    String name;
    int age;

    //original constructor
    ByDebanjanSir6(int age, String name){
      this.name = name;
      this.age = age;
    }

    //copy constructor
    ByDebanjanSir6(ByDebanjanSir6 x){
      this.name = x.name;
      this.age = x.age;
    }

    public static void main(String args[]){

        //creating object using original constructor
        ByDebanjanSir6 x = new ByDebanjanSir6(25, "Rohit");

        //creating object using copy constructor
        ByDebanjanSir6 y = new ByDebanjanSir6(x);

        System.out.println("Name: " + x.name + ", age: " + x.age);  //object of original constructor
        System.out.println("Name: " + y.name + ", age: " + y.age);  //object of copy constructor

    }
}
