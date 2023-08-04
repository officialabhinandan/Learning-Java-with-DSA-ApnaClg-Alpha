package BitManipulation;

public class binaryOP {
    public static void main(String args[]) {
        System.out.println("Binary AND Example:- (5 & 6) = " + (5 & 6));
        System.out.println("Binary OR Example:- (5 | 6) = " + (5 | 6));
        System.out.println("Binary XOR Example:- (5 ^ 6) = " + (5 ^ 6));
        System.out.println("Binary NOT Example:- (~5) = " + (~5));
        System.out.println("Binary Left Shift Operator Example:- (5<<2) = " + (5 << 2));
        System.out.println("Binary Left Shift Operator Example:- (6>>1) = " + (6 >> 1));
        printOddEven(10); // even
        printOddEven(17); // odd
        System.out.println(getithBit(10, 2));
        System.out.println(getithBit(10, 3));
        System.out.println(setithBit(10, 2));
        System.out.println(clearithBit(10, 0));
        System.out.println(updateithBit(10, 2, 1));
        System.out.println(clearLastithBits(15, 2));
        System.out.println(clearRangeOfBits(10, 2, 4));
        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(isPowerOfTwo(15)); // false
        System.out.println(countSetBits(10));
        System.out.println(fastExponentiation(3, 5));
        System.out.println(fastExponentiation(5, 3));

    }

    /*
     * To print a number even or odd using Bit Manipulation we notice that, the
     * LSB(Least Significant Bit, most right digit) should be 1 in case of
     * odd numbers and 0 in case of even numbers. To extract the LSB we perform and
     * operation of the number with BitMask 1. If the number is odd then
     * LSB will be 1 and AND Operation with BitMask 1 will be 1. But in case of even
     * the LSB is 0 and AND operation with BitMask 1 is 0
     */
    public static void printOddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even
            System.out.println(n + " is an even number");
        } else { // odd
            System.out.println(n + " is an odd number");
        }
    }

    public static int getithBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) { // for 0
            return 0;
        } else { // for 1
            return 1;
        }
    }

    public static int setithBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearithBit(int n, int i) {
        int bitMask = ~(i << i);
        return n & bitMask;
    }

    public static int updateithBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearithBit(0, i);
        } else {
            return setithBit(n, i);
        }
    }

    public static int clearLastithBits(int n, int i) {
        int bitMask = (~0) << i; // (-1)<<i
        return n & bitMask;
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0) << (j + 1); // shifting -1, (j+1) bits
        int b = (1 << i) - 1; // 2^i - 1
        int bitMask = a | b;
        return n & bitMask;
    }

    // checking wheather a number is power of two or not
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0; // see the photo for reference
    }

    // counting the number of set bits or no of 1s in a binary number(time
    // complexity = O(log n))
    // came in Google
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // cheak wheather LSB is 0 or not
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // calculation the value of fast exponential a^n within O(log n) time complexity
    // instead of O(n) time complexity
    public static int fastExponentiation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // checking wheather we've reached to the set bit or not(LSB)
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    //another imp topic often comes in interview is modular exponentiation which is calculating (a^n)%x. Comes in Google too.

}
