/**
 * Problem Statement
 * Q2. Given a weighted graph with n vertices and m edges,
 * find the shortest distance between two specified vertices.
 * Print the shortest path and the total distance.
 *
 * Input Format
 * The first line contains two integers n (number of vertices) and m (number of edges).
 *
 * The next m lines contain three integers u, v, and w — representing
 * an edge from vertex u to vertex v with weight w.
 *
 * The last line contains two integers src and dest, representing the source and destination vertices.
 *
 * Output Format
 * 1)Print the shortest path as a sequence of vertices.
 * 2)Print the total distance.
 * */


package TCS_DSA_PYQ.PYQs_MARCH_2025.Dated_20_03_2025;
import java.util.*;

public class Shift_I_Q2 {

    static class Pair implements Comparable<Pair> {
        int vertex, weight;

        Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }


        // Min priority queue logic:
        @Override
        public int compareTo(Pair other) {
            return this.weight - other.weight;
        }
    }


    // Dijkstra's Algorithm to calculate dist[] of all nodes from source:s
    public static int [] dijkstra(int n, ArrayList<ArrayList<Pair>> adj, int s, int [] parent) {
        int [] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(s, 0));

        while(!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.vertex;
            int d = current.weight;

            if(d > dist[u])     continue;
            for(Pair neighbour:adj.get(u)) {
                if( (dist[u] + neighbour.weight) < dist[neighbour.vertex] ) {
                    dist[neighbour.vertex] = dist[u] + neighbour.weight;
                    parent[neighbour.vertex] = u;
                    pq.add(new Pair(neighbour.vertex, dist[neighbour.vertex]));
                }
            }
        }
        return dist;
    }

    // Print path traversed:
    static void printPath(int node, int [] parent, int d) {
        if(node == -1)   return;
        printPath(parent[node], parent, d);
        if(node == d) {
            System.out.print(node);
        }else {
            System.out.print(node + " --> ");
        }
    }


    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++)  adj.add(new ArrayList<>());
        for(int i=0; i<m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));  // for Undirected Graph
        }

        int s = sc.nextInt();  // Source
        int d = sc.nextInt();  // Destination

        int [] parent = new int[n+1];
        Arrays.fill(parent, -1);


        int [] dist = dijkstra(n, adj, s, parent);

        if(dist[d] == Integer.MAX_VALUE) {
            System.out.println(-1);
        }   else{
            printPath(d, parent, d);
            System.out.println();
            System.out.println("\n Distance: " + dist[d]);
        }

        sc.close();
    }
}
