package Mandatory4;

import java.util.LinkedList;
import java.util.*;

public class HazardousHands {
    public static void main(String[] args) {
        // input to output
        Scanner sc = new Scanner(System.in);
        //get virus carrier
        int carrier = sc.nextInt();

        //count of conference goers
        int conPeople = sc.nextInt();

        //handshakes made
        int handshakes = sc.nextInt();

        VirusCarriers virusCarriers = new VirusCarriers(conPeople);
        for (int i = 0; i < handshakes; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            virusCarriers.addEdge(a, b);
        }
        sc.close();
        virusCarriers.DFSRecursion(carrier);

    }

    static class VirusCarriers {
        int vertices;
        HashSet r = new HashSet();
        LinkedList<Integer>[] list;


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

        public void DFSRecursion(int startVertex) {
            boolean[] visited = new boolean[vertices];
            dfs(startVertex, visited);
            System.out.println(r.size());
        }

        public void dfs(int start, boolean[] visited) {

            visited[start] = true;
            for (int i = 0; i < list[start].size(); i++) {
                int destination = list[start].get(i);
                if (!visited[destination]) {
                    dfs(destination, visited);
                }
                r.add(destination);
            }
        }
    }
}
