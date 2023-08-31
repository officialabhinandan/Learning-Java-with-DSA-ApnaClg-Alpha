package Oops;

public class constPrac2 {
    public static void main(String args[]) {
        // creating object for student 1
        Student2 s1 = new Student2();
        s1.name = "Modi";
        s1.rollNum = 01;
        s1.passWord = "abcd";

        // storing the values for student 1
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 98;

        // printing the values for student 1
        System.out.println("For student 1");
        for(int i=0; i<3; i++){
           System.out.println(s1.marks[i]);
        }

        // creating object for student 2 and storing all the proparties of student 1
        Student2 s2 = new Student2(s1);
        s2.passWord = "hello";
        s2.marks[0] = 87;

        //printing for student 2
        System.out.println("For student 2");
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student2 {
    String name;
    int rollNum;
    String passWord;
    int marks[];

    // original constructor
    Student2() {
        System.out.println("Original constructor called.....");
        marks = new int[3];
    }

    // copy constructor - shallow copy constructor
    Student2(Student2 s1) {
        this.name = s1.name;
        this.rollNum = s1.rollNum;
        this.marks = s1.marks; // the reference of the marks array is copied in the copy constructor for
                               // student 2. Npt the full array. So if we edit in the array the same change
                               // will be reflected here. That's why it's called shallow copy, not deep copy.
        System.out.println("Copy constructor called......");
    }

    // copy constructor - deep copy constructor
    /* Student2(Student2 s1){
       this.name = s1.name;
       this.rollNum = s1.rollNum;
       for(int i=0; i<3; i++){
         this.marks[i] = s1.marks[i];   // here the marks will remain unchanged.
       } */
    }
}
