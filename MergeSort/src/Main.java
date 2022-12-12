import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        Sort obj = new Sort();
        System.out.printf("\nEnter the maximum size of the array\t");
        int N = I.nextInt();
        System.out.printf("\nEnter the elements of the array\n");
        int A[] = new int[N];
        for (int i = 0; i < N ; i++) {
            A[i] = I.nextInt();
        }
        obj.MERGESORT(A,0,N-1);
        obj.Display(A,N);
    }
}