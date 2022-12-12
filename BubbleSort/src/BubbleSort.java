import java.util.Scanner;

import static java.lang.System.exit;

public class BubbleSort {
    Scanner I = new Scanner(System.in);

    void IntBSort(){
        System.out.printf("\nEnter the maximum size of the array\t");
        int n = I.nextInt();
        System.out.printf("\nEnter the elements of the array\t");
        int array[] = new int[200];
        for (int i = 0; i < n ; i++) {
            array[i] = I.nextInt();
        }
        System.out.printf("\nThe Input values are:\n");
        for(int i=0;i<n;i++){
            System.out.printf("%d\n",array[i]);
        }
        System.out.printf("\nImplementing the Bubble Sort:\n");
        int TEMP;
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++)
                if(array[i]<array[j]){
                    TEMP=array[j];
                    array[j] = array[i];
                    array[i] = TEMP;
                }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%d\n",array[i]);
        }
    }
    void FltBSort(){
        System.out.printf("\nEnter the maximum size of the array\t");
        int n = I.nextInt();
        System.out.printf("\nEnter the elements of the array\t");
        float array[] = new float[200];
        for (int i = 0; i < n ; i++) {
            array[i] = I.nextFloat();
        }
        System.out.printf("\nThe Input values are:\n");
        for(int i=0;i<n;i++){
            System.out.printf("%.2f\n",array[i]);
        }
        System.out.printf("\nImplementing the Bubble Sort:\n");
        float TEMP;
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++)
                if(array[i]<array[j]){
                    TEMP=array[j];
                    array[j] = array[i];
                    array[i] = TEMP;
                }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%.2f\n",array[i]);
        }
    }
    void CharBSort(){
        System.out.printf("\nEnter the maximum size of the array\t");
        int n = I.nextInt();
        System.out.printf("\nEnter the elements of the array\t");
        char array[] = new char[200];
        for (int i = 0; i < n ; i++) {
            array[i] = I.next().charAt(0);

        }
        System.out.printf("\nThe Input values are:\n");
        for(int i=0;i<n;i++){
            System.out.printf("%c\n",array[i]);
        }
        System.out.printf("\nImplementing the Bubble Sort:\n");
        char TEMP;
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++)
                if(array[i]<array[j]){
                    TEMP=array[j];
                    array[j] = array[i];
                    array[i] = TEMP;
                }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%c\n",array[i]);
        }
    }
}
