package LeetCode_DSA_problems;
import java.util.*;

// leetCode: Problem 45

public class Jump_Game_II {

    public static int jGame(int [] arr) {
        int jumps=0, end=0, farthest=0;

        for(int i=0; i<arr.length-1; i++) {
            farthest = Math.max(farthest, i+arr[i]);

            if(i == end) {
                jumps++;
                end = farthest;
            }
        }

        return jumps;
    }



//    public int jump(int[] nums) {
//        int near=0, far=0, jumps=0;
//
//        while(far < nums.length-1) {
//            int farthest = 0;
//
//            for(int i=near; i<=far; i++) {
//                farthest = Math.max(farthest, i+nums[i]);
//            }
//
//            near = far+1;
//            far = farthest;
//            jumps++;
//        }
//
//        return jumps;
//    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int jumps = jGame(arr);
        System.out.println("the number of minimum jumps required to reach index " + (n-1) + "are: " + jumps);
    }
}
