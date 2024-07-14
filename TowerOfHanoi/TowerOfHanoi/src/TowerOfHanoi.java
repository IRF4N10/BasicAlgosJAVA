import java.util.Scanner;

public class TowerOfHanoi {
    public static void TowerOfHanoi(int n, String src, String aux, String dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + src + " to rod " + dest);
            return;
        }
        TowerOfHanoi(n - 1, src, dest, aux);
        System.out.println("Move disk " + n + " from rod " + src + " to rod " + dest);
        TowerOfHanoi(n - 1, aux, src, dest);
    }
    
    public static void main(String[] args) throws Exception {
        Scanner I = new Scanner(System.in);
        System.out.printf("Enter the number of disks: ");
        int n = I.nextInt();
        System.out.printf("\nTo move the disks from source to destination pole, \nThe required movements are: \n");
        TowerOfHanoi(n, "src", "aux", "dest");

    }
}
