package TCS_DSA_PYQ.PYQs_MARCH_2026;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Count_sumElements_for_MAX {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int lim = arr[n-1];
        int count = 0;
        int currentSum = 0;

        for(int i=0; i<n-1; i++) {  // don't consider lim value;
            if(currentSum + arr[i] <= lim) {
                currentSum += arr[i];
                count++;
            }   else{
                break;
            }
        }
        System.out.println(count+1);  // Need to also add lim_count as Maximum count is to be found:
        sc.close();
    }
}
