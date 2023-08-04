//Came in Oracle.
//stair case searching method.
package TwoDArrays;

public class searchInSortedMatrix {
    public static void main(String args[]){
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};

        int noMatrix[][] = {};
        
        //int key = 33;
        searchKey(matrix, 33);
        searchKey(noMatrix, 60);
        
    }

    public static boolean searchKey(int matrix[][], int key){

        if(matrix.length == 0 || matrix[0].length == 0){
            System.out.println("The matrix is empty");
            return false;
        }

        // considering starting point as 40 - top right element
        int row = 0;  int col = matrix[0].length-1;   //matrix.length-1: to find the index of last row, matrix[0].length-1: to find the index of last col in 1st row. 
        
        // 2nd method:- considering starting point as 32 - bottom left element
        //int row = matrix.length-1;  int col = 0;;
        
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("Key found at " + "(" + row + "," + col + ")");
                return true;
            } else 
            if(matrix[row][col] < key){
                row++;  // for 2nd method col++;
            } else    
            if(matrix[row][col] > key){   
                col--;   // for 2nd method row--;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    
}
 