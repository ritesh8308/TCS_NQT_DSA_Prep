package Input_Output;
import java.util.*;

public class Array_With_Braces {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter array in [1,2,3] format:");
            String input = sc.nextLine();

            // 1. Remove the brackets [ and ]
            input = input.replace("[", "").replace("]", "").trim();

// 2. Split using Regex: \\s*,\\s*
            String[] parts = input.split("\\s*,\\s*");

            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i].trim());
            }

            for(int a:nums) {
                System.out.print(a+ " ");
            }
            sc.close();
        }
    }
