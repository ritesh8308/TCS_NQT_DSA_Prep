package LeetCode_DSA_problems;
import java.util.*;
import java.io.*;


public class Course_Schedule {

    public boolean canFinish(int numCourses, int [][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> sequence = new ArrayList<>();

        for(int i=0; i<numCourses; i++)     adj.add(new ArrayList<>());

        int [] indegree = new int[numCourses];
        for(int [] pre:prerequisites) {
            adj.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++) {
            if(indegree[i] == 0)    q.add(i);
        }

        int count = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            sequence.add(node);
            count++;

            for(int next:adj.get(node)) {
                indegree[next]--;
                if(indegree[next] == 0)     q.add(next);
            }
        }

        if (count == numCourses) {
            System.out.println("Course Completion Sequence: " + sequence);
            return true;
        } else {
            System.out.println("Cycle detected! Cannot complete all courses.");
            return false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of courses: ");
        int numCourses = Integer.parseInt(br.readLine());

        System.out.print("Enter number of prerequisite pairs: ");
        int numPairs = Integer.parseInt(br.readLine());

        int[][] prerequisites = new int[numPairs][2];
        System.out.println("Enter pairs (e.g., '0 1' means course 1 is a pre-req for 0):");
        for (int i = 0; i < numPairs; i++) {
            String[] input = br.readLine().split("\\s+");
            prerequisites[i][0] = Integer.parseInt(input[0]);
            prerequisites[i][1] = Integer.parseInt(input[1]);
        }

        Course_Schedule solver = new Course_Schedule();
        boolean result = solver.canFinish(numCourses, prerequisites);
        System.out.println("Can finish all courses? " + result);
    }
}
