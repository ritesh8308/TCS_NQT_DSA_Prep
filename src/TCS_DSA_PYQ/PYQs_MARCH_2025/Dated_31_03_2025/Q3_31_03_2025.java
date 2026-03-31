/**
 * Problem Statement: Q3 (Subset Sum Problem)
 * Task: You are given an array of integers and a target sum h.
 * Determine whether any subset of the given numbers can sum up to h.
 * If a valid subset exists, print "Yes"; otherwise, print "No".
 *
 * Input:
 * Number of elements: 4
 * Elements: 3 5 7 2
 * Target sum (h): 10
 *
 * Output: Yes
 *
 * Explanation: The subset {3, 7} sums to 10.
 * */

// DP_Apparoach:
//package TCS_DSA_PYQ.PYQs_MARCH_2025.Dated_31_03_2025;
//import java.util.*;
//
//public class Q3_30_03_2025 {
//
//
//    public static  String doSubsetExists(int[] arr, int tSum) {
//        int n = arr.length;
//        boolean[][] dp = new boolean[n + 1][tSum + 1];
//
//        // Base case: sum 0 is always possible
//        for (int i = 0; i <= n; i++) {
//            dp[i][0] = true;
//        }
//
//        // Fill DP table
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= tSum; j++) {
//                // Exclude current element
//                dp[i][j] = dp[i - 1][j];
//
//                // Include current element if possible
//                if (j >= arr[i - 1]) {
//                    dp[i][j] = dp[i][j] || dp[i - 1][j - arr[i - 1]];
//                }
//            }
//        }
//
//        return dp[n][tSum] ? "Yes":"No";
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int tSum = sc.nextInt();
//
//        System.out.println(doSubsetExists(arr, tSum));
//
//        sc.close();
//    }
//}
//





// Recursion Approach:
package TCS_DSA_PYQ.PYQs_MARCH_2025.Dated_31_03_2025;
import java.util.*;

public class Q3_31_03_2025 {

    public static boolean isSubsetSum(int[] arr, int n, int tSum) {
        if(tSum == 0)   return true;
        if(n == 0)  return false;
        if(arr[n-1] > tSum) {

            return isSubsetSum(arr, n-1, tSum);
        }

        return (isSubsetSum(arr, n-1, tSum) || isSubsetSum(arr, n-1, tSum-arr[n-1]));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int tSum = sc.nextInt();

        if(isSubsetSum(arr, n, tSum)) {
            System.out.println("Yes.");
        }else {
            System.out.println("No");
        }

        sc.close();
    }
}
