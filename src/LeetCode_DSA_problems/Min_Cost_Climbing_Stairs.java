package LeetCode_DSA_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Min_Cost_Climbing_Stairs {

    public static int minCost(int [] cost) {
        int n = cost.length;
        int [] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2; i<n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-2], dp[i-1]);
        }

        return Math.min(dp[n-2], dp[n-1]);
    }

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String [] tokens = input.split(" ");

        int [] cost = new int[tokens.length];
        for(int i=0; i< tokens.length; i++) {
            cost[i] = Integer.parseInt(tokens[i]);
        }

        int ans = minCost(cost);
        System.out.println(ans);
        //System.out.println();
    }
}
