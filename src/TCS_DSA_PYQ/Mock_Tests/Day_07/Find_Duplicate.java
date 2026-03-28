package TCS_DSA_PYQ.Mock_Tests.Day_07;
import java.util.*;

// leetCode - 287
public class Find_Duplicate {

    // Floyd's Tortiose and Hair Algorigthm:

    public static int repeatedNum(int [] nums) {
        int slow = nums[0];
        int fast = nums[0];

        while(true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast) {
                break;
            }
        }

        int slow2 = nums[0];

        while(slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return slow2;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int [] nums = new int[n];

        for(int i=0; i<n; i++) {
            int x = sc.nextInt();

            if(x < n) {
                nums[i] = x;
            }
        }

        int ans = repeatedNum(nums);

        System.out.println(ans);

    }
}
