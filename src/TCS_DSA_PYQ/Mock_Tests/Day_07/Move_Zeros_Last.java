package TCS_DSA_PYQ.Mock_Tests.Day_07;
import java.util.*;

// leetCode - 283
public class Move_Zeros_Last {

    public static int [] updateNums(int [] nums) {
        int left = 0;

        for(int right=0; right<nums.length; right++) {

            if(nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                left++;
            }
        }

        return nums;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        int [] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        int [] ans = updateNums(nums);
        for(int a:nums) {
            System.out.print(a + " ");
        }

        sc.close();
    }
}
