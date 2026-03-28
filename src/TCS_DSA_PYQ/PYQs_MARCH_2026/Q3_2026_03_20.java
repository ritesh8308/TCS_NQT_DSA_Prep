package TCS_DSA_PYQ.PYQs_MARCH_2026;
import java.util.*;

public class Q3_2026_03_20 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [][] pairs = new int[n][2];
        for(int i=0; i<n; i++) {
            pairs[i][0] = sc.nextInt(); // first element
            pairs[i][1] = sc.nextInt(); // second element
        }

        Arrays.sort(pairs, (a, b) -> {
            if(a[0] != b[0]) {
                return a[0] - b[0];
            }   else {
                return a[1] - b[1];
            }
                });

        for(int i=0; i<n; i++) {
            System.out.print(pairs[i][0] + " " + pairs[i][1]);
            if(i < n-1)     System.out.print(",");
        }
    }
}
