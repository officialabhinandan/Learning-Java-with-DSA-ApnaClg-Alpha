package Funcsndmethods;

public class numberSystem {
    public static void main(String args[]) {
        binaryToDecimal(1101);
        decimalToBinary(13);

    }

    public static void binaryToDecimal(int binNum) {
        int inputBinaryNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum != 0) { // while condition: !=0 or >0 performs same tasks
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;

        }

        System.out.println("The decimal number of " + inputBinaryNum + " will be: " + decNum);

    }

    public static void decimalToBinary(int decNum) {
        int inputDecimalNum = decNum;
        int pow = 0;
        int binNum = 0;

        // while condition: !=0 or >0 performs same tasks
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;

        }
        System.out.println("The binary number of " + inputDecimalNum + " will be: " + binNum);

    }
}
