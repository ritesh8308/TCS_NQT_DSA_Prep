package Array;
import java.util.*;

public class Moors_Voting_Algorithm {


    /** BRUTE FORCE APPROACH: O(n^2)
     *
     * public static int majority_Element(int [] arr) {
     *     int n = arr.length;
     *     int majority = -1;
     *
     *     for(int i=0; i<n; i++) {
     *     int cnt = 0;
     *
     *     for(int j=0; j<n; j++) {
     *         if(arr[i] == arr[j]) {
     *             cnt++;
     *         }
     *         }
     *         if(cnt > (n/2)) {
     *             return arr[i];
     *         }
     *     }
     *     return -1;
     * }
     * */


    // Moore's Voting Algorithm: O(2n)

    public static int majority_Element(int [] arr) {
        int n = arr.length;
        int cnt = 0;
        int ele = 0;

        for(int i=0; i<n; i++) {
            if(cnt == 0) {
                ele = arr[i];
                cnt = 1;
            }
            else if(ele == arr[i]) {
                cnt++;
            }
            else {
                cnt--;
            }
        }

        // Double check most predictable value:
        int cnt2 = 0;

        for(int i=0; i<n; i++) {
            if(ele == arr[i]) {
                cnt2++;
            }
        }

        if(cnt2 > (n/2) ) {
            return ele;
        }
        return -1;
    }
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = majority_Element(arr);
        System.out.println(ans);
    }
}



