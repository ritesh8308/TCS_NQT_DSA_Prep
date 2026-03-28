package LeetCode_DSA_problems;
import java.util.*;

// LeetCode : problem 45

public class Jump_Game {
    public static boolean jGame(int [] arr) {
        int goal = arr.length-1;

        for(int i=arr.length-2; i>=0; i--) {
            if(i+arr[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = jGame(arr);
        System.out.println(ans);
    }
}
