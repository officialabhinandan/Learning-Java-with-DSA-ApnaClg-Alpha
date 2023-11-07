// Online IDE - Code Editor, Compiler, Interpreter
//You can access it here too:- (https://www.online-ide.com/JGZ7P9MOxH)
package TwoDArrays;

import java.util.Scanner;


class M
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing the user given matrix");
        printMatrix(matrix);
        System.out.println("Printing row no 02");
        printRow2(matrix);
        System.out.println("Pritning col no 02");
        printCol2(matrix);
        System.out.println("The largest element of the matrix is " + printLargestElmt(matrix));
        System.out.println("The smallest element of the matrix is " + printSmallestElmt(matrix));
        
        int a[] = getLargestfromEachRow(matrix);
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        
        int b[] = getLargestfromEachCol(matrix);
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
        printSpiralMatrix(matrix);
    }
    
    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void printRow2(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(i == 2){
                    System.out.print(matrix[i][j] + " ");
                } else {
                    continue;
                }
            }
        }
        System.out.println();
    }
    
    public static void printCol2(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(j == 2){
                    System.out.print(matrix[i][j] + " ");
                } // else { continue }; not necessary
            }
        }
        System.out.println();
    }
    
    public static int printLargestElmt(int matrix[][]){
        int maxElmt = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                maxElmt = Math.max(maxElmt, matrix[i][j]);
            }
        }
        return maxElmt;
    }
    
    public static int printSmallestElmt(int matrix[][]){
        int minElmt = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                minElmt = Math.min(minElmt, matrix[i][j]);
            }
        }
        return minElmt;
    }
    
    public static int[] getLargestfromEachRow(int matrix[][]){
        int arr[] = new int[matrix.length];
        
        for(int i=0; i<matrix.length; i++){ 
        int LOR = Integer.MIN_VALUE; // LOR  Largest of Row 
            for(int j=0; j<matrix[0].length; j++){
              LOR = Math.max(LOR, matrix[i][j]);
            }
           arr[i] = LOR;
        }
        return arr;   
    }
    
    public static int[] getLargestfromEachCol(int matrix[][]){
        int arr[] = new int[matrix[0].length];
        
        for(int j=0; j<matrix[0].length; j++){ 
        int LOC = Integer.MIN_VALUE; // LOC = Largest of Column 
            for(int i=0; i<matrix.length; i++){
              LOC = Math.max(LOC, matrix[i][j]);
            }
           arr[j] = LOC;
        }
        return arr;   
    }
    
    public static void printSpiralMatrix(int matrix[][]){
       int startRow = 0;
       int startCol = 0;
       int endRow = matrix.length-1;
       int endCol = matrix[0].length-1;
       
       while(startRow <= endRow && startCol <= endCol){
           // for upper boundary
           for(int i=startRow; i<=endCol; i++){
               System.out.print(matrix[startRow][i] + " ");
           }
           // for right boundary
           for(int j=startRow+1; j<=endRow; j++){
               System.out.print(matrix[j][endCol] + " ");
           }
           // for bottom boundary
           for(int i=endCol-1; i>=startRow; i--){
               if(startRow == endRow){  // in case of odd number of rows
                   break;
               }
               System.out.print(matrix[endRow][i] + " ");
           }
           // for left boundary
           for(int j=endRow-1; j>=startRow+1; j--){
               if(startCol == endCol){  // in case of odd number of rows
                   break;
               }
               System.out.print(matrix[j][startCol] + " ");
           }
           // updating the variables
           startRow++;
           startCol++;
           endRow--;
           endCol--;
       }
    }
}
