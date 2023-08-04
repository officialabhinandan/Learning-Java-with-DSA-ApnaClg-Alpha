package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

public class bufferedReadereg {
    public static void main(String args[]) throws IOException {
        System.out.println("enter two values");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float a = Float.parseFloat(br.readLine());
        float b = Float.parseFloat(br.readLine());
        System.out.println(a + b);

    }

}
