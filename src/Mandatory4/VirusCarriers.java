package Mandatory4;
import java.lang.reflect.Array;
import java.util.*;

public class VirusCarriers {
    int vertices;
    int chain = 0;
    LinkedList<Integer>[] list;

    public VirusCarriers(int vertices) {
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
            chain += 1;
        }
    }


    public static void main(String[] args){
        // input to output
        Scanner sc = new Scanner(System.in);

        //get virus carrier
        String virusCarrier = sc.nextLine();
        int carrier = Integer.parseInt(virusCarrier);

        //count of conference goers
        String confernceGoers = sc.nextLine();
        int conPeople = Integer.parseInt(confernceGoers);

        //handshakes made
        String handshakesMade = sc.nextLine();
        int handshakes = Integer.parseInt(handshakesMade);

        while (sc.hasNextLine()){
            String[] tokens = sc.nextLine().split("\\s");
            System.out.println(Arrays.toString(tokens));
            for (int i = 0; i < tokens.length; i++ ){
                int[] a = new int[0];
                a[i] = Integer.parseInt(tokens[i]);
            }



        }
        sc.close();


    }
}
