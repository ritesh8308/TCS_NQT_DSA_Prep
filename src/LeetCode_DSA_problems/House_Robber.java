package LeetCode_DSA_problems;

// LeetCode : problem 198

public class House_Robber {
    public static int max_Robbery(int [] arr) {
        int prevRob = 0;
        int maxRob = 0;  // optimized with space complexity : O(1)

        for(int n:arr) {
            int temp = Math.max(maxRob, prevRob+n);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;
    }
}



/*** with DP but consumes extra space:O(n)
 *
 * class Solution {
 *     public int rob(int[] nums) {
 *         int n = nums.length;
 *
 *         if (n == 1) {
 *             return nums[0];
 *         }
 *
 *         int[] dp = new int[n];
 *
 *         dp[0] = nums[0];
 *         dp[1] = Math.max(nums[0], nums[1]);
 *
 *         for (int i = 2; i < n; i++) {
 *             dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
 *         }
 *
 *         return dp[n - 1];
 *     }
 * }
 * */
