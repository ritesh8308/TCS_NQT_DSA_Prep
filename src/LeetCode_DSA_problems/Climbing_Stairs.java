package LeetCode_DSA_problems;
import java.util.*;

public class Climbing_Stairs {

    public static int climbStairs(int n) {

        if(n <= 3)  return n;
        int prev1 = 3;
        int prev2 = 2;
        int curr = 0;

        for(int i=3; i<n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int steps = climbStairs(n);
        System.out.println(steps);
    }
}
