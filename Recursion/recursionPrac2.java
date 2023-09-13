// Printing the increasing number from 1 upto n;
package Recursion;


public class recursionPrac2 {
   public static void main(String args[]){
         recursionPrac2 ob = new recursionPrac2();
        ob.printIncNum(10);
   }
   void printIncNum(int n){
    if(n == 1){
        System.out.println(1);
        return;
    }
    printIncNum(n-1);
    System.out.println(n);

   }    
}

