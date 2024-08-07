import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
	Scanner I = new Scanner(System.in);
	SelectionSort sel_sort = new SelectionSort();
	System.out.printf("Enter the type of input data:\n");
        loop1:
        while (true) {
            System.out.printf("\n\t***Select the Data Type***\nPress 1 to select Integer \nPress 2 to select Float\n" +
                        "Press 3 to select Character\n\nPress 0 to Exit\n");

            int op = I.nextInt();
            switch (op) {
                case 0: {
                    exit(0);
                }
                case 1: {
                    System.out.printf("\nInteger Data Type is selected\n");
                    sel_sort.IntSSort();
                    break;
                }
                case 2: {
                    System.out.printf("\nFloat Data Type is selected\n");
                    sel_sort.FltSSort();
                    break;
                }
                case 3: {
                    System.out.printf("\nCharacter Data Type is selected\n");
                    sel_sort.CharSSort();
                    break;
                }
                default: {
                    System.out.printf("\tError!!!\nInvalid Operation selected");
                    break ;
                }
            }
        }
    }
}
