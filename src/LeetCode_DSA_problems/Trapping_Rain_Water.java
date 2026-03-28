package LeetCode_DSA_problems;

import java.util.*;

// Leetcode : Problem 42
public class Trapping_Rain_Water {

        public static int trap(int[] height) {
            int left=0, right=height.length-1;
            int leftMax=height[left], rightMax=height[right];
            int water=0;

            while(left<right) {
                if(leftMax<rightMax) {
                    left++;
                    leftMax = Math.max(leftMax, height[left]);
                    water += leftMax-height[left];
                }   else{
                    right--;
                    rightMax = Math.max(rightMax, height[right]);
                    water += rightMax - height[right];
                }
            }

            return water;
        }

        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int [] height = new int[n];
            for(int i=0; i<n; i++) {
                height[i] = sc.nextInt();
            }

            System.out.println("Total Rain-Water trapped: "+trap(height)+" units.");
        }
}
