package TCS_DSA_PYQ.Mock_Tests.Day_02;
import java.util.*;

public class Kids_With_Greatest_Candies {

    public static List<Boolean> kids_Greatest_Candies(int [] arr, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();

        int max = 0;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i=0; i<n; i++) {
            if((arr[i]+extraCandies) >= max) {
                ans.add(true);
            }   else {
                ans.add(false);
            }
        }

        return ans;
    }
    public static void main(String  [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter extra candies (0-100):");
        int extraCandies = sc.nextInt();

// Validation loop
        while (extraCandies < 0 || extraCandies > 100) {
            System.out.println("Invalid input! Please enter a value between 0 and 100:");
            extraCandies = sc.nextInt();
        }
        System.out.println("Enter the number of Students: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter number of chocolates each student has: ");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Boolean> op = kids_Greatest_Candies(arr, extraCandies);
        System.out.println(op);
    }
}
