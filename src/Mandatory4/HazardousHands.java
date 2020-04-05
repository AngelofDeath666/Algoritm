package Mandatory4;
import java.lang.reflect.Array;
import java.util.*;

public class HazardousHands {

    static class VirusCarriers{
        int vertices;
        int chain = 0;
        LinkedList<Integer>[] list;

    }

    VirusCarriers(int vertices) {
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
        String conferenceGoers = sc.nextLine();
        int conPeople = Integer.parseInt(conferenceGoers);

        //handshakes made
        String handshakesMade = sc.nextLine();
        int handshakes = Integer.parseInt(handshakesMade);

        String[] tokens = new String[handshakes*2];
        int[] blyat = new int[tokens.length];

        while (sc.hasNextLine()){
            tokens = sc.nextLine().split("\\s");
            System.out.println(Arrays.toString(tokens)); //todo delete
            for (int i = 0; i < tokens.length; i++ ){
                blyat[i] = Integer.parseInt(tokens[i]);
            }


        }
        sc.close();

        vertices = conPeople;
        for (int i = 0 ; i < (blyat.length/2); i++){

        }

    }
}
