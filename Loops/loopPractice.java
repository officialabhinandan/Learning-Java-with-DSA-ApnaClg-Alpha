package Loops;

public class loopPractice {
    public static void main(String args[]){
        int count1 = 0;
        int count2 = 1;

        //while loop example
        while(count1<10){
            System.out.println("Hello World");
            count1++;
        }
         while(count2<=10){
            System.out.println("Bolo World");
            count2++;
        }

        //for loop example
        for(int i=0; i<10; i++){
            System.out.println("Hello World by for loop");
        }

        //do while loop
        int count3 = 0;
        do{
            System.out.println("Hello World by do while loop");
            count3++;
        } while (count3<10);

        //break statement example
        for(int i=1; i<=10; i++){
            if(i == 6){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I'm out of the loop");

        //continue stament example
         for(int i=1; i<=10; i++){
            if(i == 6){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("6 skipped successfully");


    }

}
