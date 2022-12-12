import java.util.Scanner;

public class BinarySearch {
    Scanner I = new Scanner(System.in);
    public int BEG,END,MID,LOC;
    void BinSearch1(int array[],int n){
        System.out.printf("\nEnter the element to search using Binary Search:\t");

        int ITEM = I.nextInt();
        BEG = 1; END = n;
        MID = ((BEG+END)/2);
        while(BEG<=END && array[MID]!=ITEM){
            if (ITEM<array[MID]){
                END = MID - 1;
            }
            else{
                BEG = MID + 1;
            }
            MID = ((BEG+END)/2);

        }
        if(array[MID] == ITEM){
            LOC = MID;
            System.out.printf("The element %d is found on %d no location",ITEM,LOC+1);
        }
        else{
            LOC=0;
            System.out.printf("The element %d is not found",ITEM);
        }
    }
    void BinSearch2(float array[],int n) {
        System.out.printf("\nEnter the element to search using Binary Search:\t");

        float ITEM = I.nextFloat();
        BEG = 1;
        END = n;
        MID = ((BEG + END) / 2);
        while (BEG <= END && array[MID] != ITEM) {
            if (ITEM < array[MID]) {
                END = MID - 1;
            } else {
                BEG = MID + 1;
            }
            MID = ((BEG + END) / 2);
        }
        if (array[MID] == ITEM) {
            LOC = MID;
            System.out.printf("The element %.3f is found on %d no location", ITEM, LOC+1);
        } else {
            LOC = 0;
            System.out.printf("The element %.3f is not found", ITEM);

        }
    }
        void BinSearch3(char array[],int n){
            System.out.printf("\nEnter the element to search using Binary Search:\t");

            char ITEM = I.next().charAt(0);
            BEG = 1;
            END = n;
            MID = ((BEG + END) / 2);
            while (BEG <= END && array[MID] != ITEM) {
                if (ITEM < array[MID]) {
                    END = MID - 1;
                } else {
                    BEG = MID + 1;
                }
                MID = ((BEG + END) / 2);
            }
            if (array[MID] == ITEM) {
                LOC = MID;
                System.out.printf("The element %c is found on %d no location", ITEM, LOC+1);
            } else {
                LOC = 0;
                System.out.printf("The element %c is not found", ITEM);

            }
        }
    }

