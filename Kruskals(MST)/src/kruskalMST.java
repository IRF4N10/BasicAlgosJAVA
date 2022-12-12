import java.util.Scanner;

public class kruskalMST {

    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Enter the number of vertices:\t");
        int n = I.nextInt();
        int graph[][] = new int[n][n];
        int parent[] = new int[n];
        int min,u=0,v=0,total =0;
        int edges =1;
        System.out.printf("\nEnter the adjacency matrix of the graph representing the edge weights:\n");
        for(int i = 0;i<n;i++){
            parent[i]=0;
            for(int j=0;j<n;j++){
                System.out.printf("\t");
                graph[i][j]= I.nextInt();
                if(graph[i][j]==0){
                    graph[i][j]=999;
                }
            }
            System.out.println();
        }
        while(edges<n){         //visiting edges
            min = 999;
            for(int i =0;i<n;i++){
                for(int j= 0;j<n;j++){
                    if(graph[i][j]<min){        //checking for most minimum one
                        min = graph[i][j];
                        u=i;
                        v=j;
                    }
                }
            }
            int x = u, y =v;
            while(parent[x]!=0){
                x= parent[x];                        //Checking for loop
            }
            while (parent[y]!=0){
                y=parent[y];
            }
            if(x!=y){
                edges++;
                System.out.printf("Edge selected:( %d , %d) : Weight is %d\n",u+1,v+1,min);
                total+=min;
                parent[v] = u;

            }
            graph[u][v]=graph[v][u] = 999;
        }
        System.out.printf("\bThe weight of the minimum cost spanning tree is: %d\t",total);
    }
}