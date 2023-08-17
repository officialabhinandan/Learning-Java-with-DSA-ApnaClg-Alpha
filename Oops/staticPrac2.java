package Oops;

class ByDebanjanSir8 {
static int a;// static or class variable
int x;//instance variable
static //static block
{
a=24;
System.out.println("Inside static block a ="+a);
}
ByDebanjanSir8()// non argument or default constructor
{
x=7;
System.out.println("constructor of class A x = "+ x);
}
static void msg() // static method
{
System.out.println("Inside Static method");
}
{  //
    System.out.println("This is an instace initialization block, invokes before constructor at the time object creation (if present then)");
}
}
class Demo2{
static void add(int n1, int n2){
    System.out.println("The static method inside Demo2 class performing addition. The o/p = " + (n1+n2));
}
public static void main(String args[])
{
ByDebanjanSir8 m=new ByDebanjanSir8();  //constructor will be automatically invoked for object m 
ByDebanjanSir8 n=new ByDebanjanSir8();  //again constructor will be automatically invoked for object n 

System.out.println("From class A a= "+ ByDebanjanSir8.a);
// if we access static member like instance member(by creating object) that won't be wrong but that is unnecessary and illogical
m.a = 15;  //updating the value of a using m object
System.out.println("From class A a= " + n.a); //here the updated value will be reflected as static member only have one copy unlike instance members.
ByDebanjanSir8.msg();
add(12, 4); // class name doesn't required, as the method is situated inside the same class.
}
}
