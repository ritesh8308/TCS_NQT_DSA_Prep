/**
 *
 *
 * Q1. Problem Statement: Warehouse Arrangement Problem
 * In a warehouse, boxes are placed in a row and each box has a number printed on it. The current arrangement of boxes is represented by an integer array nums.
 * The warehouse manager wants to rearrange the boxes to create the next arrangement in dictionary order (lexicographically greater order). If we list all possible arrangements of the boxes in sorted order, the manager wants the arrangement that comes immediately after the current one.
 * However:
 * If the current arrangement is already the largest possible order, the boxes should be rearranged into the smallest possible order (ascending order).
 * The rearrangement must be done:
 * Directly on the original array
 * Using constant extra memory
 * Input Format
 * First line contains an integer n representing the size of the array.
 * Second line contains n space-separated integers representing the array elements.
 * Output Format
 * the array as space-separated integers.
 * Here is the text from the image you can use as a message:
 *
 * > *Description:* Print the next permutation of the array as space-separated integers.
 *
 *
 *
 *
 * *Example:*
 *     - *Input:*
 * 3
 * 1 2 3
 *     - *Output:*
 * 1 3 2
 *
 *
 *
 *
 *
 * *Sample test cases:*
 *
 * > | Input | Expected output |
 * | ----- | --------------- |
 *
 * | 3
 * 1 2 3 | 1 3 2           |
 * | 3
 * 3 2 1 | 1 2 3           |
 * | 3
 * 1 1 5 | 1 5 1           |
 *
 *
 * */


package TCS_DSA_PYQ.Mock_Tests.Day_11;
import java.util.*;

public class Next_Permutation {
        public static void nextPermutation(int[] nums) {
            int i = nums.length - 2;
            while (i >= 0 && nums[i] >= nums[i + 1]) {
                i--;
            }

            if (i >= 0) {
                int j = nums.length - 1;
                while (j >= 0 && nums[j] <= nums[i]) {
                    j--;
                }
                swap(nums, i, j);
            }

            reverse(nums, i + 1);
        }


        public static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }


        public static void reverse(int[] nums, int start) {
            int left = start;
            int right = nums.length - 1;
            while (left < right) {
                swap(nums, left, right);
                left++;
                right--;
            }
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            nextPermutation(arr);

            for (int a : arr) {
                System.out.print(a + " ");
            }

            sc.close();
        }
}

