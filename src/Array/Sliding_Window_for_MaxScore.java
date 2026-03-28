package Array;
// import java.util.*;


/**
 *
 * Examples:
 * Input: cardScore = [1, 2, 3, 4, 5, 6], k = 3
 *Output: 15
 *Explanation: Choosing the rightmost cards will maximize your total score. So optimal cards chosen are the rightmost three cards 4, 5, 6.
 *The score is 4 + 5 + 6 => 15.
*/
public class Sliding_Window_for_MaxScore {
    public static int maxScore(int [] cardScore, int k) {
        int lSum = 0, rSum = 0, maxSum = 0;
        for(int i=0; i<k; i++) {
            lSum += cardScore[i];
            maxSum = lSum;
        }

        int rightIndex = cardScore.length - 1;

        for(int i=k-1; i>=0; i--) {
            lSum -= cardScore[i];
            rSum += cardScore[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, (lSum+rSum));
        }
        return maxSum;
    }

    public static void main(String [] args) {
        int [] nums = {1, 2, 3, 4, 5, 6};
        int result = maxScore(nums, 3);

        System.out.println("The maximum score is: " + result);

    }
}
