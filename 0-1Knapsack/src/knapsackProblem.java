import java.util.Scanner;

public class knapsackProblem {
    public static int knapsack(int v[], int w[], int n, int W)
    {
        if (W < 0) {
            return Integer.MIN_VALUE;
        }
        if (n < 0 || W == 0) {
            return 0;
        }
        int include = v[n] + knapsack(v, w, n - 1, W - w[n]);
        int exclude = knapsack(v, w, n - 1, W);
        return Integer.max(include, exclude);
    }
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
    System.out.println("Knapsack problem & its solution");
        System.out.println("Enter the number of objects:\t");
        int n = I.nextInt();
        System.out.printf("\nEnter the  values of the objects:\n");
        int v[]= new int[n];
        for(int i = 0;i<n;i++){
            v[i]=I.nextInt();
        }
        System.out.printf("\nEnter the weights of the objects:\n");
        int w[] = new int[n];
        for(int i = 0;i<n;i++){
            w[i]=I.nextInt();
        }
        System.out.println("Enter the capacity of the knapsack");
        int W = I.nextInt();
        System.out.println("Knapsack value is " +
                knapsack(v, w, v.length - 1, W));
    }
}