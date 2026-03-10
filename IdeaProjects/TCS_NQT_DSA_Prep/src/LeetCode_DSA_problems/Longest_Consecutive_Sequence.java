package LeetCode_DSA_problems;
import java.util.*;

public class Longest_Consecutive_Sequence {

    private int longConsecutiveSequence(int [] nums) {
        int longest = 0;
        Set<Integer> numSet = new HashSet<>();

        for(int a:nums) {
            numSet.add(a);
        }

        for(int a:numSet) {
            int length = 0;
            if(!numSet.contains(a-1)){
                while(numSet.contains(a+length)) {
                    length++;
                }

            }
            longest = Math.max(longest, length);
        }

        return longest;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "").trim();
        String [] tokens = input.split(",\\s*");
        int [] nums = new int[tokens.length];
        for(int i=0; i<tokens.length; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }

        Longest_Consecutive_Sequence ln = new Longest_Consecutive_Sequence();
        int ans = ln.longConsecutiveSequence(nums);
        System.out.println("Size Longest_Consecutive_Sequence is: " + ans);
    }
}
