package TCS_DSA_PYQ.Mock_Tests.Day_05;
import java.util.*;

public class Max_Water_Contained {

    public static int maxW(int n, int[] arr) {
        int left = 0;
        int right = n - 1;
        int volume = 0;

        if (n < 2) {
            return 0;
        }

        while (left < right) {
            volume = Math.max(volume, (right - left) * Math.min(arr[left], arr[right]));

            if (left < right) {
                left++;
            } else {
                right--;
            }
        }

        return volume;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = maxW(n, arr);

        System.out.println(ans);
    }
}
