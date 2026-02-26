package Array;
import java.util.*;

public class Consecutive_Max1 {
    public static int Max1(int [] arr) {
        int n = arr.length;
        int max1 = 0;
        int cnt = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] == 1) {
                cnt++;

                /* Edge Case : Logic 02 : for (n-1): last element
                if(i == n-1) {
                max1 = Math.max(max1, cnt);
                }
                 **/
            }
            else {
                max1 = Math.max(max1, cnt);
                cnt = 0;
            }
        }

       // Edge Case : Logic 01 : for (n-1): last element
       max1 = Math.max(max1, cnt);
        return max1;

    }


    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        sc.nextLine();

        String [] number = sc.nextLine().split(" ");

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(number[i]);
        }

        int ans = Max1(arr);
        System.out.println("Max Consecutive occurrence of 1's: " + ans);
    }
}
