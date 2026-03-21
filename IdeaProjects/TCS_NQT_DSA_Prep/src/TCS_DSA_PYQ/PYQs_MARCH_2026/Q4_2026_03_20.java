package TCS_DSA_PYQ.PYQs_MARCH_2026;
import java.util.*;



// Step 1: Define what a "Road" looks like
class Road implements Comparable<Road> {
    int u, v, cost;

    Road(int u, int v, int cost) {
        this.u = u;
        this.v = v;
        this.cost = cost;
    }

    // This tells Java how to sort Roads (by cost)
    @Override
    public int compareTo(Road other) {
        return this.cost - other.cost;
    }
}




public class Q4_2026_03_20 {

        static int[] parent; // Our "Clan" tracker

        // The 'find' function with a shortcut (Path Compression)
        static int find(int i) {
            if (parent[i] == i) return i;
            // Path Compression: Make the search faster next time
            return parent[i] = find(parent[i]);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input: N cities, M roads
            int n = sc.nextInt();
            int m = sc.nextInt();

            List<Road> roadList = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                roadList.add(new Road(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            }

            // 1. SORT roads by cost (Cheapest first!)
            Collections.sort(roadList);

            // 2. INITIALIZE Clans (Everyone starts in their own clan)
            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }

            long totalMinCost = 0;
            int roadsBuilt = 0;

            // 3. TRY to build each road
            for (Road road : roadList) {
                int rootU = find(road.u);
                int rootV = find(road.v);

                // If they are in DIFFERENT clans, connect them!
                if (rootU != rootV) {
                    parent[rootU] = rootV; // Merge clans
                    totalMinCost += road.cost;
                    roadsBuilt++;
                }
            }

            // 4. CHECK: To connect N cities, you need exactly N-1 roads.
            if (roadsBuilt == n - 1) {
                System.out.println(totalMinCost);
            } else {
                // Not all cities could be reached
                System.out.println("-1");
            }

            sc.close();
        }
    }
