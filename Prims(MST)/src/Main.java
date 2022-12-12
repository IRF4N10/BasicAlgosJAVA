import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Enter the number of vertices:\t");
        int n = I.nextInt();
        int graph[][] = new int[n][n];
        int visited[] =new int[n];
        int min=999,u=0,v=0,total =0;
        System.out.printf("\nEnter the adjacency matrix of the graph:\n");
        for(int i = 0;i<n;i++) {
            visited[i] = 0;
            for (int j = 0; j < n; j++) {
                System.out.printf("\t");
                graph[i][j] = I.nextInt();
                if (graph[i][j] == 0) {
                    graph[i][j] = 999;
                }
            }
            System.out.println();
        }
            visited[0] = 1;
            for(int counter = 0; counter<n-1;counter++){
                min =999;
                for(int i =0;i<n;i++){
                    if(visited[i]==1){
                        for(int j =0;j<n;j++){
                            if(visited[j]!=1){
                                if(min>graph[i][j]){
                                    min = graph[i][j];
                                    u =i;
                                    v =j;
                                }
                            }
                        }
                    }
                }
                visited[u]=1;
                visited[v]=1;
                total+=min;
                System.out.printf("\nEdge selected:( %d , %d) : Weight is %d\n",u+1,v+1,min);
            }
        System.out.printf("\bThe weight of the minimum cost spanning tree is: %d\t",total);

        }
    }
