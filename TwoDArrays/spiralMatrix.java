//comes in Microsoft, Amazon. Google, Oracle and Apple.
package TwoDArrays;

public class spiralMatrix {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){
            //print top boundary
            for(int j=startRow; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            //print right boundary
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            //print bottom boundary
            for(int j=endCol-1; j>=startCol; j--){
                 if(startRow == endRow){   //if odd numbers of rows are present
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            //print left boundary
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){   //if odd numbers of cols are present
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            //update variable
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16} };

        printSpiral(matrix);
    }

}
