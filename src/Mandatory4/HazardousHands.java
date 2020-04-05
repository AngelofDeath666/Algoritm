package Mandatory4;
import java.util.LinkedList;
import java.util.*;

public class HazardousHands {

    static class VirusCarriers {
        int vertices;
        int chain;
        LinkedList<Integer>[] list;


        VirusCarriers(int vertices){
            this.vertices = vertices;
            list = new LinkedList[vertices];
            for (int i = 0; i <vertices ; i++) {
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
            chain = 0;
        visited[start] = true;
        for (int i = 0; i < list[start].size(); i++){
            int destination = list[start].get(i);
            if(!visited[destination]){
                dfs(destination,visited);
            }
            chain += 1;
            System.out.println(chain);
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

        ArrayList<String> blin = new ArrayList<>();
        String[] tokens = new String[2];
        int[] blyat = new int[tokens.length];

        for (int i = 0 ; i < handshakes ; i++){
            tokens = sc.nextLine().split("\\s");
            blin.addAll(Arrays.asList(tokens));
            for (int j = 0; j < blin.size(); j++ ){
                blyat[j] = Integer.parseInt(blin.get(i));
                System.out.println(Arrays.toString(blyat)); //todo delete
            }

            System.out.println(Arrays.toString(tokens)); //todo delete


        }
        sc.close();

        int vertices = conPeople;
        VirusCarriers virusCarriers = new VirusCarriers(vertices);
        for (int i = 0 ; i < (blyat.length/2); i++){
            virusCarriers.addEdge(blyat[i],blyat[i+1]);
            i =+1;

        }

        virusCarriers.DFSRecursion(carrier);

        }

    }
}
