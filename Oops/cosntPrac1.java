package Oops;

public class cosntPrac1 {
   public static void main(String args[]) {
      System.out.println("This is the concept of constructor overloading which is also an example of Compile time/static polymorphism.");
      Student1 s1 = new Student1();
      Student1 s2 = new Student1("Rahul", 01);
      Student1 s3 = new Student1("Sonia", 02);
      Student1 s4 = new Student1("Priyanka");
      Student1 s5 = new Student1(4);


      // for student 1
      System.out.println(s1.name); // prints null bcz no value was assigned for name
      System.out.println(s1.rollNo); //   ,,          ,,              ,,     for rollNo;

      // for student 2
      System.out.println(s2.name);
      System.out.println(s2.rollNo);

      // for student 4
      System.out.println(s3.name);
      System.out.println(s3.rollNo);

      // for student 4
      System.out.println(s4.name);

      // for student 5
      System.out.println(s5.rollNo);

      // calling the demo method
      s1.demoMethod();
      s2.demoMethod();
      s3.demoMethod();
      s4.demoMethod();
      s5.demoMethod();
      

      
   }

}

class Student1 {
   String name;
   int rollNo;

   Student1(){
      System.out.println("Non argumented constructor called.......");
   }

   // Student1(){   // will give eror unless we create a separate object for it
   //    System.out.println("another non argumented constructor called.......");
   // }

   Student1(String name, int rollNo) {
      // In case local variables(n, rn) and instance variables(name, rollNo) are same;
      this.name = name;
      this.rollNo = rollNo;
      // name = n;
      // rollNo = rn;
      System.out.println("Argumented constructor with name and roll called.......");
   }

   Student1(String nm){
      name = nm;
      System.out.println("Argumented constructor with only name called.......");
   }

   Student1(int rn){
      rollNo = rn;
      System.out.println("Argumented constructor with only roll no called.......");
   }
   void demoMethod(){
      System.out.println("This is a demo method......");
   }

}
