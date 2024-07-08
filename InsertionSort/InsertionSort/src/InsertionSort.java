import java.util.Scanner;

public class InsertionSort {
    Scanner I = new Scanner(System.in);

    void IntISort() {
        System.out.printf("\nEnter the number of values: \t");
        int n = I.nextInt();
        System.out.printf("\nEnter the elements: \t");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = I.nextInt();
        }
        System.out.printf("\nThe Input values are:\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", array[i]);
        }
        System.out.printf("\nImplementing the Selection Sort:\n");
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;        
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", array[i]);
        }
    }

    void FltISort() {
        System.out.printf("\nEnter the number of values: \t");
        int n = I.nextInt();
        System.out.printf("\nEnter the elements: \t");
        float array[] = new float[n];
        for (int i = 0; i < n; i++) {
            array[i] = I.nextFloat();
        }
        System.out.printf("\nThe Input values are:\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("%f\n", array[i]);
        }
        System.out.printf("\nImplementing the Selection Sort:\n");
        float current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;        
        }
    }
    void CharISort(){
        System.out.printf("\nEnter the number of values: \t");
        int n = I.nextInt();
        System.out.printf("\nEnter the elements: \t");
        char array[] = new char[n];
        for (int i = 0; i < n ; i++) {
            array[i] = I.next().charAt(0);
        }
        System.out.printf("\nThe Input values are:\n");
        for(int i=0;i<n;i++){
            System.out.printf("%c\n",array[i]);
        }
        System.out.printf("\nImplementing the Selection Sort:\n");
        char current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;        
        }
        for(int i=0;i<n;i++){
            System.out.printf("%c\n",array[i]);
        }
    }
}
