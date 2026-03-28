package TCS_DSA_PYQ.Mock_Tests.Day_06;
import java.util.*;

public class Maximum_Average_Subarray_I {

    public static double maxAvgSubArray(int [] nums, int k) {
        int sum=0;
        for(int i=0; i<k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        int startIndex = 0;
        int endIndex = k;

        while(endIndex < nums.length) {
            sum -= nums[startIndex];
            startIndex++;

            sum += nums[endIndex];
            endIndex++;

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum/k;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "");
        String [] tokens = input.trim().split("\\s*,\\s*");
        int [] nums = new int[tokens.length];
        for(int i=0; i< tokens.length; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }

        double ans = maxAvgSubArray(nums, k);
        System.out.println(ans);
    }
}
