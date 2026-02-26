package TCS_DSA_PYQ;
import java.util.*;

public class First_and_Second_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        // Edge case if array size is less than 2, Second Smallest can't exist
        if (n < 2) {
            System.out.println("-1");
            return;
        }

        int first_Smallest = Integer.MAX_VALUE;
        int second_Smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();


            // 1. found a new smallest?
            // The old smallest drops down to become the second smallest.
            if (current < first_Smallest) {
                second_Smallest = first_Smallest;
                first_Smallest = current;
            }


            // 2. Found a number between first_Smallest and second_Smallest?
            // Also ensure it's not a duplicate of 'first_Smallest'.
            else if (second_Smallest < current && current != first_Smallest) {
                second_Smallest = current;
            }
        }


        // Final check: if 'second_Smallest' was never updated, all elements were the same.
        if (second_Smallest == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(first_Smallest + " " + second_Smallest);
        }
        sc.close();
    }

}

