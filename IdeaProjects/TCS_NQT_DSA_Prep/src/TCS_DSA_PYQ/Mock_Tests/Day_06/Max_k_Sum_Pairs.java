package TCS_DSA_PYQ.Mock_Tests.Day_06;
import java.util.*;

public class Max_k_Sum_Pairs {

    public static int kSumPairs(int [] nums, int k) {
        Arrays.sort(nums);
        int left=0, right=nums.length-1;
        int count = 0;
        int sum = 0;
        while(left < right) {
            sum = nums[left] + nums[right];

            if(sum == k) {
                count++;
                left++;
                right--;
            }   else if(sum > k) {
                right--;
            }   else {
                left++;
            }
        }

        return count;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] =  sc.nextInt();
        }

        int ans = kSumPairs(nums, k);
       System.out.println(ans);
        sc.close();
    }
}

