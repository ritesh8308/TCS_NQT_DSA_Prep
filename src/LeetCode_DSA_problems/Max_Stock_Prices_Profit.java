package LeetCode_DSA_problems;

// LeetCode : problem 121
import java.util.Scanner;

public class Max_Stock_Prices_Profit {

    public static int []  max_Profit(int [] nums) {
        int [] arr = new int[2];
        int buy = nums[0];
        arr[0] = 0;
        int maxP = 0;
        for(int i=1; i<nums.length; i++) {
            if(buy > nums[i])   {
                buy = nums[i];
                arr[0] = i;
            }
            maxP = Math.max(maxP, nums[i]-buy);
        }
        arr[1] = maxP;
        if(maxP == 0)  arr[0] = 0;

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array in [1,2,3] format:");
        String input = sc.nextLine();

        // 1. Remove the brackets [ and ]
        input = input.replace("[", "").replace("]", "").trim();

        // 2. Split using Regex: \\s*,\\s*
        String[] parts = input.trim().split("\\s*,\\s*");

        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }

        int [] array = new int[2];
        array = max_Profit(nums);
        int d = array[0];
        int profit = array[1];
        System.out.println("On day: "+ (d+1) +" ,We have maximum profit of: Rs"+profit);
        sc.close();
    }
}
