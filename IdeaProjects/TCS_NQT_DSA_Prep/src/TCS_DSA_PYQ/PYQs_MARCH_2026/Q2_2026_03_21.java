/**
 * Question 2: Soldier Arrangement (Shift 1)
 * This is a medium-level question requiring recursion and dynamic programming to find all possible arrangements where no two adjacent soldiers are the same.
 *
 * Input: Total soldiers ($n$), range of soldiers ($r$), ending soldier ($e$), and start soldier (always 1).
 * Constraints: No two adjacent elements can be the same.
 * Solution (4:28-16:34): The solution uses a recursive function (countNames) to explore all valid arrangements. To avoid Time Limit Exceeded (TLE) errors, memoization (storing results in a DP table) is used to optimize the process.
 * */

package TCS_DSA_PYQ.PYQs_MARCH_2026;
import java.util.*;

public class Q2_2026_03_21 {

    static int [][] dp;  // Memoization with DP

    // Recursion:
    public static int countNames(int pos, int l, int n, int r, int e) {

        // Base Case:
        if(pos == n) {
            return (l == e) ? 1 : 0;
        }

        // DP : Memory Optimization to reduce TLE error : chaecks wether case already checked
        if(dp[pos][l] != -1) {
            return dp[pos][l];
        }

        int total = 0;
        for(int s=1; s<=r; s++) {
            if(s != l) {
                total += countNames(pos+1, s, n, r, e);
            }
        }

        dp[pos][l] = total;

        return total;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // total number of soldiers
        int r = sc.nextInt(); // Index ranges for soldiers
        int end = sc.nextInt(); // ending must be 'e'

        dp = new int[n+1][r+1];
        for(int i=0; i<n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans = countNames(1, 1, n, r, end);
        System.out.println(ans);
        sc.close();
    }
}
