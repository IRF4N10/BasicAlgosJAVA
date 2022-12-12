import java.util.Scanner;

public class LCS {

    static void PrintLCS(int img[][], String seq,int i,int j){
        if(i==0||j==0){
            return;
        }
        if(img[i][j]==-3){
            PrintLCS(img,seq,i-1,j-1);
            System.out.print(seq.charAt(i-1));
        }
        else if(img[i][j]== -1){
            PrintLCS(img,seq,i-1,j);
        }
        else{
            PrintLCS(img,seq,i,j-1);
        }

    }
    static void LCSLength(String x,String y){
        int rows= x.length() +1;
        int cols = y.length()+1;
        int table[][] = new int[rows][cols];
        int img[][] = new int[rows][cols];

        for(int i = 0;i<rows;i++){
            for(int j= 0 ;j<cols;j++){
                if(i == 0 || j==0){
                    table[i][j]= 0;
                    img[i][j]=0;
                }
                else if(i>0 && j>0 && x.charAt(i-1)==y.charAt(j-1)){
                    table[i][j]= 1+table[i-1][j-1];
                    img[i][j] = -3;
                }
                else if(i>0 && j>0 && x.charAt(i-1)!=y.charAt(j-1)){
                    if(table[i][j-1]>table[i-1][j]){
                        table[i][j] = table[i][j-1];
                        img[i][j]= -2;
                    }
                    else {
                        table[i][j]=table[i-1][j];
                        img[i][j] =-1;
                    }
                }
            }
        }
        System.out.printf("\nCommon Subsequence: \t");
        PrintLCS(img,x,x.length(),y.length());
        System.out.printf("\nLength: %d",table[rows-1][cols-1]);
    }

    public static void main(String[] args) {
        Scanner I =new Scanner(System.in);
        System.out.printf("First String:\t");
        String first = I.next();
        System.out.printf("Second String:\t");
        String second = I.next();
        LCSLength(first,second);
    }
}