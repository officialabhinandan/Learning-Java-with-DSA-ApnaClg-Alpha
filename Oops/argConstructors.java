package Oops;

class ByDebanjanSir4{
    int a;
    int n;
    float b;
    String c = "Hello";
    String s;

    ByDebanjanSir4(int num, int n, float marks, String s){
       a = num;
       this.n = n;
       b = marks - a;
       this.s = s;
    }
    public static void main(String args[]){
        ByDebanjanSir4 obj = new ByDebanjanSir4(10, 50, 40.50f, "Abhinandan");
        System.out.println(obj.a);
        System.out.println(obj.n);
        System.out.println(obj.b);
        System.out.println(obj.s);
        System.out.println(obj.c); 
    }
}
