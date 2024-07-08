import java.util.Scanner;

public class SelectionSort {
    Scanner I = new Scanner(System.in);

    void IntSSort() {
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
        int TEMP, smallest;
        for (int i = 0; i < array.length - 1; i++) {
            int j;
            smallest = i;
            for (j = i + 1; j < array.length; j++)
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
                TEMP = array[smallest];
                    array[smallest] = array[i];
                    array[i] = TEMP;
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", array[i]);
        }
    }

    void FltSSort() {
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
        float TEMP;
        int smallest;
        for (int i = 0; i < array.length - 1; i++) {
            smallest = i;
            int j;
            for (j = i + 1; j < array.length; j++)
                if (array[j] <array[smallest]) {
                    smallest = j;
                }
                TEMP = array[smallest];
                array[smallest] = array[i];
                array[i] = TEMP;
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%f\n", array[i]);
        }
    }
    void CharSSort(){
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
        char TEMP;
        int smallest;
        for (int i = 0; i < array.length - 1; i++) {
            smallest = i;
            for(int j=i+1; j<array.length;j++)
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
                TEMP=array[smallest];
                array[smallest] = array[i];
                array[i] = TEMP;
        }
        for(int i=0;i<n;i++){
            System.out.printf("%c\n",array[i]);
        }
    }
}
