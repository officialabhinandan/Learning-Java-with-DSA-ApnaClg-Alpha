/* 
* Coding Question  :

Aman, who is working at a software company forgot the password of his LinkedIn
Account. But he knows the ASCII values of his password in reverse order.

Help Aman to find the password.

To decode the password, first reverse the string of digits, then successively pick valid
values from the string and convert them to their ASCII equivalents. Some of the values
will have two digits, and others three. Use the ranges of valid values when decoding the
string of digits.

Some of the ASCII values are given with their characters:
The ASCII value of A to Z is 65 to 90.
The ASCII value of a to zis 97 to 122.
The ASCII value of space characters is 32.

Note: The password only has alphabets and blank spaces.
Given a string , decode the password by following the steps mentioned above.
Constraints:
 1<=|s| <=10A5
 sli] is an ascii character in the range [A-Za-z] or a space character

Sample Input : 796115110113721110141108
Sample Output : Prepinsta

*/

import java.util.Scanner;

public class IBM_Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        String currStr = "";
        String resStr = "";

        for (int i = arr.length - 1; i >= 0; i = i - 2) {
            // currStr = "";
            currStr = "" + arr[i] + arr[i - 1];
            int n = Integer.parseInt(currStr);
            if (n == 32) {
                resStr += " ";
            } else if (n >= 65 && n <= 90 || n >= 97 && n <= 122) {
                resStr += (char) n;
            } else {
                if (i - 2 > 0) {
                    currStr += arr[i - 2];
                    n = Integer.parseInt(currStr);
                    resStr += (char) n;
                }
                i--;
            }

        }
        System.out.println(resStr);

    }
}
