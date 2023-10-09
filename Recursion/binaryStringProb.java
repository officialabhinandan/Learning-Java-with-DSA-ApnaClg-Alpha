// Binary String Problem: Print all binary strings of size N without consecutive 1s.
// Came in Paytm interview.
package Recursion;

public class binaryStringProb {
    public static void main(String args[]){
        printBinaryStr(3, /*new StringBuilder("")*/ " ", 0);
    }
    public static void printBinaryStr(int n, /*StringBuilder newSB*/ String newStr, int lastPlace){
        // base case 
        if(n == 0){
            System.out.println(newStr);  // when n is reduced to 0, the value present in the StringBuilder will be printed.
            return;
        }
        // logic
        /* 
        if(lastPlace == 0){  // If there is 0 in the lastPlace we can put 1 or 0 both, but if there is 1, we can't put another 1.
           //newSB.append("0");
           printBinaryStr(n-1, newSB.append("0"), 0);
           printBinaryStr(n-1, newSB.append("1"), 1);
        } else {   // when, lastplace == 1
            printBinaryStr(n-1, newSB.append("0"), 0); 
        }
        */
        // or we can also write in this ways 
        printBinaryStr(n-1, newStr+"0", 0);  // wheather lastPlace is 0 or 1, we always write it, so writing outside if-else loop
        if(lastPlace == 0){
             printBinaryStr(n-1, newStr+"1", 1);
        }
    }
}
