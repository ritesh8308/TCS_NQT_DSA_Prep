package LeetCode_DSA_problems;
import java.util.*;
public class Rotten_Oranges {

    public int orangesRotting(int [][] grid) {

        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        //step1: get grid size
        int rows = grid.length;
        int cols = grid[0].length;

        // Step2: Queue to store rotten oranges in each layer/ per minute
        // FIFO property of Queue is used to perform BFS
        Queue<int []> queue = new LinkedList<>();

        // Step3: Count fresh oranges
        int freshCount = 0;

        // Step4: Add all rotten oranges to queue, count fresh ones
        for(int r=0; r<rows; r++) {
            for(int c=0; c<cols; c++) {

                // Rotten orange ----> add it to queue:
                if(grid[r][c] == 2){
                    queue.offer(new int[]{r, c});
                }

                // Fresh orange ----> increase count:
                else if(grid[r][c] == 1) {
                    freshCount++;
                }
            }
        }

        // Step5: Directions for moving up, down, left, right:
        int [][] directions = {
                {1, 0},   // down
                {-1, 0},  // up
                {0, 1},   // right
                {0, -1}   // left
        };

        // Step6: Track minutes passed:
        int minutes = 0;

        // Step7: BFS process implemetation:
        while(!queue.isEmpty() && freshCount > 0) {
            // processes all rotten oranges of the current minute
            int size = queue.size();

            for(int i=0; i<size; i++) {
                int [] pos = queue.poll(); // take first rooten orange in queue
                int row = pos[0];
                int col = pos[1];

                // check all 4 neighbors
                for(int [] d:directions) {
                    int newRow = row + d[0];
                    int newCol = col + d[1];

                    // If neighbour is inside gid and is fresh
                    if(newRow >= 0 && newRow < rows &&
                       newCol >= 0 && newCol < cols &&
                       grid[newRow][newCol] == 1) {

                        // Rot the fresh orange:
                        grid[newRow][newCol] = 2;
                        freshCount--;

                        //Add newly rotten orange to queue:
                        queue.offer(new int [] {newRow, newCol});
                    }
                }
            }

            // after finishing one layer ----> 1 minute passes:
            minutes++;

        }

        return freshCount==0 ? minutes : -1;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Input grid size:
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();


        int [][] grid = new int[rows][cols];

        // Input grid values:
        System.out.println("Enter grid values (0=empty, 1=fresh, 2=rotten): ");
        for(int r=0; r<rows; r++) {
            for(int c=0; c<cols; c++) {
                grid[r][c] = sc.nextInt();
            }
        }

        // call to function and print result:
        Rotten_Oranges rt = new Rotten_Oranges();
        int result = rt.orangesRotting(grid);
        System.out.println("Minutes until all oranges rot: " + result);
    }
}
