import java.util.Scanner;

public class Main {
    static int N=4;

    static  void printBoard(int board[][]){
        for(int i =0;i<N;i++){
            for(int j =0;j<N;j++){
                if(board[i][j]==1){
                    System.out.print("Q\t");
                }
                else{
                    System.out.print("_\t");
                }
            }
            System.out.println("\n");
        }
    }

    static boolean placing(int board[][],int row, int col){
        int i, j;
        for(i=0;i<col;i++){        //Check The row for queen
            if(board[row][i]==1) {
                return false;
            }
        }
        for(i=row,j=col;i>=0 && j>=0;i--,j-- ){     //Check diagonally top left
            if(board[i][j]==1){
                return false;
            }
        }
        for(i = row,j=col;j>=0&&i<N;i++,j--){   //check diagonally bottom left
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
    }

    static boolean boardSolve(int board[][],int col){
        if(col>=N){
            return true;
        }
        for(int i = 0;i<N;i++){
            if(placing(board,i,col)){
                board[i][col]=1;
                if(boardSolve(board,col+1)) {
                    return true;
                }
                    board[i][col] =0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner I  = new Scanner(System.in);
        System.out.println("Enter the order of the Chess board size:");
        N = I.nextInt();
        int board[][] = new int[N][N];
        if(!boardSolve(board,0)){
            System.out.println("There is no  Solution:");
        }
        printBoard(board);
    }
}
