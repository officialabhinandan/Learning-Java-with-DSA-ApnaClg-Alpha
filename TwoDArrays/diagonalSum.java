//Asked Microsoft, Samsung and Amazon.
//it is only solved for n*m matrix where n=m. It consists of primary diaginal(left top to bottom right) and secondary diagonal(right top to bottom left).
package TwoDArrays;

public class diagonalSum {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                           { 5, 6, 7, 8 },
                           { 9, 10, 11, 12 },
                           { 13, 14, 15, 16} };

      System.out.println("The diagonal sum will be: " + calculateDiagnalSum(matrix));

    }
    public static int calculateDiagnalSum(int matrix[][]){
        
        // //Not a optimized method. Time complexity is O(n^2).
        //int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix.length; j++){
        //         if(i == j){
        //            sum += matrix[i][j];
        //         } else if(i+j == matrix.length-1){
        //            sum += matrix[i][j];
        //         }
        //     }
        // }

        //Optimized method. Time complexity is O(n).
        int total = 0;
        for(int i=0; i<matrix.length; i++){
            //primary diagonal
            total += matrix[i][i];
            //secondary diagonal
            if(i != matrix.length-i-1){
            total += matrix[i][matrix.length-i-1];    //i+j = n-1 , so j = n-i-1 here n is matrix.length
            }
        }
        //return sum;
        return total;

    }

}
