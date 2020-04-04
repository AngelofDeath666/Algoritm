package Mandatory4;
import java.util.LinkedList;

public class Islands {
    int vertices;
    int chain = 0;
    LinkedList<Integer>[] list;

    public Islands(int vertices) {
        this.vertices = vertices;
        list = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        //add edge
        list[source].addFirst(destination);

        //add back edge (for undirected)
        list[destination].addFirst(source);

    }

    public void DFSRecursion(int startVertex){
        boolean[] visited = new boolean[vertices];
        dfs(startVertex, visited);
    }

    public void dfs(int start, boolean[] visited){
        visited[start] = true;
        for (int i = 0; i < list[start].size(); i++){
            int destination = list[start].get(i);
            if(!visited[destination]){
                dfs(destination,visited);
            }
            chain +=1;

        }
    }

    public static void main(String[] args){
//        Graph graph = new Graph(5);
//        graph.addEdge(0,1);


    }
}
