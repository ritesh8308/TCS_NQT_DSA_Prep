package LeetCode_DSA_problems;
import java.util.*;

public class Next_Permutation {

    private static void swap(int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    private static void reverse(int [] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }


    private static void nextPermutation(int [] nums) {



        int n = nums.length;
        int i = n-2;

        while(i>=0 && nums[i] >= nums[i+1]) {
            i--;
        }

        int j=n-1;
        if(i>=0) {
            while(i<j && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i+1, n-1);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "").trim();
        String [] tokens = input.split(",\\s*");
        int [] nums = new int[tokens.length];
        for(int i=0; i< tokens.length; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }

        nextPermutation(nums);
        for(int a:nums) {
            System.out.print(a + " ");
        }
    }
}
