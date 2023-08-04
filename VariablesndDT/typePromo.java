package VariablesndDT;

public class typePromo {
    public static void main(String args[]){
        char a = 'a'; //converts into integer
        char b = 'b'; //converts into integer
        //char c =(char) (a + b);
        System.out.println((int) a);
         System.out.println((int) b);
          System.out.println(a);
         System.out.println(b);
        System.out.println(b-a);
       // System.out.println(c);

       short s = 5;
       byte bi = 51;
       char chh = 's';
       byte bt = (byte) (s + bi + chh);
       System.out.println(bt);

       int iv = 4;
       float fv = 5.4f;
       long lv = 45;
       double dv = 45.12;
       double ans = iv + fv + lv + dv; // all data types will be converted into double as double is largest possible data type available here.
       System.out.println("The ans is: " + ans);
       int intAns = (int) ans; //lossy convertion
       System.out.println("The integer value derived from double value after loss is: " + intAns);

       byte bb = 5;
      // byte aa = (bb * 2); //throws error bcz conversion of int to byte not allowed
        byte aa = (byte) (bb * 2);
        System.out.println(aa);



       
    }
    
}
