/**
 * Question 1: Sum of Integers in a RangeProblem
 * Statement:You are given two integers, i and j.
 * Your task is to calculate and print the sum of all integers from i to j, inclusive.
 *
 * Input Format:Two integers representing the start (i) and end (j) of the range.
 *
 * Example:Input: i = 1, j = 5
 * Calculation: $1 + 2 + 3 + 4 + 5 = 15
 * $Output: 15
 * */

package TCS_DSA_PYQ.PYQs_MARCH_2025.Dated_15_03_2025;
import java.util.*;

public class Q1_15_03_2025 {

    public static int totalSum(int i, int j) {
        return ((j*(j+1))/2) - (((i-1)*i)/2);
    }

public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int j = sc.nextInt();
    int ans = totalSum(i, j);
    System.out.println(ans);

    sc.close();
   }
}
