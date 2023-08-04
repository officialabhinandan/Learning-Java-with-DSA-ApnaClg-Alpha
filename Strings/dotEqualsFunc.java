package Strings;

public class dotEqualsFunc {
    public static void main(String args[]){
        String s1 = "Abhinandan";  //creates an obj in the memory pool.
        String s2 = "Abhinandan";  //finds and referes the old one.
        String s3 = new String("Abhinandan"); //creates a whole new obj in the heap mempry

        if(s1 == s2){   // returns true bcz both s1 and s2 refers to the same obj.
            System.out.println("s1 and s2 are equal");
        } else {
             System.out.println("s1 and s2 are not equal");
        }

        if(s1 == s3){  //returns false bcz s1 is made in memory pool and s2 in heap memory. Both val same but on=bj is diff.
            System.out.println("s1 and s3 are equal");
        } else {
             System.out.println("s1 and s3 are not equal");
        }

        //just to check and compare the value of two strings we use .equals() function
        if(s1.equals(s3)){   //returns boolean type //now it retuns true just based on the value.
             System.out.println("s1 and s3 are equal based on their value");
        } else {
             System.out.println("s1 and s3 are not equal based on their value");
        }


    }
    
}
