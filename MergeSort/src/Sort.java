public class Sort {
    void MERGE(int[] A,int LB, int M, int UB){
        int MA[] = new int[UB+1];
        int i = LB, j = M+1, PTR = LB;
        while(i<=M && j<=UB){
            if(A[i]<A[j]){
                MA[PTR] = A[i];
                i++;
                PTR++;
            } else{
                MA[PTR]=A[j];
                j++;
                PTR++;
            }
        }
        while(i<=M){
            MA[PTR]= A[i];
            PTR++;
            i++;
        }
        while(j<=UB){
            MA[PTR]=A[j];
            PTR++;
            j++;
        }
        for(int l = LB; l<= UB;l++){
            A[l] = MA[l];
        }
    }
    void MERGESORT(int[] A,int LB,int UB){
        int M;
        if(LB<UB){
            M =(LB+UB)/2;
            MERGESORT(A,LB,M);
            MERGESORT(A,M+1,UB);
            MERGE(A,LB,M,UB);
        }
    }

    void Display(int[] A, int N) {
        System.out.println("\nThe sorted list will be:");
        for(int i = 0; i<N;i++){
            System.out.printf("\t%d",A[i]);
        }
    }
}