//Prints characters pattern

package PatternProgs;
import java.util.Scanner;

public class pattern4 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
    
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++, ch++){
                System.out.print(ch);
                // ch++; // this is also correct
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}
