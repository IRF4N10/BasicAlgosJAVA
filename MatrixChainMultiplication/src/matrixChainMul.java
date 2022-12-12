import java.util.*;
import java.lang.*;
class matrixChainMul {

    static char charName;
    static int MinMulValue=0;
    static void printParenthesis(int i, int j, int brackets[][]){

        if(i == j){
            System.out.print(charName);
            charName++;
        } else {
            System.out.print("(");

            printParenthesis(i, brackets[i][j], brackets);

            printParenthesis(brackets[i][j]+1, j, brackets);
            System.out.print(")");
        }
    }
    static void matrixMultiplicationProblem(int matrixSize[]) {
        int numberOfMatrices = matrixSize.length-1;
        int minMul[][] = new int[numberOfMatrices][numberOfMatrices];
        for(int i=0;i<numberOfMatrices;i++){
            for(int j=0;j<numberOfMatrices;j++){
                minMul[i][j] = Integer.MAX_VALUE;
                if(i == j)
                    minMul[i][j] = 0;
            }
        }
        int splitBrackets[][] = new int[numberOfMatrices][numberOfMatrices];
        for(int len=2;len<=numberOfMatrices;len++){
            for(int i=0;i<numberOfMatrices-len+1;i++){
                int j = i+len-1;
                for(int k=i;k<j;k++) {
                    int val = minMul[i][k]+ minMul[k+1][j]+(matrixSize[i]*matrixSize[k+1]*matrixSize[j+1]);
                    if(val < minMul[i][j]) {
                        minMul[i][j] = val;
                        splitBrackets[i][j] = k;
                    }
                }
            }
        }
        MinMulValue = minMul[0][numberOfMatrices-1];
        charName = 'A';
        printParenthesis(0, numberOfMatrices-1, splitBrackets);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Enter the Number of the matrices:\t");

        int n = I.nextInt();
        int row[]=new int[n];
        int col[]=new int[n];
        System.out.println("Enter the row and column of the matrices:");
        for (int i = 0; i < n; i++) {
            System.out.printf("\nNumber of rows in %d number matrix: ", i+1);
            row[i] = I.nextInt();
            System.out.printf("\nNumber of columns in %d number matrix: ", i+1);
            col[i]=I.nextInt();
        }
        int matOrder[] = new int[n+1];
        int j =0;
        for(int i = 0;i<n;i++){
            if(i==0){
                matOrder[j]=row[i];
                j++;
                matOrder[j]=col[i];
                j++;
            }
            else{
                matOrder[j]=col[i];
                j++;
            }
        }
        System.out.println("The order of the matrices will be:");
        for(int i = 0;i<n+1;i++){
            System.out.printf("\t%d\t",matOrder[i]);
        }
        System.out.println("\nThe minimum multiplication order will be:");
        matrixMultiplicationProblem(matOrder);
        System.out.printf("\nThe minimum Value is:%d",MinMulValue);
    }
}