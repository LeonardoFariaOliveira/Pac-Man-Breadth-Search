
import java.util.*;

import javax.swing.text.html.parser.Element;

// This class represents a directed graph using adjacency list
// representation
class Graph {
    private int V; // No. of vertices
    public int cn; // means Coins number is the number of coin this map has
    public LinkedList<No>[] adj; // Adjacency Lists
    public boolean[] visitedP; //This is an auxiliar variable to know what parent I ever visited
    boolean[] visited; //This is an auxiliar variable to know what node I ever visited
    public Integer[][] parent; //This is a multi-dimensional array that storage the ways to get the coins

    // Constructor
    Graph(int v, int cn) {
        V = v;
        this.cn = cn;
        adj = new LinkedList[V];
        parent = new Integer[cn][V];
        visited = new boolean[V];
        visitedP = new boolean[V];
        //Initialize the arrays
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<No>();
            visitedP[i] = false;
            visited[i] = false;
        }
        for (int i = 0; i < cn; i++) {
            for(int r = 0; r<V; r++ )
                parent[i][r] = new Integer(-1);
        }

    }

    // Function to add an edge into the graph
    void addEdge(int v, int ni, boolean isCoin) {
        adj[v].add(new No(ni, isCoin));
    }

    void BFS(int s) {
        int aux_parent;
        //Variable to know how may coins I've got
        int coinNumberFound = 0;
        boolean find = false;
        //Variable to help me print the node I've started to look for
        int init[] = new int[this.cn];
        //Init wth my initial position that the user typed
        init[0] = s;
        //This array gets the position of the coins I've got
        int[] posCoinNumberFound = new int[this.cn];


        // Create a queue for BFS
        Queue<No> queue = new LinkedList<No>();
        int h;
        No no = adj[s].element();
        visited[s] = true;
        queue.add(no);
        parent[coinNumberFound][s] = s;
        while (!queue.isEmpty() && !find) {

            s = queue.poll().pos;
            aux_parent = s;
           
            //If the node I'm visiting have a coin
            if (adj[s].element().coin) {

                //I get this node position and put on my array
                posCoinNumberFound[coinNumberFound] = s;
                //I remove the coin from the node
                adj[s].element().coin = false;
                //I set all visited back to 0 'cause if I don't do this there will be an error
                for (int i = 0; i < V; i++) {
                    visited[i] = false;
                }
                //I clean up the queue to start a new way 'cause now I have to find the other one coin
                queue.clear();
                //I find all the node of this position and add to the queue to start by exactly this node
                no = adj[s].element();
                queue.add(no);
                //I update 'cause I've found one or more one
                coinNumberFound++;

                //If I've found the number this map has so I've finished this map
                if(coinNumberFound == this.cn)
                    find = true;
                //Else I keep looking for and update from where I started
                else
                    init[coinNumberFound] = s;


                

            } else {
                // Get all adjacent vertices of the dequeued vertex s
                // If a adjacent has not been visited, then mark it
                // visited and enqueue it
                Iterator<No> i = adj[s].listIterator();
                while (i.hasNext()) {
                    No n = i.next();

                    if (visited[n.pos] == false) {

                        parent[coinNumberFound][n.pos] = aux_parent;
                        visited[n.pos] = true;
                        queue.add(n);

                    }
                }
            }
        }
        System.out.println(" ");
        System.out.println("Caminho reverso para as moedas");
        
        //Prints the way of the coins
        for(int y = 0; y < this.cn; y++){
            System.out.print("Moeda "+ (y+1) + ": ["+ posCoinNumberFound[y]);
            int e = posCoinNumberFound[y];
            h = parent[y][e];
            int u =h-1;
            for (int i = 0; i < V; i++) {
                visitedP[i] = false;
            }

            while( u < V && h != init[y] && !visitedP[h]){

                if(u == h){
                    visitedP[h] = true;
                    System.out.print("-"+h);
                    h = parent[y][h];
                    u=h-1;
                }
                u++;
                
            }
            System.out.print("-"+init[y]);
            System.out.print("]");
            System.out.println("\n");
        }


       



    }
}
