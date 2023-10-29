package Backtracking;

public class NQueensOG {
    public static void main(String args[]){
        int n = 4;
        // taking char 2D array
        char chessBoard[][] = new char[n][n];

        // putting elemnets inside the chessBoard
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                chessBoard[i][j] = 'x';
            }
        }
        NQueensOG ob = new NQueensOG(); 
        ob.nQueens(chessBoard, 0);
        System.out.println("Total number of solutions = " + ob.count);
    }

    int count = 0; 

    void nQueens(char board[][], int i){
        // base case
        if(i == board.length){
           printBoard(board);
           count++;
           return;
        }

        // logic - putting Qs inside the array
        for(int j=0; j<board.length; j++){
            if(isSafe(board, i, j)){
                board[i][j] = 'Q';
                nQueens(board, i+1); // recursive func call
                board[i][j] = 'x';  // backtracking step
                //printBoard(board);
            }

        }
    }

     boolean isSafe(char board[][], int row, int col){

        // vertical up (same case with down)
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonal right up (or down)
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // diagonal left up (or down)
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    void printBoard(char board[][]){
        System.out.println("_________ Chess Board _________");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}

