package LeetCode_DSA_problems;
// leetcode : proble 560
import java.util.*;

public class Subarray_Sum_Equals_K {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> subNum = new HashMap<>();
            subNum.put(0,1);
            int total=0, count=0;

            for(int n:nums) {
                total += n;

                if(subNum.containsKey(total - k)) {
                    count += subNum.get(total-k);
                }

                subNum.put(total, subNum.getOrDefault(total, 0) + 1);
            }
            return count;
        }
    }
}
