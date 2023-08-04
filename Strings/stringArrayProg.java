package Strings;

public class stringArrayProg {
    public static void main(String args[]){
        //declaring a string
        String str = "Abhinandan";
        System.out.println("Printing the original string at a time: "+ str);
        
        System.out.println("Printing every character of the original string...........");
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        //converting it into an char array
        char strArr[] = str.toCharArray();
        
        System.out.println("Printing str after converting into a char array strArr[].........");
        for(int i=0; i<strArr.length-1; i++){
            //strArr[i] += 1; //can perform this type of modification if required
            System.out.print(strArr[i] + " ");
        } System.out.println();
        
        System.out.println("Printing again after converting from the char array to string...............");
        String arrStr = String.valueOf(strArr);
        System.out.println(arrStr);

    }
    
}
